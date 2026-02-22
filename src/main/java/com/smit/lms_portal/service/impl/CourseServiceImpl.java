package com.smit.lms_portal.service.impl;

import com.smit.lms_portal.entity.Course;
import com.smit.lms_portal.entity.Student;
import com.smit.lms_portal.repository.CourseRepository;
import com.smit.lms_portal.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    @Autowired
    public CourseServiceImpl (CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course getCourseById(Long id) {
        return courseRepository.findById(id)
                .get();
    }

    @Override
    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course deleteCourse(Long id) {
        courseRepository.deleteById(id);
        return courseRepository.findById(id)
                .get();
    }

    @Override
    public Course updateCourse(Long id, Course course) {
        Optional<Course> updatableCourse = courseRepository.findById(id);

        if(updatableCourse.isPresent()){
            Course existingCourse = updatableCourse.get();

            existingCourse.setTitle(course.getTitle());
            existingCourse.setDescription(course.getDescription());
            existingCourse.setPrice(course.getPrice());

            return courseRepository.save(existingCourse);
        }
        else {
            throw new RuntimeException("Course not found in LMS with id: " + id);
        }
    }
}
