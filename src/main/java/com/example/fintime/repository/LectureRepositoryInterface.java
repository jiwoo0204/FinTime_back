package com.example.fintime.repository;

import com.example.fintime.entity.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LectureRepositoryInterface extends JpaRepository<Lecture, Long> {

}
