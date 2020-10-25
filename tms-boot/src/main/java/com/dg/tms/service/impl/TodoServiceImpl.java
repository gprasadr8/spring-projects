package com.dg.tms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dg.tms.model.Todo;
import com.dg.tms.service.TodoService;

@Service
public class TodoServiceImpl implements TodoService {

	@Override
	public List<Todo> getAllTodos(String userId) {
		if(userId.equals("gprs")) {
			return createSampleTodos();
		}
		return List.of();
	}


	@Override
	public List<Todo> findTodoById(String todoId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveTodo(Todo todo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateTodo(Todo todo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void completeTodo(Todo todo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteTodo(Todo todo) {
		// TODO Auto-generated method stub

	}
	

	private List<Todo> createSampleTodos() {
		Todo todo1 = new Todo();
		
		return null;
	}

}
