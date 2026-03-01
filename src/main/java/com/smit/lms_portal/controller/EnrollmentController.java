package com.smit.lms_portal.controller;

import com.smit.lms_portal.entity.Course;
import com.smit.lms_portal.entity.Enrollment;
import com.smit.lms_portal.entity.Student;
import com.smit.lms_portal.service.EnrollmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enrollment")
@RequiredArgsConstructor
public class EnrollmentController {

    private final EnrollmentService enrollmentService;

    @GetMapping("/")
    public List<Enrollment> getAllEnrollments(){
        return enrollmentService.getAllEnrollments();
    }


    @PostMapping("/create")
    public Enrollment enrollStudent(
            @RequestParam Long studentId,
            @RequestParam Long courseId){
        return enrollmentService.enrollStudent(studentId,courseId);
    }

    @GetMapping("/courses/{studentId}")
    public List<Course> getCourseByStudent(@PathVariable Long studentId){
        return enrollmentService.getCourseByStudent(studentId);
    }

    @GetMapping("/student/{courseId}")
    public List<Student> getStudentByCourse(@PathVariable Long courseId){
        return enrollmentService.getStudentByCourse(courseId);
    }

}
