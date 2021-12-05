package com.whiteboard.server.db;

import org.springframework.data.repository.CrudRepository;

public interface ThoughtRepository extends CrudRepository<Thought,Integer> {
    
}
