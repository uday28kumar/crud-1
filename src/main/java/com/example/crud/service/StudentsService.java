package com.example.crud.service;

import java.util.ArrayList;
import java.util.List;

import com.example.crud.model.Students;
import com.example.crud.repository.StudentsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentsService {
  @Autowired
  StudentsRepository studentsRepository;

  // getting all students record by using the method findaAll() of CrudRepository
  public List<Students> getAllStudents() {
    List<Students> students = new ArrayList<Students>();
    studentsRepository.findAll().forEach(students1 -> students.add(students1));
    return students;
  }

  // getting a specific record by using the method findById() of CrudRepository
  public Students getStudentById(int id) {
    return studentsRepository.findById(id).get();
  }

  // saving a specific record by using the method save() of CrudRepository
  public void saveOrUpdate(Students students) {
    studentsRepository.save(students);
  }

  // deleting a specific record by using the method deleteById() of CrudRepository
  public void delete(int id) {
    studentsRepository.deleteById(id);
  }

  // updating a record
  public void update(Students students, int studentid) {
    studentsRepository.save(students);
  }
}
