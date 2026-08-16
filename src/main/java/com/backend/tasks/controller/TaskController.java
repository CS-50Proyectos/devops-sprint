package com.backend.tasks.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import com.backend.tasks.model.Task;
import com.backend.tasks.repository.TaskRepository;

import java.util.List;


@RestController
public class TaskController {
	
	private final TaskRepository taskRepository;
	
	public TaskController(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}
	
	@GetMapping("/tasks")
	public List<Task> getTasks(){
		return taskRepository.findAll();
	}
	
	@GetMapping("/tasks/{id}")
	public Task getTaskById(@PathVariable Long id) {
		return taskRepository.findById(id).orElse(null);
	}
	
	
	//@PostMapping es el endpoint para recibir datos @RequestBody se encarga de transformar JSON a OBJETO en java
	 
	@PostMapping("/tasks")
	public Task createTask(@RequestBody Task task) {
		return taskRepository.save(task);
	}
}
