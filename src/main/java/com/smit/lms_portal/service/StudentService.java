package com.smit.lms_portal.service;

import com.smit.lms_portal.entity.Student;

import java.util.List;

public interface StudentService {

    public List<Student> getAllStudents();

    public Student getStudentById(Long id);

    public Student createStudent(Student student);

    public Student deleteStudent(Long id);

    public Student updateStudent(Long id, Student student);
}
