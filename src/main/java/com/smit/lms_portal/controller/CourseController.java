package com.smit.lms_portal.controller;

import com.smit.lms_portal.entity.Course;
import com.smit.lms_portal.service.CourseService;
import com.smit.lms_portal.service.impl.CourseServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService courseService;

    @GetMapping("/")
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }

    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable("id") Long id){
        return courseService.getCourseById(id);
    }

    @PostMapping("/create")
    public Course createCourse(@RequestBody Course course){
        return courseService.createCourse(course);
    }

    @DeleteMapping("/delete/{id}")
    public Course deleteCourse(@PathVariable("id") Long id){
        return courseService.deleteCourse(id);
    }

    @PutMapping("update/{id}")
    public Course updateCourse(@PathVariable("id") Long id, @RequestBody Course course){
        return courseService.updateCourse(id,course);
    }

}
