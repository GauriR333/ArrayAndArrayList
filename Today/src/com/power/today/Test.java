package com.power.today;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		Student s1 = new Student(1, "Gauri", "pune");
		Student s2 = new Student(2, "santosh", "nagar");
		Student s3 = new Student(3, "santu", "pune");

		Student studentArr[] = new Student[10];
		// studentArr[0] = s1;

		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);

		Test t1 = new Test();
		t1.displayStudent(studentList);

		System.out.println("ArraySize=" + studentArr.length);
		System.out.println("Listsize=" + studentList.size());

		studentList.remove(s2);
		System.out.println("Listsize=" + studentList.size());

		System.out.println("After s2");
		t1.displayStudent(studentList);
		studentList.remove(s1);
		System.out.println("After s1");
		t1.displayStudent(studentList);

	}

	void displayStudent(ArrayList<Student> studentList) {
		for (int i = 0; i < studentList.size(); i++) {
			Student s = studentList.get(i);
			System.out.println("Student= " + s);
		}
	}
}
