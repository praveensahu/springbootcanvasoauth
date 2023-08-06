package com.canvas.repository;

import org.springframework.data.repository.CrudRepository;

import com.canvas.model.Courses;

public interface CourseRepository extends CrudRepository<Courses, Integer> {
}
