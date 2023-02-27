package com.example.fintime.dto;

import com.example.fintime.entity.Lecture;

public class LectureForm {
    private String title;
    private String startTime;
    private String endTime;
    private String location;

    public LectureForm(String title, String startTime, String endTime, String location) {
        this.title = title;
        this.startTime = startTime;
        this.endTime = endTime;
        this.location = location;
    }

    public Lecture toEntity() {
        return new Lecture(null, title, startTime, endTime, location);
    }
}
