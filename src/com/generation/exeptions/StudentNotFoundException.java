package com.generation.exeptions;

public class StudentNotFoundException
    extends Exception
{

    public StudentNotFoundException(String courseName )
    {
        super( "Student not found!" );
    } //constructor
} // classStudentNotFoundException
