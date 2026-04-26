package org.example.hexlet.dto.courses;

import java.util.List;

import org.example.hexlet.model.Course;

import lombok.Getter;

@Getter
public class CoursesPage {
 private List<Course> courses;
 private String term;
 private String filter;

 public CoursesPage(List<Course> courses, String term, String filter) {
     this.courses = courses;
     this.term = term;
     this.filter = filter;
 }
}
