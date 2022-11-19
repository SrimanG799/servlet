package com.servlice;

import java.util.List;

import com.dao.DaoImpli;
import com.model.Student;

public class ServiceImpli implements ServiceCl {
	DaoImpli daoi=new DaoImpli();
	public List<Student> getAll(){
		return daoi.getAll();
	}
	public void insert(Student student) {
		daoi.insert(student);
	}
	public void update(Student student) {
		// TODO Auto-generated method stub
		daoi.update(student);
	}

}
