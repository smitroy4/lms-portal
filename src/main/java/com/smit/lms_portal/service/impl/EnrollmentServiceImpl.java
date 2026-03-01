package com.smit.lms_portal.service.impl;

import com.smit.lms_portal.entity.Course;
import com.smit.lms_portal.entity.Enrollment;
import com.smit.lms_portal.entity.Student;
import com.smit.lms_portal.repository.CourseRepository;
import com.smit.lms_portal.repository.EnrollmentRepository;
import com.smit.lms_portal.repository.StudentRepository;
import com.smit.lms_portal.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EnrollmentServiceImpl implements EnrollmentService {

    private final EnrollmentRepository enrollmentRepository;
    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;

    @Autowired
    public EnrollmentServiceImpl(EnrollmentRepository enrollmentRepository,
                                 StudentRepository studentRepository,
                                 CourseRepository courseRepository) {
        this.enrollmentRepository = enrollmentRepository;
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }

    @Override
    public List<Enrollment> getAllEnrollments() {
        return enrollmentRepository.findAll(Sort.by(Sort.Direction.DESC, "enrolledAt"));
    }

    @Override
    public Enrollment enrollStudent(Long studentId, Long courseId) {
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student not found!"));

        Course course = courseRepository.findById(courseId)
                .orElseThrow(() -> new RuntimeException("Course not found!"));

        if(enrollmentRepository.existsByStudentIdAndCourseId(studentId,courseId)){
            throw new RuntimeException("Student already enrolled in this Course");
        }

        Enrollment enrollment = new Enrollment();
        enrollment.setStudent(student);
        enrollment.setCourse(course);
        enrollment.setEnrolledAt(LocalDate.now());

        return enrollmentRepository.save(enrollment);
    }

    @Override
    public List<Course> getCourseByStudent(Long studentId) {

        if(!studentRepository.existsById(studentId)){
            throw new RuntimeException("Student not found!");
        }

        return enrollmentRepository.findByCourseId(studentId)
                .stream()
                .map(x->x.getCourse())
                .toList();
    }

    @Override
    public List<Student> getStudentByCourse(Long courseId) {

        if(!courseRepository.existsById(courseId)){
            throw new RuntimeException("Course does not exist!");
        }

        return enrollmentRepository.findByStudentId(courseId)
                .stream()
                .map(x->x.getStudent())
                .toList();

    }

}
