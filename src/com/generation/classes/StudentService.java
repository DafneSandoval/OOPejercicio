package com.generation.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.generation.exeptions.CourseNotFoundException;
import com.generation.exeptions.StudentNotFoundException;

public class StudentService {
   private HashMap<String, Course> courseList = new HashMap<>();
   private HashMap<String, Student> students = new HashMap<>(); // Mantener ojo aquí
   private HashMap<String, List<Course>> coursesEnrolledByStudents = new HashMap<>();

 
	    public StudentService()
	    {
	        courseList.put( "Math", new Course( "Math", 10, "Aurelio Baldor" ) );
	        courseList.put( "Physics", new Course( "Physics", 10, "Albert Einstein" ) );
	        courseList.put( "Art", new Course( "Art", 10, "Pablo Picasso" ) );
	        courseList.put( "History", new Course( "History", 10, "Sima Qian" ) );
	        courseList.put( "Biology", new Course( "Biology", 10, "Charles Darwin" ) );
	    } //courseList
	    
	    
	    //GETTERS && SETTERS
	    public HashMap<String, Course> getCourseList() {
			return courseList;
		}//getCourseList

		public void setCourseList(HashMap<String, Course> courseList) {
			this.courseList = courseList;
		}//setCourseList

		public HashMap<String, Student> getStudents() {
			return students;
		}//getStudents

		public void setStudents(HashMap<String, Student> students) {
			this.students = students;
		}//setStudents

		public HashMap<String, List<Course>> getCoursesEnrolledByStudents() {
			return coursesEnrolledByStudents;
		}//HashMapListGroup

		public void setCoursesEnrolledByStudents(HashMap<String, List<Course>> coursesEnrolledByStudents) {
			this.coursesEnrolledByStudents = coursesEnrolledByStudents;
		 //setCoursesEnrolledByStudents
		} // geters y setters
		
		
		 //ENROLLSTUDENTS//
	    public void enrollStudents( String courseName, String studentID )
	    { Course course = courseList.get( courseName );

	        if ( !coursesEnrolledByStudents.containsKey( studentID ) )
	        {
	            coursesEnrolledByStudents.put( studentID, new ArrayList<>() );
	        }
	        coursesEnrolledByStudents.get( studentID ).add( course );
	    }//enrollStudents

		// UNENROLL //
	    public void unEnrollStudents( String courseName, String studentID )
	    throws CourseNotFoundException, StudentNotFoundException{
	    	if (! courseList.containsKey(courseName)) {
	    		throw new CourseNotFoundException (courseName);
	    	}//if
	    	if (! students.containsKey(studentID)) {
	    		throw new StudentNotFoundException(courseName);
	    	} //if
	    
	    Course course = courseList.get( courseName );

	        if ( coursesEnrolledByStudents.containsKey( studentID ) )
	        {
	            coursesEnrolledByStudents.get( studentID ).remove( course );
	        }
	    } //unEnrollStudents
	    
         //COLLECTION LOOPS  X
	    public void showEnrolledStudents(String courseId){
	        //TODO implement using collections loops
	    	Course course = courseList.get(courseId);
	    	for (String studentId: coursesEnrolledByStudents.keySet()) {
	    		List <Course> allCourse = coursesEnrolledByStudents.get(studentId);
	    		if (allCourse.contains(course)) {
	    			Student student = students.get(studentId);
	    			System.out.print(student);
	    	}//if
	    	}//forEach
	    } //showEnrollStudents

	    public void showAllCourses(){
	    	for (Course course: courseList.values()) {
	    		System.out.print(course);
	    	}//forEach
	      
	    
	    } // Student
   

		@Override
		public String toString() {
			return "StudentService [getCoursesEnrolledByStudents()=" + getCoursesEnrolledByStudents() + ", getName()="
					+ ", getId()=" +  ", getAge()]";
		}//toString


		public void addStudent(Student student) {
			 students.put(student.getId(), student);
		}

} // class StudentService
