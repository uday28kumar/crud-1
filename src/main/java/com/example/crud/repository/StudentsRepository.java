package com.example.crud.repository;

import com.example.crud.model.Students;

import org.springframework.data.repository.CrudRepository;

public interface StudentsRepository extends CrudRepository<Students, Integer> {
}
