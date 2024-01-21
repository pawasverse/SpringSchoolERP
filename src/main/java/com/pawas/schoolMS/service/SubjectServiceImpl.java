package com.pawas.schoolMS.service;

import com.pawas.schoolMS.entity.Subject;
import com.pawas.schoolMS.repository.SubjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService{

    private SubjectRepository subjectRepository;

    public SubjectServiceImpl(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    @Override
    public List<Subject> getAllSubjects() {
        List<Subject> allSubjects = subjectRepository.findAll();
        return allSubjects;
    }

    @Override
    public Subject addSubject(Subject subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public Subject getSubject(Long id) {
        Subject subject = subjectRepository.findById(id).orElse(null);
        return subject;
    }




}
