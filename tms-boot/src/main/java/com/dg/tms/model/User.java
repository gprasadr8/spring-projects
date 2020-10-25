package com.dg.tms.model;

import lombok.Data;

@Data
public class User {

	private String userId;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String creteatedOn;
	
	private String updatedOn;
}
