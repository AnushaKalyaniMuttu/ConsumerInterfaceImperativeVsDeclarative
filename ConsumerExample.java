package com.consumer.imp;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
static	Consumer<Student> consumer=(s)->System.out.println(s);
static	Consumer<Student> name=(student)->System.out.print(student.getName());
static	Consumer<Student> activity=(student)->System.out.println(student.getActivities());
	public static void printName() {
		
		List<Student> studentList=StudentDatabase.getAllStudents();
		studentList.forEach(consumer);
		
	}
	
	public static void printNameAndActivities() {
		
		List<Student> studentList=StudentDatabase.getAllStudents();
		studentList.forEach(name.andThen(activity));//consumer chaining
	}
	
	public static void printNameAndActivitiesUsingCondition() {
		List<Student> studentList=StudentDatabase.getAllStudents();
		studentList.forEach(student->{
			if(student.getGradeLevel()>=3 && student.getGpa()>=3.9) {
				name.andThen(activity).accept(student);
			}
		});
	}
	public static void main (String [] args) {
		printName();
		System.out.println("*********************************************");
		printNameAndActivities();
		System.out.println("*********************************************");

		printNameAndActivitiesUsingCondition();
	}
	
}
