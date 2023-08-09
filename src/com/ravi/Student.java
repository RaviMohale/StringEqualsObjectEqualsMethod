package com.ravi;

public class Student {
	int id;
	String name;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(101,"John");
		Student s2 = new Student(101, "John");
		
		System.out.println(s1.equals(s2)); // false- compare address
		
		// Object class equals() method will compare address of the object not content
		
		
		
		String s3 = new String("John");
		String s4 = new String("John");
		System.out.println(s3.equals(s4));  // true - compare content
		System.out.println(s3.concat(s4));//
		System.out.println("===================================");
		/*String class equals () method compare content of the object not address.git
		 * String class equals() method overridden to compare content of the object
		 * thats why in the above program for String we are getting 'true ' as output
		 */
		
		String s5 = "Ravi";
		String s6 = "Ravi";
				System.out.println(s5.equals(s6));//true
				
		System.out.println(s5.concat(s6));// RaviRavi
		s5.concat(s6);
		System.out.println(s5); //  Ravi  String is immutable
		System.out.println("**********************");
		StringBuffer sb1 = new StringBuffer("Ravi");
		StringBuffer sb2 = new StringBuffer("Ravi");
		System.out.println(sb1.append(sb2)); // RaviRavi
		sb1.append(sb2);
		System.out.println(sb1);//RaviRaviRavi  StringBuffer are mutable..
		
		
	}

}
