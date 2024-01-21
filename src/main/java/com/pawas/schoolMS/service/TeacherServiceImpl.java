package com.pawas.schoolMS.service;

import com.pawas.schoolMS.entity.Teacher;
import com.pawas.schoolMS.repository.TeacherRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@Service
public class TeacherServiceImpl implements TeacherService{

    private TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public List<Teacher> getAllTeachers() {
        List<Teacher> allTeachers = teacherRepository.findAll();
        return allTeachers;
    }

    @Override
    public Teacher addTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }


    public Teacher getTeacher( Long id){
            Teacher teacher = teacherRepository.findById(id).orElse(null);
            return teacher;
    }

    @Override
    public void deleteTeacherById(Long id) {
        Teacher teacher = teacherRepository.findById(id).orElse(null);
        teacherRepository.deleteById(id);

    }


}
