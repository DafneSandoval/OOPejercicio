package com.generation.exeptions;

public class CourseNotFoundException extends Exception
{

    public CourseNotFoundException(String courseName)
    {
        super("course not found!!");
    } //constructor
} //class CourseNotFoundException
