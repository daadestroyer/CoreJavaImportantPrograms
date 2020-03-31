package com.koolnigam.app15;
// DEFINING A ANONYMOUS INNER CLASS BY EXTENDING A CLASS

/*
NORMAL CLASS APPROACH
=====================
class MyThread extends Thread
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
    MyThread t = new MyThread();
    t.start();
    for(int i=0 ; i<10 ; i++)
    {
     sopln("Main Thread"):
    }
  }
}
*/

/* ANONYMOUS INNER CLASS APPROACH
====================================*/

public class ThreadDemo{

	public static void main(String[] args) {
		Thread t = new Thread()
		{
			public void run()
			{
				for (int i = 0; i < 10; i++) 
				{
					System.out.println("Child Thread");
				}
			}
		};
		t.start();
		for (int i = 0; i < 10 ; i++) {
			System.out.println("Main Thread");
		}
	}

}
