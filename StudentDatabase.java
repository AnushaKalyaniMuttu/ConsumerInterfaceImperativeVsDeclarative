package com.consumer.imp;

import java.util.Arrays;
import java.util.List;

public class StudentDatabase {

	public static List<Student> getAllStudents(){
		Student s1=new Student("Adam",2,3.6,"male",Arrays.asList("swimming","basketball","volleyball"));
		Student s2=new Student("Jenny",2,3.6,"female",Arrays.asList("swimming","gymnastic","soccer"));
		Student s3=new Student("Emily",3,4.0,"male",Arrays.asList("swimming","basketball","aerobics"));
		Student s4=new Student("Dave",3,4.0,"female",Arrays.asList("swimming","basketball","volleyball"));
		Student s5=new Student("Sophia",4,3.5,"female",Arrays.asList("swimming","dancing","football"));
		Student s6=new Student("James",4,3.9,"male",Arrays.asList("swimming","basketball","baseball","football"));
		List<Student> students=Arrays.asList(s1,s2,s3,s4,s5,s6);
		return students;

	}
}
