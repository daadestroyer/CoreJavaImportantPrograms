package com.koolnigam.app16;
//DEFINING A ANONYMOUS INNER CLASS BY IMPLEMENTING A INTERFACE

/*
NORMAL CLASS APPROACH
=====================
class MyRunnable implements Runnable
{
  public void run()
  {
   for(int i=0 ; i <10 ; i++)
    {
      sopln("Child Thread");
    }
  }
}
class ThreadDemo
{
  psvm(String[] args)
  {
    MyRunnable r = new MyRunnable();
    Thread t = new Thread(r);
    t.start();
    for(int i=0 ; i<10 ; i++)
    {
     sopln("Main Thread"):
    }
  }
} 
*/
public class ThreadDemo {

	public static void main(String[] args) {
		
		Runnable r = new Runnable() // here we're not creating object for Runnable interface here we're creating object of that anonymous inner class that implements Runnable interface
		{
			public void run()
			  {
			   for(int i=0 ; i <10 ; i++)
			    {
			      System.out.println("Child Thread");
			    }
			  }
		};
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10 ; i++) {
			System.out.println("Main Thread");
		}
	}

}
