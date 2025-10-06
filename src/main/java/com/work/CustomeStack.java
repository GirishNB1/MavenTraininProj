package com.work;

import java.util.Stack;

public class CustomeStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    CStack<String> stk=new CStack();
    stk.add("manu");
    stk.add("Guru");
    System.out.println(stk.peek());
	}

}


class CStack<T>{
	int top;
	Object[] arr;
	 CStack(){
		top=-1;
		
		this.arr=new Object[10];
	}
	 
   public void  add(T data) {
	   arr[++top]=data;
   }
   
   public T peek() {
	   return (T)arr[top];
   }
}