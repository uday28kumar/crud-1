package com.example.crud.controller;

import java.util.List;

import com.example.crud.model.Students;
import com.example.crud.service.StudentsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentsController {
  // autowire the studentServices class
  @Autowired
  StudentsService studentServices;

  // creating a get mapping that retrieves all the students detail from the
  // database
  @GetMapping("/students")
  private List<Students> getAllStudents() {
    return studentServices.getAllStudents();
  }

  // creating a get mapping that retrieves the detail of a specific student
  @GetMapping("/student/{studentid}")
  private Students getstudents(@PathVariable("studentid") int studentid) {
    return studentServices.getStudentById(studentid);
  }

  // creating a delete mapping that deletes a specified student
  @DeleteMapping("/student/{studentid}")
  private void deletestudent(@PathVariable("studentid") int studentid) {
    studentServices.delete(studentid);
  }

  // creating post mapping that post the student detail in the database
  @PostMapping("/students")
  private int savestudent(@RequestBody Students students) {
    studentServices.saveOrUpdate(students);
    return students.getStudentid();
  }

  // creating put mapping that updates the student detail
  @PutMapping("/students")
  private Students update(@RequestBody Students students) {
    studentServices.saveOrUpdate(students);
    return students;
  }
}
