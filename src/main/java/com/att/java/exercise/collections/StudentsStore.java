package com.att.java.exercise.collections;

import java.util.List;

public interface StudentsStore {
	
	/**
	 * Adds NEW Student. If already exist, should fail
	 * @param Student
	 */
	boolean addStudent(Student s);
	
	/**
	 * Returns a Student by ID
	 * 
	 * @param id
	 * @return Student
	 */
	Student getStudent(String id);
	
	/**
	 * Deletes a Student by ID
	 * 
	 * @param id
	 * @return the Deleted Student
	 */
	Student deleteStudent(String id);
	
	/**
	 * Updates an existing Student
	 * 
	 * @param s
	 * @return the Old Student that was replaced
	 */
	Student updateStudent(Student s);
	
	/**
	 * Get a list of all Students
	 * 
	 * @return List of Students
	 */
	List<Student> getAllStudents();
	
	/**
	 * Returns how many Students exist
	 * 
	 * @return Number of Students
	 */
	int countStudents();
	
	/**
	 * Clear Collection from all students
	 */
	void deleteAll();
	
}
