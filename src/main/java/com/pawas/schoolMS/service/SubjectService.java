package com.pawas.schoolMS.service;

import com.pawas.schoolMS.entity.Subject;

import java.util.List;

public interface SubjectService {

    List<Subject> getAllSubjects();

    Subject addSubject(Subject subject);


    Subject getSubject(Long id);



}


