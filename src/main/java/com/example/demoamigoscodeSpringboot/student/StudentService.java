package com.example.demoamigoscodeSpringboot.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service //can me @Component as well, used @Service for clarity reasons
public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Mariam",
                        "mariam.amal@gmail.com",
                        LocalDate.of(2000, 1, 5),
                        22

                )


        );
    }
}
