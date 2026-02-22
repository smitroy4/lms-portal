package com.smit.lms_portal.repository;

import com.smit.lms_portal.entity.Instructor;
import com.smit.lms_portal.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor,Long> {

}
