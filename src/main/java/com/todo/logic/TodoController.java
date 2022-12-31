package com.todo.logic;

import java.lang.reflect.Method;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

	@Autowired
	private TodoService todoService;
 
	
	@RequestMapping("/todos")
	public List<Todo> getAllTodos() {

		return todoService.getAllTodo();
	}

	@RequestMapping("/todos/{id}")
      public List<Todo> gettodo(@PathVariable Integer id) {
		return todoService.gettodo(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/todoput")
	 public void createTodo(@RequestBody Todo todo) {
		  todoService.createTo(todo);
	}
	
	@RequestMapping(method= RequestMethod.PUT, value="/todoput/{id}" )
	
	public void puttodo(@PathVariable Integer id , @RequestBody Todo todo)
	{
		todoService.updatetodo(id, todo);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/todoput/{id}")
	public void deletetodo(@PathVariable Integer id)
	{
		todoService.deletetodo(id);
	}
	
}
