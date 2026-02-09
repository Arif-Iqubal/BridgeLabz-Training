package com.studentoperation;

public class Student {

	String name;
	int id;
	String firstName;
	int age;
	String gender;
	String city;
	int rank;
	String contacts;
	public Student(int id, String firstName,String name,  int age, String gender, String city, int rank,
			String contacts) {
		this.name = name;
		this.id = id;
		this.firstName = firstName;
		this.age = age;
		this.gender = gender;
		this.city = city;
		this.rank = rank;
		this.contacts = contacts;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	public String getCity() {
		return city;
	}
	public int getRank() {
		return rank;
	}
	public String getContacts() {
		return contacts;
	}
	
	 
	
	
}
