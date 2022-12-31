package com.todo.logic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

	@Autowired
	private TodoRepository todoRepository;

	public List<Todo> getAllTodo() {

		List<Todo> todos = new ArrayList<>();

		todoRepository.findAll().forEach(todos::add);
		return todos;
	}

	public List<Todo> gettodo(Integer id) {

		return todoRepository.findAll();
	}

	public void createTo(Todo todo) {

		todoRepository.save(todo);
	}

	public void updatetodo(Integer id, Todo todo) {
		todoRepository.save(todo);
	}

	public void deletetodo(Integer id) {
		todoRepository.deleteById(id);

	}
}
