package com.smit.lms_portal.controller;

import com.smit.lms_portal.entity.Instructor;
import com.smit.lms_portal.service.InstructorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/instructor")
@RequiredArgsConstructor
public class InstructorController {

    private final InstructorService instructorService;

    @GetMapping("/")
    public List<Instructor> getAllInstructor(){
        return instructorService.getAllInstructor();
    }

    @GetMapping("/{id}")
    public Instructor getInstructorById(@PathVariable("id") Long id){
        return instructorService.getInstructorById(id);
    }

    @PostMapping("/create")
    public Instructor createInstructor(@RequestBody Instructor instructor){
        return instructorService.createInstructor(instructor);
    }

    @DeleteMapping("/delete/{id}")
    public Instructor deleteInstructorById(@PathVariable("id") Long id){
        return instructorService.deleteInstructorById(id);
    }

    @PutMapping("/update/{id}")
    public Instructor updateInstructorById(@PathVariable("id") Long id,@RequestBody Instructor instructor){
        return instructorService.updateInstructorById(id,instructor);
    }

}
