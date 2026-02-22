package com.smit.lms_portal.service.impl;

import com.smit.lms_portal.entity.Student;
import com.smit.lms_portal.repository.StudentRepository;
import com.smit.lms_portal.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
//    GET ALL
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

//    GET BY ID
    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

//    CREATE STUDENT
    @Override
    public Student createStudent(Student student) {
        studentRepository.save(student);
        return student;
    }

//    DELETE STUDENT
    @Override
    public Student deleteStudent(Long id) {
        studentRepository.deleteById(id);
        return studentRepository.findById(id).orElse(null);
    }

//    UPDATE STUDENT
    @Override
    public Student updateStudent(Long id, Student student) {
        Optional<Student> updatableStudent= studentRepository.findById(id);

        if(updatableStudent.isPresent()){
            Student existingStudent = updatableStudent.get();

            existingStudent.setName(student.getName());
            existingStudent.setEmail(student.getEmail());

            return studentRepository.save(existingStudent);
        }
        else {
            throw new RuntimeException("Student not found in LMS with id: " + id);
        }
    }

}
