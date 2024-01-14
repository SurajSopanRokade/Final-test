package com.aprileclipse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MyConnection{
	public Connection connection1() throws ClassNotFoundException, SQLException {
		Connection con=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankingapriltest", "root", "root");
		return con;
		
		
	}
	public void createMap() throws ClassNotFoundException, SQLException {
		//9. Create a collection to store acctype as key and value as list of all customers with 
		//respective acctype for bank name HDFC(without using joins)[2M]
		Connection con=connection1();
		String sql1="SELECT acctype FROM accounttype";
				
		Statement stacct = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rsacct = stacct.executeQuery(sql1);
		
		String sql="SELECT t.acctype, u.* \r\n"
				+ "FROM bank b, customer c, accounts a, accounttype t, customer_master u\r\n"
				+ "WHERE b.bankid=c.bank_id AND c.cust_id=a.cust_id AND a.acctype_id=t.acctype_id AND u.cust_id=c.cust_id AND  b.name='ABC Bank';";
				
		Statement stcust = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rscust = stcust.executeQuery(sql);
		String str=null;
		HashMap<String, ArrayList<Cust_master>> map = new HashMap<>();
		while(rsacct.next()) {
			str=rsacct.getString(1);
			ArrayList<Cust_master> list = new ArrayList<>();
			rscust.beforeFirst();
			while(rscust.next()) {
				if(rscust.getString(1).equals(str)) {
				Cust_master c = new Cust_master(rscust.getInt(2), rscust.getString(3), rscust.getString(4), rscust.getInt(5), rscust.getString(6));
				list.add(c);
				}
			}
			map.put(str, list);	
		}
		Set<Entry<String, ArrayList<Cust_master>>> set = map.entrySet();
		Iterator<Entry<String, ArrayList<Cust_master>>> itr = set.iterator();
		while(itr.hasNext()) {
			Entry<String, ArrayList<Cust_master>> ent = itr.next();
			System.out.println("Acctype : "+ent.getKey());
			ArrayList<Cust_master> list=ent.getValue();
			Iterator<Cust_master> itr1=list.iterator();
			while(itr1.hasNext()) {
				System.out.println("Cust info : "+itr1.next());
			}
		}
		
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		MyConnection m = new MyConnection();
		m.createMap();
	}

}
