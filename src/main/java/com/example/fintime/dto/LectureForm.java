package com.example.fintime.dto;

import com.example.fintime.entity.Lecture;

// Form에서 입력 받음
public class LectureForm {
    private String title;
    private int startTime;
    private int endTime;
    private String location;

    public LectureForm(String title, int startTime, int endTime, String location) {
        this.title = title;
        this.startTime = startTime;
        this.endTime = endTime;
        this.location = location;
    }

    public Lecture toEntity() {
        Lecture lecture = new Lecture();
        lecture.setTitle(title);
        lecture.setStartTime(startTime);
        lecture.setEndTime(endTime);
        lecture.setLocation(location);
        return lecture;
    }
}
