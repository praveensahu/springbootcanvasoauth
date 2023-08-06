package com.canvas.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.canvas.component.WebClientComponent;
import com.canvas.dto.CoursesDTO;
import com.canvas.model.Courses;
import com.canvas.repository.CourseRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class CourseService {
	@Autowired
	private WebClientComponent webclient;

	@Autowired
	private CourseRepository courseRepository;

	public List<CoursesDTO> syncCourseDetails() throws Exception {
		List<CoursesDTO> courseList = new ArrayList<CoursesDTO>();
		courseList = new ObjectMapper().readValue(webclient.getApiResponse("/courses"),new TypeReference<List<CoursesDTO>>() {});
		List<Courses> listOfEntity = courseList.stream().map(e -> new ModelMapper().map(e, Courses.class)).collect(Collectors.toList());
		courseRepository.saveAll(listOfEntity);
		return courseList;
	}
}
