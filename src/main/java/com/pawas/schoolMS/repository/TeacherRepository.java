package com.pawas.schoolMS.repository;

import com.pawas.schoolMS.entity.Result;
import com.pawas.schoolMS.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher,Long> {
}
