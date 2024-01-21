package com.pawas.schoolMS.repository;

import com.pawas.schoolMS.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject,Long> {
}
