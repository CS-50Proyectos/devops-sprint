package com.backend.tasks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.tasks.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
