package org.sak;

import java.util.ArrayList;
import java.util.List;

public class Data {
	public static void main(String[] args) {
		Student s = new Student();
		s.setAge(20);
		s.setName("Sathish");
		s.setPhone(9085637485l);
		
		Student s1 = new Student();
		s1.setAge(30);
		s1.setName("Suresh");
		s1.setPhone(908675885l);
		
		Student s2 = new Student();
		s2.setAge(25);
		s2.setName("Varun");
		s2.setPhone(809756575l);
		
		List<Student> li = new ArrayList<Student>();
		li.add(s);
		li.add(s1);
		li.add(s2);
		
		for(int i=0;i<li.size();i++) {
			System.out.println("Age is "+li.get(i).getAge());
			System.out.println("Name is "+li.get(i).getName());
			System.out.println("Phone is "+li.get(i).getPhone());
			
			
			
		}
		}
		
		
	}


