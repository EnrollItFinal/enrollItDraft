package com.jwt.service;

import java.util.List;

import com.jwt.model.Employee;
import com.jwt.model.School;

public interface AdminSchoolService {		
		public void addSchool(School employee);

		public List<School> getAllSchools();

		public void deleteSchool(Integer schoolId);

		public School getSchool(int employeeid);

		public School updateSchool(School school);
	}



