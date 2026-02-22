package com.smit.lms_portal.controller;

import com.smit.lms_portal.entity.Student;
import com.smit.lms_portal.service.StudentService;
import jakarta.validation.Valid;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable("id") Long id){
        return studentService.getStudentById(id);
    }

    @PostMapping("/create")
    public Student createStudent(@Valid @RequestBody Student student){
        return studentService.createStudent(student);
    }

    @PutMapping("/update/{id}")
    public Student updateStudent(@PathVariable("id") Long id,
                                 @RequestBody Student student){
        return studentService.updateStudent(id,student);
    }

    @DeleteMapping("/delete/{id}")
    public Student deleteStudent(@PathVariable("id") Long id){
        return studentService.deleteStudent(id);
    }

}
