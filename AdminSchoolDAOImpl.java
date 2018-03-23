package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.School;

@Repository
public class AdminSchoolDAOImpl implements AdminSchoolDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addSchool(School school) {
		sessionFactory.getCurrentSession().saveOrUpdate(school);

	}

	@SuppressWarnings("unchecked")
	public List<School> getAllSchools() {

		return sessionFactory.getCurrentSession().createQuery("from School")
				.list();
	}

	@Override
	public void deleteSchool(Integer schoolId) {
		School school = (School) sessionFactory.getCurrentSession().load(
				School.class, schoolId);
		if (null != school) {
			this.sessionFactory.getCurrentSession().delete(school);
		}

	}

	public School getSchool(int empid) {
		return (School) sessionFactory.getCurrentSession().get(
				School.class, empid);
	}

	@Override
	public School updateSchool(School school) {
		sessionFactory.getCurrentSession().update(school);
		return school;
	}

}