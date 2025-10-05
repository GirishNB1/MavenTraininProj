package com.work;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExtensionEx {

	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
     B b=new B();
     B.show();
     A a=new A();
     System.out.println(a);
     System.out.println(a.clone());
     
     Student s1=new Student(0);
     Student s2=new Student(2);
     Student s3=new Student(1);
     List<Student> li=null;
     Collections.sort(li=Arrays.asList(s1,s2,s3));
     System.out.println(li);
     
     Class<?> any= Class.forName("com.work.A");
    Constructor<?>[] cons= any.getDeclaredConstructors();
     Object obs= cons[0].newInstance(null);
     System.out.println(obs);
     
     
	}

}


class A implements Cloneable{
	public static void show() {
		System.out.println("Hello Geek");
	}
	
	private static void show2() {
		System.out.println("Hello Geek2");
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}

class B extends A{
	
}

class Student implements Comparable<Student>{
	int rooNo;
	
	public Student(int rlNo) {
		// TODO Auto-generated constructor stub
		this.rooNo=rlNo;
	}

	public int getRooNo() {
		return rooNo;
	}

	public void setRooNo(int rooNo) {
		this.rooNo = rooNo;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return o.getRooNo()-this.rooNo;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ""+this.rooNo;
	}
	
}
