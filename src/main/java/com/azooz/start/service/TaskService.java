package com.azooz.start.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.azooz.start.model.Task;
import com.azooz.start.repo.TaskRepo;

@Service
public class TaskService {
    
    @Autowired
    private TaskRepo taskRepo;

    public Task getTaskById(String id) {
        return taskRepo.findById(id).orElse(null);
    }

    public Task addTask(Task task) {
        return taskRepo.save(task);
    }

    public Task updateTask(Task task) {
        return taskRepo.save(task);
    }

    public void deleteTask(String id) {
        taskRepo.deleteById(id);
    }

    public void deleteAllTasks() {
        taskRepo.deleteAll();
    }

    public Task getTaskByName(String name) {
        return taskRepo.findByName(name);
    }

    public List<Task> getAllTasks() {
        return taskRepo.findAll();
    }


}
