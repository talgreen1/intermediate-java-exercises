package com.att.java.exercise.collections.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.att.java.exercise.collections.Student;
import com.att.java.exercise.collections.StudentsStore;
import com.att.java.exercise.collections.StudentsStoreAsList;
import com.att.java.exercise.collections.StudentsStoreAsMap;

@RunWith(value = Parameterized.class)
public class StudentStoreTest {

	@Parameter
	public StudentsStore store;
	
	Student s1 = new Student("Naor Levy", "1");
	Student s2 = new Student("Meir Cohen", "2");
	Student s3 = new Student("Dan Avraham", "3");

    @Parameters(name = "{index}: type {0}")
    public static Object[] data() {
        return new Object[]{
        		new StudentsStoreAsList(),
        		new StudentsStoreAsMap()
        };
    }
    
	@Test
	public void testAdd() {
		prepareStudentStore(store, true);
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
	public void testGet() {
		prepareStudentStore(store, false);
		Assert.assertTrue(
				store.getStudent(s1.getId()) == s1 && store.getStudent(s2.getId()) == s2 && store.getStudent(s3.getId()) == s3);
	}

	@Test
	public void testDelete() {
		prepareStudentStore(store, false);
		String id = s2.getId();

		Assert.assertTrue(store.getStudent(id) == s2);
		Student removedStudent = store.deleteStudent(id);
		Assert.assertTrue(store.countStudents() == 2 && store.getStudent(id) == null && removedStudent == s2);
	}

	@Test
	public void testToString() {
		prepareStudentStore(store, false);
		String str = store.toString();
		Assert.assertTrue(str.contains(s1.getName()) && str.contains(s2.getName()) && str.contains(s3.getName()));
	}

	@Test
	public void testGetAll() {
		prepareStudentStore(store, false);
		List<Student> students = store.getAllStudents();
		Assert.assertTrue(
				students.size() == 3 && students.contains(s1) && students.contains(s2) && students.contains(s3));
	}

	@Test
	public void testUpdateStudent() {
		Student updatedS3 = new Student("Dan Avraham-Cohen", "3");
		prepareStudentStore(store, false);

		Student oldStudent = store.updateStudent(updatedS3);

		Assert.assertTrue(store.countStudents() == 3 && store.getStudent(s3.getId()) == updatedS3 && oldStudent == s3);
	}

	private void prepareStudentStore(StudentsStore store, boolean isEmpty) {
		store.deleteAll();
		if (!isEmpty) {
			store.addStudent(s1);
			store.addStudent(s2);
			store.addStudent(s3);
		}
	}
}
