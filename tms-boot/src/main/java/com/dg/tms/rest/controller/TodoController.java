package com.dg.tms.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dg.tms.model.Todo;
import com.dg.tms.service.TodoService;

@RestController
public class TodoController {

	
	@Autowired
	private TodoService todoService;
	
		
	@GetMapping
	public List<Todo> getAllTodos(@NonNull String userId){
		return todoService.getAllTodos(userId);
	}
}
