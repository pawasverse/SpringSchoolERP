package com.pawas.schoolMS.controller;

import com.pawas.schoolMS.entity.Student;
import com.pawas.schoolMS.entity.Subject;
import com.pawas.schoolMS.entity.Teacher;
import com.pawas.schoolMS.service.SubjectServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubjectController {

    private SubjectServiceImpl subjectService;

    public SubjectController(SubjectServiceImpl subjectService) {
        this.subjectService = subjectService;
    }
    @GetMapping("/subjects")
    public List<Subject> returnAllStudents(){
        return subjectService.getAllSubjects();
    }

    @PostMapping("/subjects")
    public Subject saveSubjects(Subject subject){
        return subjectService.addSubject(subject);
    }

    @GetMapping("/subjects/{id}")
    public Subject returnSubject(@PathVariable Long id){
        Subject subject = subjectService.getSubject(id);

        return subject;
    }




}
