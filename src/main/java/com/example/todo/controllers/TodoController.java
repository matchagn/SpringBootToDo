package com.example.todo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.todo.domains.Todo;
import com.example.todo.mappers.TodoMapper;

@Controller
public class TodoController {

	private final TodoMapper todoMapper;

	@Autowired
	public TodoController(TodoMapper todoMapper) {
		this.todoMapper = todoMapper;
	}

	@GetMapping("/")
	public String index(Model model) {
		List<Todo> todos = todoMapper.all();
		model.addAttribute("todos", todos);
		return "index";
	}

	@GetMapping("/add")
	public String showTodoForm() {
		return "add";
	}

	@PostMapping("/add")
	public String add(@RequestParam("task") String task) {
		Todo todo = new Todo(task);
		todoMapper.add(todo);
		return "redirect:/";
	}
}
