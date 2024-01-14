package com.novtesteclipse;

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
import java.util.TreeMap;
/*
 * g.Write a jdbc program to create a map which has Flatno as key and Owner details as  
 * value. Do not use any joins in the query while selecting data. 
Map Should be in descending order of Flat no

 */
public class JDBCQue  {
	public JDBCQue() {
		// TODO Auto-generated constructor stub
		String str;
	}
	public Connection connection1() throws ClassNotFoundException, SQLException {
		Connection con=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flatinfo","root","root");
		return con;
		
	}
	public void createMap() throws ClassNotFoundException, SQLException {
		Connection con = connection1();
		String sql="SELECT * FROM owners";
		Statement stown = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rsown = stown.executeQuery(sql);
		
		String sql1="SELECT * FROM flats";
		Statement stflat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rsflat = stflat.executeQuery(sql1);
		HashMap<String, ArrayList<OwnerDetails>> map = new HashMap<>();
		String str;
		while(rsflat.next()) {
			int a =rsflat.getInt(3);
			str = rsflat.getString(1);
			ArrayList<OwnerDetails> list = new ArrayList<>();
			rsown.beforeFirst();
			System.out.println(a);
			while(rsown.next()) {
				if(a==rsown.getInt(1)) {
					OwnerDetails o = new OwnerDetails(rsown.getInt(1), rsown.getString(2), rsown.getString(3), rsown.getString(4));
					list.add(o);
				}
			}
			map.put(str, list);
		}
		TreeMap<String, ArrayList<OwnerDetails>> tmap = new TreeMap<>(map);
		Set<Entry<String, ArrayList<OwnerDetails>>> set = tmap.entrySet();
		Iterator<Entry<String, ArrayList<OwnerDetails>>> itr = set.iterator();
		while(itr.hasNext()) {
			Entry<String, ArrayList<OwnerDetails>> ent =itr.next();
			System.out.println("flat no : "+ ent.getKey());
			System.out.println("Owner details : "+ent.getValue());
		}
		
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		JDBCQue j = new JDBCQue();
		j.createMap();
	}
	

}
