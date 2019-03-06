package com.javatechdeveloper.school.v1.service.endpoints;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.javatechdeveloper.school.v1.service.cargo.Staff;
import com.javatechdeveloper.school.v1.service.cargo.StaffList;
import com.javatechdeveloper.school.v1.service.cargo.Student;
import com.javatechdeveloper.school.v1.service.cargo.StudentList;

import lombok.Data;



@RestController
@RequestMapping(value="/school", produces= MediaType.APPLICATION_JSON_VALUE)
@Data
public class SchoolController {
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/students")
	public StudentList getStudents(){
		return restTemplate.getForObject("http://Student-Service/api/student", StudentList.class);	
	}
	
	@GetMapping("/staffs")
	public StaffList getStaffs(){
		return restTemplate.getForObject("http://Staff-Service/api/staff", StaffList.class);
	}
}
