package com.demo.interceptor.springinterceptordemo.controller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.demo.interceptor.springinterceptordemo.exception.InvalidHeaderException;
import com.demo.interceptor.springinterceptordemo.model.Student;

@RestController
public class StudentController {

	
	@PostMapping("/students")
	public String students(@RequestHeader("student-token") String studentTkn, @RequestBody Student student) {

		if(StringUtils.isEmpty(student.getCourse())) {
			throw new InvalidHeaderException("Course required");
		}
		return String.format("Student token %s passed as header is valid ", studentTkn);
	}
}
