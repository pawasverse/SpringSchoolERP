package com.pawas.schoolMS.controller;

import com.pawas.schoolMS.entity.Student;
import com.pawas.schoolMS.entity.Teacher;
import com.pawas.schoolMS.service.TeacherServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeacherController {
    private TeacherServiceImpl teacherService;

    public TeacherController(TeacherServiceImpl teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping("/teachers")
    public List<Teacher> returnAllStudents() {
        return teacherService.getAllTeachers();
    }

    @PostMapping("/teachers")
    public Teacher saveTeacher(@RequestBody Teacher teacher) {
        return teacherService.addTeacher(teacher);
    }



    @GetMapping("/teachers/{id}")
    public Teacher returnTeacher(@PathVariable Long id){
        Teacher teacher = teacherService.getTeacher(id);
        return teacher;
    }

    @DeleteMapping("/teachers/{id}")
    public void deleteTeacher(@PathVariable Long id){
        Teacher teacher = teacherService.getTeacher(id);

        teacherService.deleteTeacherById(id);

    }







}
