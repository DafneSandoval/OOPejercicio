package com.generation;

import com.generation.classes.Student;
import com.generation.classes.StudentService;
import com.generation.exeptions.CourseNotFoundException;
import com.generation.exeptions.StudentNotFoundException;

public class Main {

    public static void main(String[] args) throws StudentNotFoundException, CourseNotFoundException {
	    StudentService studentService = new StudentService();
	    //TODO refactor this code to use encapsulation inside studentsService (done)
	    studentService.addStudent (new Student ( "Carlos", "1030", 31 ));
	    studentService.addStudent (new Student ( "Ian", "1020", 28 ));
	    studentService.addStudent (new Student ( "Elise", "1020", 26));
	    studentService.addStudent (new Student ( "Carlos", "1020", 31 ));
        studentService.addStudent (new Student( "Santiago", "1040", 33 ));
        
        studentService.enrollStudents( "Math01", "1030" );
        
        studentService.enrollStudents("Math01", "1020");
        studentService.enrollStudents("History", "1040");
   
        studentService.showAllCourses();

    }// main
}// class main