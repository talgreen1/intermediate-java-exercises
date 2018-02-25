package com.att.java.exercise.collections.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.att.java.solution.collections.Student;
import com.att.java.solution.collections.StudentsStore;
import com.att.java.solution.collections.StudentsStoreAsMap;

public class StudentStoreTest {

	Student s1 = new Student("Naor Levy", "1");
	Student s2 = new Student("Meir Cohen", "2");
	Student s3 = new Student("Dan Avraham", "3");

	@Test
	public void testAdd() {
		StudentsStore store = prepareStudentStore(true);
		Student kuku = new Student("Yosi", "87612354765");
		Student kuku1 = new Student("Yosi", "87612354765");
		
		int countBefore = store.countStudents();
		boolean success = store.addStudent(kuku);
		int countAfter = store.countStudents();
		
		Assert.assertTrue(success);
		Assert.assertTrue(countBefore == (countAfter - 1));
		
		countBefore = store.countStudents();
		success = store.addStudent(kuku1);
		countAfter = store.countStudents();
		
		Assert.assertFalse(success);
		Assert.assertTrue(countBefore == countAfter);
		
	}
	
	@Test
	public void testThatNewStoreIsCreatedWithZeroElements() {
		StudentsStore u = prepareStudentStore(true);
		Assert.assertTrue(u.getAllStudents().size() == 0);
	}

	@Test
	public void testGet() {
		StudentsStore u = prepareStudentStore(false);
		Assert.assertTrue(
				u.getStudent(s1.getId()) == s1 && u.getStudent(s2.getId()) == s2 && u.getStudent(s3.getId()) == s3);
	}

	@Test
	public void testDelete() {
		StudentsStore u = prepareStudentStore(false);
		String id = s2.getId();

		Assert.assertTrue(u.getStudent(id) == s2);
		Student removedStudent = u.deleteStudent(id);
		Assert.assertTrue(u.countStudents() == 2 && u.getStudent(id) == null && removedStudent == s2);
	}

	@Test
	public void testToString() {
		StudentsStore u = prepareStudentStore(false);
		String str = u.toString();
		Assert.assertTrue(str.contains(s1.getName()) && str.contains(s2.getName()) && str.contains(s3.getName()));
	}

	@Test
	public void voidTestGetAll() {
		StudentsStore u = prepareStudentStore(false);
		List<Student> students = u.getAllStudents();
		Assert.assertTrue(
				students.size() == 3 && students.contains(s1) && students.contains(s2) && students.contains(s3));
	}

	@Test
	public void testUpdateStudent() {
		Student updatedS3 = new Student("Dan Avraham-Cohen", "3");
		StudentsStore u = prepareStudentStore(false);

		Student oldStudent = u.updateStudent(updatedS3);

		Assert.assertTrue(u.countStudents() == 3 && u.getStudent(s3.getId()) == updatedS3 && oldStudent == s3);
	}

	private StudentsStore prepareStudentStore(boolean isEmpty) {
		StudentsStore u = new StudentsStoreAsMap();

		if (!isEmpty) {
			u.addStudent(s1);
			u.addStudent(s2);
			u.addStudent(s3);
		}
		return u;
	}
}
