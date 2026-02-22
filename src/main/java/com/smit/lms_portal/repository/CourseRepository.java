package com.smit.lms_portal.repository;

import com.smit.lms_portal.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {

//    List<Course> findByInstructorId(Long InstructorId);

}
