package com.azooz.start.repo;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.azooz.start.model.Task;
@Repository
public interface TaskRepo extends JpaRepository<Task, Long> {

    Task findByName(String name);
    
}
