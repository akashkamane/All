package com.spring.di;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope(value="prototype")
public interface Course {
public int getCourseDuration();
public List<String> getCourseContents();
public double getCourseFees();

public void myCourse();
}
