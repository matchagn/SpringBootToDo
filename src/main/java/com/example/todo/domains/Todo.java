package com.example.todo.domains;

public class Todo {

	private int id;
	private boolean done_flag;
	private String task;
	private String deadline;
	
	public Todo(String task) {
		this.task = task;
	}

	public Todo(int id, boolean done_flag, String task, String deadline) {
		this.id = id;
		this.done_flag = done_flag;
		this.task = task;
		this.deadline = deadline;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isDone_flag() {
		return done_flag;
	}

	public void setDone_flag(boolean done_flag) {
		this.done_flag = done_flag;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

}
