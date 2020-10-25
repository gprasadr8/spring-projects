package com.dg.tms.service;

import java.util.List;

import com.dg.tms.model.Todo;

public interface TodoService {
	
	List<Todo> getAllTodos(String userId);
	
	List<Todo> findTodoById(String todoId);
	
	void saveTodo(Todo todo);
	
	void updateTodo(Todo todo);
	
	void completeTodo(Todo todo);
	
	void deleteTodo(Todo todo);

}
