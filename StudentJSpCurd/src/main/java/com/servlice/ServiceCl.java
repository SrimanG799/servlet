package com.servlice;

import java.util.List;

import com.model.Student;

public interface ServiceCl {
	
	public List<Student> getAll();

 void	insert(Student student);
 
 void update(Student student);
 
}
