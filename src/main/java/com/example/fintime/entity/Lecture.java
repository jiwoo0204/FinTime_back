package com.example.fintime.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// lecture 테이블과 매핑된 Entity
@Entity
@Table(name = "lecture")
public class Lecture {
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private int startTime;
    private int endTime;
    private String location;

    public Lecture(Long id, String title, int startTime, int endTime, String location) {
        this.id = id;
        this.title = title;
        this.startTime = startTime;
        this.endTime = endTime;
        this.location = location;
    }

    public Lecture() {

    }
}
