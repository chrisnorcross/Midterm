package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {
	private ArrayList<Section> sections = new ArrayList<Section>();
	private ArrayList<Semester> semesters = new ArrayList<Semester>();
	private ArrayList<Course> courses = new ArrayList<Course>();
	private ArrayList<Student> students = new ArrayList<Student>();
	@Before
	public void setUpBefore() throws Exception {
		Course course1 = new Course(UUID.randomUUID(),"math",90,eMajor.CHEM);
		Course course2 = new Course(UUID.randomUUID(),"cisc",95,eMajor.CHEM);
		Course course3 = new Course(UUID.randomUUID(),"chem",90,eMajor.CHEM);
		courses.add(course1);
		courses.add(course2);
		courses.add(course3);
		Semester fall = new Semester();
		Semester spring = new Semester();
		fall.setSemesterID(UUID.randomUUID());
		spring.setSemesterID(UUID.randomUUID());
		ArrayList<Semester> semesters = new ArrayList<Semester>();
		semesters.add(fall);
		semesters.add(spring);
		Section section1 = new Section(course1.getCourseID(),fall.getSemesterID(),UUID.randomUUID(),101);
		Section section2 = new Section(course1.getCourseID(),spring.getSemesterID(),UUID.randomUUID(),101);
		Section section3 = new Section(course2.getCourseID(),fall.getSemesterID(),UUID.randomUUID(),102);
		Section section4 = new Section(course2.getCourseID(),spring.getSemesterID(),UUID.randomUUID(),102);
		Section section5 = new Section(course3.getCourseID(),fall.getSemesterID(),UUID.randomUUID(),103);
		Section section6 = new Section(course3.getCourseID(),spring.getSemesterID(),UUID.randomUUID(),104);
		ArrayList<Section> sections = new ArrayList<Section>();
		sections.add(section1);
		sections.add(section2);
		sections.add(section3);
		sections.add(section4);
		sections.add(section5);
		sections.add(section6);
		Date DOB = new GregorianCalendar(1994,10,10).getTime();
		Student student1 = new Student("Jim","A", "Johnson", DOB, eMajor.BUSINESS, "address", "1234567890", "guy@email.com");
		Student student2 = new Student("Jim","B", "Johnson", DOB, eMajor.BUSINESS, "address", "1234567890", "guy@email.com");
		Student student3 = new Student("Jim","C", "Johnson", DOB, eMajor.BUSINESS, "address", "1234567890", "guy@email.com");
		Student student4 = new Student("Jim","D", "Johnson", DOB, eMajor.BUSINESS, "address", "1234567890", "guy@email.com");
		Student student5 = new Student("Jim","E", "Johnson", DOB, eMajor.BUSINESS, "address", "1234567890", "guy@email.com");
		Student student6 = new Student("Jim","F", "Johnson", DOB, eMajor.BUSINESS, "address", "1234567890", "guy@email.com");
		Student student7 = new Student("Jim","G", "Johnson", DOB, eMajor.BUSINESS, "address", "1234567890", "guy@email.com");
		Student student8 = new Student("Jim","H", "Johnson", DOB, eMajor.BUSINESS, "address", "1234567890", "guy@email.com");
		Student student9 = new Student("Jim","I", "Johnson", DOB, eMajor.BUSINESS, "address", "1234567890", "guy@email.com");
		Student student10 = new Student("Jim","J", "Johnson", DOB, eMajor.BUSINESS, "address", "1234567890", "guy@email.com");
		students.add(student10);
		students.add(student9);
		students.add(student8);
		students.add(student7);
		students.add(student6);
		students.add(student5);
		students.add(student4);
		students.add(student3);
		students.add(student2);
		students.add(student1);
	}
	@Test
	public void EnrollmentTest(){
		ArrayList<Enrollment> enrollments = new ArrayList<Enrollment>();
		for(Student i : students){
			for(Section j : sections){
			Enrollment e = new Enrollment(i.getStudentID(),j.getSectionID());
			e.SetGrade(90);
			enrollments.add(e);
			}
			double values = 0;
			values += enrollments.get(0).getGrade();
			values += enrollments.get(1).getGrade();
			values += enrollments.get(2).getGrade();
			values += enrollments.get(3).getGrade();
			values += enrollments.get(4).getGrade();
			values += enrollments.get(5).getGrade();
			assertTrue((values/6)==90);
		}
	}
	@Test
	public void majorTest(){
		students.get(0).setMajor(eMajor.CHEM);
		assertTrue(students.get(0).getMajor()==eMajor.CHEM);
	}


}
