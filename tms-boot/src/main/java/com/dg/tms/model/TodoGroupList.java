package com.dg.tms.model;

import java.util.List;

import lombok.Data;

@Data
public class TodoGroupList {

	private String listId;
	
	private String listName;
	
	private List<String> todos;
	
	private String createdOn;
	
	private String udpatedOn;
}
