package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.AdminSchoolDAO;
import com.jwt.model.School;

@Service
@Transactional
public class AdminSchoolServiceImpl implements  AdminSchoolService {

	@Autowired
	private AdminSchoolDAO schoolDAO;
	
	@Override
	@Transactional
	public void addSchool(School school) {
		schoolDAO.addSchool(school);
	}

	@Override
	@Transactional
	public List<School> getAllSchools() {
		return schoolDAO.getAllSchools();
	}

	@Override
	@Transactional
	public void deleteSchool(Integer schoolId) {
		schoolDAO.deleteSchool(schoolId);
	}

	public School getSchool(int empid) {
		return schoolDAO.getSchool(empid);
	}

	public School updateSchool(School school) {
		return schoolDAO.updateSchool(school);
	}

	public void setSchoolDAO(AdminSchoolDAO schoolDAO) {
		this.schoolDAO = schoolDAO;
	}

}
