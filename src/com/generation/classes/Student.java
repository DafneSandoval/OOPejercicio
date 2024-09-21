package com.generation.classes;

import java.util.ArrayList;
//import java.util.Date; //Ojo aquí
import java.util.List;

public class Student {
	 private String name;
     private String id;
     private int age;
     private List<Course> courseList = new ArrayList<>();
	 
	    // CONSTRUCTOR
	    public Student( String name, String id, int age)
	    {
	        this.name = name;
	        this.id = id;
	        this.age = age;
	        
	    }// constructorStudent
	    	    
	    
 //Getters && SETTERS //

		public String getName() {
			return name;
		} //getName

		public void setName(String name) {
			this.name = name;
		}//setName

		public String getId() {
			return id;
		}//getId

		public void setId(String id) {
			this.id = id;
		}//setId

		public int getAge() {
			return age;
		}//getAge

		public void setAge(int age) {
			this.age = age;
		}//setAge

		public List<Course> getCourseList() {
			return courseList;
		}//getCourseList
// getters y setters



       //ToSTRING
		@Override
		public String toString() {
			return "Student [name=" + name + ", id=" + id + ", age=" + age + "]";
		}//toString

}// class Student
