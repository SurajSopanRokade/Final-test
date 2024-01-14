package com.julyWritten;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//1.	Write a code to create ResultSet to display VoterID,VoterName,BoothArea,BoothID with 
//any random order and direction. Also update underlying table of the ResultSet  in such a 
//way that ,  name of given VoterID should be changed to new name  given, through updatable 
//ResultSet.                                 
public class Que23 {
	public Connection connection1() throws ClassNotFoundException, SQLException {
		Connection con=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/voterinfo","root","root");
		return con;
	}
	public void display() throws ClassNotFoundException, SQLException {
		Connection con = connection1();
		String sql="SELECT v.VoterID,v.VoterName,b.BoothArea,b.BoothID FROM voter v  "
				+ " INNER JOIN votingmapper m ON (v.voterid=m.voterid) "
				+ " INNER JOIN boothdetails b ON (m.boothid=b.boothid)";
				
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			System.out.print(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+"\n");
		}
		
	}
	public void updateTable() throws ClassNotFoundException, SQLException {
		Connection con = connection1();
		String sql1="UPDATE voter SET votername='Suraj Rokade' WHERE voterid=?";
		PreparedStatement st1 = con.prepareCall(sql1);
		st1.setInt(1, 9);
		int rs1=st1.executeUpdate();
		System.out.println(rs1);
	}
	public void updateTUsingcallable() throws ClassNotFoundException, SQLException {
		Connection con = connection1();
		String sql="UPDATE voter SET votername='Abhishek Rai' WHERE voterid=?";
		CallableStatement cs = con.prepareCall(sql);
		cs.setInt(1, 9);
		int rs = cs.executeUpdate();
		System.out.println(rs);
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Que23 q1 = new Que23();
	//	q1.display();
	//	q1.updateTable();
		q1.updateTUsingcallable();
	}

}
