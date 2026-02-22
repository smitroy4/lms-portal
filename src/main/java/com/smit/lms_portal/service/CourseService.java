package com.smit.lms_portal.service;

import com.smit.lms_portal.entity.Course;

import java.util.List;

public interface CourseService {


    List<Course> getAllCourses();

    Course getCourseById(Long id);

    Course createCourse(Course course);

    Course deleteCourse(Long id);

    Course updateCourse(Long id, Course course);
}
