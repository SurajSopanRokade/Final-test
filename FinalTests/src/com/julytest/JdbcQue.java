package com.julytest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.aprileclipse.Residenceaddr;

/*
 * f.	Write a jdbc program to create a map which has VoterAadhar as key and Residence address as  value. Do not use any joins in the query while selecting data. 
Also update Voting Area to ‘Nanded City’ where pincode is 411048.

 */
public class JdbcQue {
	public Connection connection1() throws ClassNotFoundException, SQLException {
		Connection con = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/voterinfo","root","root");
		return con;		
	}
	public void createMap() throws ClassNotFoundException, SQLException {
		Connection con=connection1();
		String sql="SELECT vaadhar, r.*  FROM voter v, residenceaddress r WHERE v.vaddressid=r.vaddressid";
		Statement vst = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet vrs = vst.executeQuery(sql);
		
		HashMap<String, Residenceaddr > map = new HashMap<>();
		while(vrs.next()) {
			String str=vrs.getString(1);
			Residenceaddr r = new Residenceaddr(vrs.getInt(2), vrs.getString(3), vrs.getString(4), vrs.getString(5), vrs.getString(6), vrs.getString(7), vrs.getString(8));
			map.put(str, r);
		}
		Set<Entry<String, Residenceaddr>> set = map.entrySet();
		Iterator<Entry<String, Residenceaddr>> itr = set.iterator();
		while(itr.hasNext()) {
			Entry<String, Residenceaddr> ent = itr.next();
			String s = ent.getKey();
			System.out.println("vaadhar_id : "+s);
			System.out.println("Residenceadd : "+ent.getValue());
		}
		
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		JdbcQue j = new JdbcQue();
		j.createMap();
	}

}
