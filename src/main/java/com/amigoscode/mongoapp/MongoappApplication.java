package com.amigoscode.mongoapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.management.Query;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@SpringBootApplication
public class MongoappApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongoappApplication.class, args);
    }

//    @Bean
//    CommandLineRunner runner(StudentRepo repo){
//        return args -> {
//            Address address = new Address(
//                    "England",
//                    "London",
//                    "NE9"
//            );
//          Student student = new Student(
//                  "Thawqir",
//                  "Hussain",
//                  "thawqih@gmail.com",
//                  Gender.MALE,
//                  address,
//                  List.of("CS", "Maths"),
//                  BigDecimal.TEN,
//                  LocalDateTime.now()
//          );
//
//          repo.findStudentByEmail(student.getEmail())
//                  .ifPresentOrElse(s -> {
//                      System.out.println(student.getFirstName() + " already exists");
//                  }, () -> {
//                      System.out.println("Inserting student " + student.getFirstName());
//                      repo.insert(student);
//                  });
//        };
//    }
}
