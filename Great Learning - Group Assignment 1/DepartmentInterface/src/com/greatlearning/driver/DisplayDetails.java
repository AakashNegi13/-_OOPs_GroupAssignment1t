package com.greatlearning.driver;

import com.greatlearning.departmentdetails.AdminDepartment;
import com.greatlearning.departmentdetails.HrDepartment;
import com.greatlearning.departmentdetails.TechDepartment;

public class DisplayDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminDepartment admdep = new AdminDepartment();
		System.out.println("Welcome to "+admdep.departmentName());
		System.out.println(admdep.getTodaysWork());
		System.out.println(admdep.getWorkDeadline());
		System.out.println(admdep.isTodayAHoliday());
		System.out.println();
		
		HrDepartment hrdep = new HrDepartment();
		System.out.println("Welcome to "+hrdep.departmentName());
		System.out.println(hrdep.getTodaysWork());
		System.out.println(hrdep.getWorkDeadline());
		System.out.println(hrdep.doActivity());
		System.out.println(hrdep.isTodayAHoliday());
		System.out.println();
		
		TechDepartment tecdep = new TechDepartment();
		System.out.println("Welcome to "+hrdep.departmentName());
		System.out.println(tecdep.getTodaysWork());
		System.out.println(tecdep.getWorkDeadline());
		System.out.println(tecdep.getTechStackInformation());
		System.out.println(tecdep.isTodayAHoliday());
		System.out.println();
		
	}

}

