package com.test;

import java.util.Objects;

public class Student implements Comparable<Student> {
	String name;
	int rollNum;
	
	public Student(String name,int roll)
	{
		this.name=name;
		this.rollNum=roll;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNum=" + rollNum + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, rollNum);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && rollNum == other.rollNum;
	}

	

	@Override
	public int compareTo(Student that) {
		// TODO Auto-generated method stub
		return this.rollNum-that.rollNum;
		
		//return this.name.compareTo(that.name);
	}
	
	
	

}
