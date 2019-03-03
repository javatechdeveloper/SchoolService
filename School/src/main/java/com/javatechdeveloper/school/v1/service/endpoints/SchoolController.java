package com.javatechdeveloper.school.v1.service.endpoints;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatechdeveloper.school.v1.service.cargo.Staff;
import com.javatechdeveloper.school.v1.service.cargo.Student;



@RestController
@RequestMapping(value="/school", produces= MediaType.APPLICATION_JSON_VALUE, consumes= MediaType.APPLICATION_JSON_VALUE)

public class SchoolController {
	@GetMapping("/students")
	public List<Student> getStudents(){
		return null;	
	}
	
	@GetMapping("/staffs")
	public List<Staff> getStaffs(){
		return null;	
	}
}
