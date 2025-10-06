package com.work;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(add(5,4));
      System.out.println(sub(5,4));
      System.out.println(prod(5,4));
	}
	 static int add(int a,int b) {
		return a+b;
	}
	
	 static int sub(int a,int b) {
		return a-b;
	}
	
	static int prod(int a,int b) {
		return a*b;
	}

}


