package com.jwt.dao;

import java.util.List;
import com.jwt.model.School;

public interface AdminSchoolDAO {

	public void addSchool(School school);

	public List<School> getAllSchools();

	public void deleteSchool(Integer schoolId);

	public School updateSchool(School school);

	public School getSchool(int schoolId);
}
