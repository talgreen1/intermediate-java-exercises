package com.att.java.solution.collections;

import java.util.ArrayList;
import java.util.List;

public class StudentsStoreAsList implements StudentsStore {
	private List<Student> students = null;
	
	public StudentsStoreAsList() {
		students = new ArrayList<Student>();
	}
	
	@Override
	public boolean addStudent(Student s) {
		boolean result = false;
		if (getStudent(s.getId()) == null) {
			students.add(s);
			result = true;
		}
		return result;
	}

	@Override
	public Student getStudent(String id) {
		Student result = null;
		for (Student student : students) {
			if (student.getId().equals(id)) {
				result = student;
				break;
			}
		}
		return result;
	}

	@Override
	public Student deleteStudent(String id) {
		Student s = this.getStudent(id);
		if (s != null) {
			students.remove(s);
		}
		return s; 
	}

	@Override
	public Student updateStudent(Student s) {
		Student studentToDelete = this.deleteStudent(s.getId());
		if (studentToDelete != null) {
			this.students.add(s);
		}
		return studentToDelete;
	}

	@Override
	public List<Student> getAllStudents() {
		return students;
	}

	@Override
	public int countStudents() {
		return students.size();
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		for (Student student : students) {
			result.append(student.getName()).append('\n');
		}
		return result.toString();
	}
}
