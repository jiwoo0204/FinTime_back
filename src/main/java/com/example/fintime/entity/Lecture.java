package com.example.fintime.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "lecture")
public class Lecture {
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String startTime;
    private String endTime;
    private String location;

    public Lecture(Long id, String title, String startTime, String endTime, String location) {
        this.id = id;
        this.title = title;
        this.startTime = startTime;
        this.endTime = endTime;
        this.location = location;
    }

}
