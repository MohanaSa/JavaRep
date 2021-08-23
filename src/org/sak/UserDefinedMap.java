package org.sak;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class UserDefinedMap {
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
		Map<Integer,Student> mp = new TreeMap<Integer,Student>();
		mp.put(1 , s);
		mp.put(2  , s1);
		mp.put(3  , s2);
		Set<Entry<Integer,Student>> po  = mp.entrySet();
		
		
		for(Entry<Integer , Student> x:po) {System.out.println(x.getKey()+"  Student Details");
			System.out.println("Age is "+x.getValue().getAge());
			System.out.println("Name is "+x.getValue().getName());
			System.out.println("Phone is "+x.getValue().getPhone());
			
			
			
		}
		
	}

}
