package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;


public class UtilConnect {
	
	
	public static Connection conn=null;
	public static Properties prop=null;
	public static Statement stmt=null;
	public static ResultSet rst=null;
	public static PreparedStatement pstm=null;
	static {
		try {
			
		
		prop=new Properties();
		prop.load(UtilConnect.class.getClassLoader().getResourceAsStream("db.properties"));
		Class.forName(prop.getProperty("driver"));
		conn=DriverManager.getConnection(prop.getProperty("url"),prop.getProperty("userName"),prop.getProperty("password"));
		
	}
		catch (Exception e) {
		e.printStackTrace();
		
		}

}
	public static Connection getConnection()
	{
		return conn;
	}
	
	
	
	public static void closeConnection()
	{
		try {
			conn.close();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
			
		}
	public static void closeConnection(Statement stmt)
	{
		try {
			stmt.close();
			conn.close();
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	
		
	}
	
	public static void closeConnection(Statement stmt,ResultSet rst)
	{
		try {
			if(rst!=null)
			{
				closeConnection(stmt);
				rst.close();
				
				
			}
		}catch (Exception e) {
		e.printStackTrace();
		}
	}
	
	
	public static void closeConnection(Statement stmt,ResultSet rst,PreparedStatement pstm)
	{
		try {
			if(pstm!=null)
			{
			pstm.close();
			closeConnection(stmt, rst);
			
		}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		
	}
	public static void main(String[] args) {
		System.out.println(UtilConnect.conn);
	}
	
	
	
}



