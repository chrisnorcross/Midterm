package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {
	@Test
	public void salaryTest(){
		ArrayList<Staff> staff = new ArrayList<Staff>();
		Date date = new GregorianCalendar(1991,10,10).getTime();
		Staff staff1 = new Staff("Jim","J","Johnson", date, "Main Street", "1234567890", "s@s.com", "12-2", 0, 20, date, eTitle.TEACHER);
		Staff staff2 = new Staff("Tim","J","Johnson", date, "Main Street", "1234567890", "s@s.com", "12-2", 0, 25, date, eTitle.TEACHER);
		Staff staff3 = new Staff("Jon","J","Johnson", date, "Main Street", "1234567890", "s@s.com", "12-2", 0, 30, date, eTitle.TEACHER);
		Staff staff4 = new Staff("James","J","Johnson", date, "Main Street", "1234567890", "s@s.com", "12-2", 0, 15, date, eTitle.TEACHER);
		Staff staff5 = new Staff("Ron","J","Johnson", date, "Main Street", "1234567890", "s@s.com", "12-2", 0, 18, date, eTitle.TEACHER);
		staff.add(staff1);
		staff.add(staff2);
		staff.add(staff3);
		staff.add(staff4);
		staff.add(staff5);
		double total = 0;
		for(Staff i :staff){
			double salary = i.getSalary();
			total += salary;
		}
		assertEquals((total/5),(108/5),.9 );
	}
	@Test(expected=PersonException.class)
	public void testPersonException() throws PersonException{
		Staff staff = new Staff(eTitle.TEACHER);
		staff.setPhone("1234");
	}
	@Test(expected=PersonException.class)
	public void testPersonException2() throws PersonException{
		Staff staff = new Staff(eTitle.DEAN);
		Date date = new GregorianCalendar(1900,10,10).getTime();
		staff.setDOB(date);
	}


}
