package com.att.java.solution.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentsStoreAsMap implements StudentsStore {
	private Map<String, Student> students = null;

	public StudentsStoreAsMap() {
		students = new HashMap<String, Student>();
	}

	@Override
	public boolean addStudent(Student s) {
		boolean result = false;
		if (getStudent(s.getId()) == null) {
			this.students.put(s.getId(), s);
			result = true;
		}
		return result;
	}

	@Override
	public Student getStudent(String id) {
		return students.get(id);
	}

	@Override
	public Student deleteStudent(String id) {
		return students.remove(id);
	}

	@Override
	public Student updateStudent(Student s) {
		return students.replace(s.getId(), s);
	}

	@Override
	public List<Student> getAllStudents() {
		return new ArrayList<Student>(students.values());
	}

	@Override
	public int countStudents() {
		return students.size();
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		for (Student student : students.values()) {
			result.append(student.getName()).append('\n');
		}
		return result.toString();
	}

	@Override
	public void deleteAll() {
		this.students.clear();
	}

}
