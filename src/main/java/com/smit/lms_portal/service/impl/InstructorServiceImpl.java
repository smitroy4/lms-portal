package com.smit.lms_portal.service.impl;

import com.smit.lms_portal.entity.Instructor;
import com.smit.lms_portal.repository.InstructorRepository;
import com.smit.lms_portal.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InstructorServiceImpl implements InstructorService {

    private final InstructorRepository instructorRepository;

    @Autowired
    public InstructorServiceImpl(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

    @Override
    public List<Instructor> getAllInstructor() {
        return instructorRepository.findAll();
    }

    @Override
    public Instructor getInstructorById(Long id) {
        return instructorRepository.findById(id).get();
    }

    @Override
    public Instructor createInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Override
    public Instructor deleteInstructorById(Long id) {
        instructorRepository.deleteById(id);
        return instructorRepository.findById(id).get();
    }

    @Override
    public Instructor updateInstructorById(Long id, Instructor instructor) {
        Optional<Instructor> updatableInstructor = instructorRepository.findById(id);

        if(updatableInstructor.isPresent()){
            Instructor existingInstructor = updatableInstructor.get();

            existingInstructor.setName(instructor.getName());
            existingInstructor.setEmail(instructor.getEmail());
            existingInstructor.setExpertise(instructor.getExpertise());

            return instructorRepository.save(existingInstructor);
        }

        else {
            throw new RuntimeException("Instructor not found in LMS with id: " +id);
        }
    }
}
