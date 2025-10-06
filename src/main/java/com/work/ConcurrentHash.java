package com.work;

public class ConcurrentHash {

	public static void main(String[] args) {
	  ConcurrentDemo map=new ConcurrentDemo();
	  try {
		  
	  Thread t1=new Thread( ()->{
		try {
			map.push(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	});
		  
	  
	  Thread t2=new Thread( ()->{
			try {
				map.push(11);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	  
	  Thread t3=new Thread( ()->{
			try {
				map.push(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	  
	  t1.start();t2.start();t3.start();
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
	}

}


class ConcurrentDemo{
	Integer[] arr=new Integer[] {0,0,0,0,0,0,0,0,0,0};

	void push(int data) throws InterruptedException {
		int hash=data%10;
		synchronized (arr[hash]) {
			
			arr[hash]=data;
			System.out.println("adding data " +arr[hash]);
			Thread.sleep(3000);
			
		}
	}
	
}
