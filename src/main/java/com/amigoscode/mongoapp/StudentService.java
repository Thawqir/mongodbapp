package com.amigoscode.mongoapp;

import lombok.AllArgsConstructor;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {

    private final StudentRepo studentRepo;

    public List<Student> getAllStudents(){
        return studentRepo.findAll();
    }

    public ResponseEntity<Student> addStudent(Student student){
        return ResponseEntity.ok(studentRepo.save(student));
    }
//
//    public Student editStudent(Student student) throws Exception {
//        studentRepo.findStudentByEmail(student.getEmail())
//                .orElseThrow(() -> new Exception("Employee not found with email: " + student.getEmail()));
//
//
//
//    }

}
