package com.azooz.start.model;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Document(collection = "task")
public class Task {
    @Id
    private String id;
    private String name;
    private String description;
    private String status;
    private String priority;
    
    public Task(String id, String name, String description, String status, String priority) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.status = status;
        this.priority = priority;
    }
    @Override
    public String toString() {
        return "Task [id=" + id + ", name=" + name + ", description=" + description + ", status=" + status
                + ", priority=" + priority + "]";
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getPriority() {
        return priority;
    }
    public void setPriority(String priority) {
        this.priority = priority;
    }
    
}
