package com.dao;

import java.util.List;

import com.model.Student;

public interface DaoCla {
	
	public List<Student> getAll();
	
	
	void insert(Student student);
	
	void update(Student student);

}
