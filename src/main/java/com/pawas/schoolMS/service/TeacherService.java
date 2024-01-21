package com.pawas.schoolMS.service;

import com.pawas.schoolMS.entity.Teacher;

import java.util.List;

public interface TeacherService {

    List<Teacher> getAllTeachers();

    Teacher addTeacher(Teacher teacher);

    Teacher getTeacher(Long id);

    void deleteTeacherById(Long id);
}
