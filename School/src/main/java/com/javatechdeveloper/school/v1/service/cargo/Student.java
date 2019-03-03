package com.javatechdeveloper.school.v1.service.cargo;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	private long id;
	private String firstName;
	private String lastName;
	private String grade;
	private int age;
	private LocalDate dob;
	private int rank;
	
	

}
