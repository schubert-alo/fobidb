package com.example.fobidb.teacher;

import org.springframework.stereotype.Service;

import java.util.List;


// Service LAYER *******************************************************

@Service
public class TeacherService {

    public List<Teacher> getTeachers() {
        return List.of(
                new Teacher(
                        1,
                        "Schubert",
                        "Simon",
                        "sb",
                        "simon.schubert@aloberlin.de",
                        45
                )
        );
    }

}
