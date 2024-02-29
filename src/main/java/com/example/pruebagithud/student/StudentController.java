package com.example.pruebagithud.student;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {


    public List<Student> lista(){

        return List.of(
            new Student(
                "cris",
                    "cortes",
                    LocalDate.now(),
                    "@elloco",
                    1


            )
        );
    }

}
