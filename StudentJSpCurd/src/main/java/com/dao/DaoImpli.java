package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.Student;
import com.util.UtilConnect;

public class DaoImpli implements DaoCla{

	public List<Student> getAll() {
		
		List<Student> student=new ArrayList<Student>();
		Connection connection=null;
		PreparedStatement pst=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			connection=UtilConnect.getConnection();
			pst=connection.prepareStatement("select*from student");
			
			rs=pst.executeQuery();
			while(rs.next())
			{
				Student stu=new Student();
				stu.setRoll(rs.getInt("roll"));
				stu.setName(rs.getString("name"));
				stu.setCourse(rs.getString("course"));
				stu.setLocation(rs.getString("loacation"));
				student.add(stu);
				
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return student;
	}
	
	
	
	
	

	public void insert(Student student) {
		Connection connection=null;
		PreparedStatement pst=null;
		
		try{
			connection=UtilConnect.getConnection();
			pst=connection.prepareStatement("insert into student values(?,?,?,?)");
			pst.setInt(1,student.getRoll());
			pst.setString(2,student.getName());
			pst.setString(3,student.getCourse());
			pst.setString(4,student.getLocation());
		int i=pst.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	
	
		
	}






	public void update(Student student) {
		Connection connection=null;
		PreparedStatement pst=null;
		try {
			
			connection=UtilConnect.getConnection();
			pst=connection.prepareStatement("update student set name=?,course=?,loacation=? where roll=?;");
			pst.setString(1,student.getName());
			pst.setString(2,student.getCourse());
			pst.setString(3,student.getLocation());
			pst.setInt(4,student.getRoll());
			pst.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
