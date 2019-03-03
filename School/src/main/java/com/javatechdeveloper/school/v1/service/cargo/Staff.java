package com.javatechdeveloper.school.v1.service.cargo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Staff {
	private long id;
	private String firstName;
	private String lastName;
	private String subject;

}