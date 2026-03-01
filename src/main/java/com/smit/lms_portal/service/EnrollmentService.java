package com.smit.lms_portal.service;

import com.smit.lms_portal.entity.Course;
import com.smit.lms_portal.entity.Enrollment;
import com.smit.lms_portal.entity.Student;

import java.util.List;
import java.util.Map;

public interface EnrollmentService {

    Enrollment enrollStudent(Long studentId, Long courseId);
    List<Course> getCourseByStudent(Long studentId);
    List<Student> getStudentByCourse(Long courseId);
    List<Enrollment> getAllEnrollments();
}
