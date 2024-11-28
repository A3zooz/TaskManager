package com.azooz.start.repo;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.azooz.start.model.Task;
@Repository
public interface TaskRepo extends MongoRepository<Task, String> {

    Task findByName(String name);
    
}
