package org.example.hexlet.dto.courses;

import java.util.List;

import org.example.hexlet.dto.BasePage;
import org.example.hexlet.model.Course;

import lombok.Getter;

@Getter
public class CoursesPage extends BasePage{
 private List<Course> courses;
 private String term;
 private String filter;

 public CoursesPage(List<Course> courses, String term, String filter) {
     this.courses = courses;
     this.term = term;
     this.filter = filter;
 }

 public CoursesPage(List<Course> courses) {
     this.courses = courses;
 }

}
