package org.sak;

import java.util.LinkedHashSet;
import java.util.Set;

public class UserDefinedSet {
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
		
Set<Student> si = new LinkedHashSet<Student>();
si.add(s);
		si.add(s1);
		si.add(s2);
		
		for(Student x:si) {
			System.out.println("Age is "+x.getAge());
			System.out.println("Name is "+x.getName());
			System.out.println("Phone is "+x.getPhone());
			
			
			
		}
	}

}
