package com.amigoscode.mongoapp;

import lombok.AllArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/students")
public class StudentController {

    private final StudentService studentService;

    private final StudentRepo studentRepo;

    @GetMapping
    public ResponseEntity<List<Student>> fetchAllStudent(){
        return ResponseEntity.ok(studentService.getAllStudents());
    }

    @PostMapping("/createStudent")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

//    @PutMapping("student/{email}")
//    public Student updateStudent(@PathVariable(value = "email") String email,
//                                 @Validated @RequestBody Student studentDetails) throws Exception {
//
//    }

    @DeleteMapping("student/{email}")
    public void deleteStudent(Student student){
        studentRepo.delete(student);
    }
}
