package com.example.fobidb.teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


// Service LAYER *******************************************************

@Service
public class  TeacherService {

    private final TeacherRepository teacherRepository;

    @Autowired
    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public List<Teacher> getTeachers() {
        return teacherRepository.findAll();
    }

    public void addNewTeacher(Teacher teacher) {
        Optional<Teacher> teacherOptional = teacherRepository.findByEmail(teacher.getEmail());
        if (teacherOptional.isPresent()) {
            throw new IllegalStateException("email already in use");
        }
        teacherRepository.save(teacher);
    }

    public void deleteTeacher(Long teacherId) {
        boolean exists = teacherRepository.existsById(teacherId);
        if (!exists) {
            throw new IllegalStateException("teacher with Id "+ teacherId + " does not exist");
        }
        teacherRepository.deleteById(teacherId);
    }
}
