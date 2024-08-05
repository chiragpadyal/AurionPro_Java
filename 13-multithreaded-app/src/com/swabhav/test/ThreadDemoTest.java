package com.swabhav.test;

import com.swabhav.model.MyThread;

public class ThreadDemoTest {
 
 public static void main(String[] args) {
  // TODO Auto-generated method stub
 
  MyThread thread1 = new MyThread("Thread1");
  MyThread thread2 = new MyThread("Thread2");
  MyThread thread3 = new MyThread("Thread3");
  
  thread1.setPriority(Thread.MAX_PRIORITY);
  thread1.setPriority(Thread.NORM_PRIORITY);
  thread1.setPriority(Thread.MIN_PRIORITY);
  
  System.out.println(thread1.isAlive()); // for printing name
  System.out.println(thread2.isAlive()); // for printing name
  System.out.println(thread3.isAlive()); // for printing name
  
  for(int i=5; i>0; i--) {
   System.out.println(Thread.currentThread().getName()+ ":"+i);
   try {
    Thread.sleep(5000);
   } catch (InterruptedException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
   }
  }
  
  try {
	thread1.join();
	thread2.join();
	thread3.join();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
  
  
  System.out.println(thread1.isAlive()); // for printing name
  System.out.println(thread2.isAlive()); // for printing name
  System.out.println(thread3.isAlive()); // for printing name
 }

 
}
