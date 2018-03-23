package com.jwt.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.jwt.model.School;
import com.jwt.service.AdminSchoolService;

@Controller
public class AdminSchoolController {

	private static final Logger logger = Logger
			.getLogger(AdminSchoolController.class);

	public AdminSchoolController() {
		System.out.println("AdminSchoolController()");
	}

	@Autowired
	private AdminSchoolService adminSchoolService;

	@RequestMapping(value = "/")
	public ModelAndView listSchool(ModelAndView model) throws IOException {
		List<School> listSchool = adminSchoolService.getAllSchools();
		model.addObject("listSchool", listSchool);
		model.setViewName("home");
		return model;
	}

	@RequestMapping(value = "/newSchool", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		School school = new School();
		model.addObject("school", school);
		model.setViewName("SchoolForm");
		return model;
	}

	@RequestMapping(value = "/saveSchool", method = RequestMethod.POST)
	public ModelAndView saveSchool(@ModelAttribute School school) {
		if (school.getSchoolId().isEmpty()) { // if school id is 0 then creating the
			// school other updating the school
			adminSchoolService.addSchool(school);
		} else {
			adminSchoolService.updateSchool(school);
		}
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/deleteSchool", method = RequestMethod.GET)
	public ModelAndView deleteSchool(HttpServletRequest request) {
		int schoolId = Integer.parseInt(request.getParameter("id"));
		adminSchoolService.deleteSchool(schoolId);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/editSchool", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
		int schoolId = Integer.parseInt(request.getParameter("id"));
		School school = adminSchoolService.getSchool(schoolId);
		ModelAndView model = new ModelAndView("SchoolForm");
		model.addObject("school", school);

		return model;
	}

}