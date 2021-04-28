package com.example.todo.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.todo.domains.Todo;

@Mapper
public interface TodoMapper {
	
	List<Todo> all();
	List<Todo> addTask(String task);
	public void add(Todo todo);

}
