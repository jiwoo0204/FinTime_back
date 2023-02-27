package com.example.fintime.Controller;

import com.example.fintime.dto.LectureForm;
import com.example.fintime.entity.Lecture;
import com.example.fintime.repository.LectureRepositoryInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class LectureController {
    @Autowired
    private LectureRepositoryInterface lectureRepository;

    @GetMapping("/lecture/new")
    public String newLectureForm()  {
        return "new lecture";
    }

    @PostMapping("/lecture/create")
    public String createlecture(LectureForm lectureForm) {
        Lecture lecture = lectureForm.toEntity();
        log.info("toEntity");

        Lecture save_lecture = lectureRepository.save(lecture);
        log.info("save");

        return "save";
    }
}
