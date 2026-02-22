package com.smit.lms_portal.service;

import com.smit.lms_portal.entity.Instructor;

import java.util.List;

public interface InstructorService {

    List<Instructor> getAllInstructor();

    Instructor getInstructorById(Long id);

    Instructor createInstructor(Instructor instructor);

    Instructor deleteInstructorById(Long id);

    Instructor updateInstructorById(Long id, Instructor instructor);
}
