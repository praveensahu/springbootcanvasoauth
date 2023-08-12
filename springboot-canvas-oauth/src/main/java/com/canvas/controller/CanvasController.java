package com.canvas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.canvas.dto.AccountDTO;
import com.canvas.dto.CoursesDTO;
import com.canvas.service.AccountService;
import com.canvas.service.CourseService;

@RestController
public class CanvasController {
	
	@Autowired
	CourseService courseService;
	
	@Autowired
	AccountService accountService;

	@GetMapping("/account")
	@ResponseBody
	private ResponseEntity<List<AccountDTO>> syncAccount() throws Exception {
		return ResponseEntity.ok(accountService.syncAccountDetails());
	}
	
	@GetMapping("/courses")
	@ResponseBody
	private ResponseEntity<List<CoursesDTO>> syncCourse() throws Exception{
		return ResponseEntity.ok(courseService.syncCourseDetails());
	}
	
}
