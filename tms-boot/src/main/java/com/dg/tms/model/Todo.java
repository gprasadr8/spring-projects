package com.dg.tms.model;

import java.util.List;

import lombok.Data;

@Data
public class Todo {

	private String todoId;
	
	private String userId;
	
	private String title;
	
	private List<SubTodo> subTodos;
	
	private boolean dueToday;
	
	private boolean important;
	
	private RepeatDay repeatDay;
	
	private String remindOn;
	
	private String dueDate;
	
	private String note;
	
	private String groupName;
	
	private String listName;
	
	private String createdOn;
	
	private String completedOn;
	
		
}
