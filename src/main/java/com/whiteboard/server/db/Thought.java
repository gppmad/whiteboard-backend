package com.whiteboard.server.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Thought {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String thought;
}
