package Thread;
public class multithreading 
{
	//class A implements runnable
	//class A extends Thread
	
	class A implements Runnable
	{
	public void run() 
	{
		System.out.println("Thread A is started");
		for(int i=0;i<=10;i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("value of i "+i);
		}
		System.out.println("Thread A is Exit");
		
			
			}
		
			
   class B implements Runnable
   {
	   public void run()
	   {
		   System.out.println("Thread B is started");
		   for(int j=0;j<=10;j++)
		   {
			   System.out.println("Value of j "+j);
			   
		   }
		   System.out.println("Thread B is Exit");
		   
	}
   }
   class C implements Runnable
   {
	   public void run()
	   {
		   System.out.println("Thread C is started");
		   for(int k=0; k<=10; k++);
		   {
	       System.out.println("Value of k "+k);
		   }
   
          System.out.println("Thread C is Exit");
	}
   }
   public class Multithreading
   {
	   
	public static void main(String[] args) 
	{
         A obj1=new A();
         B obj2=new B();
         C obj3=new C();
         
         Thread t1=new Thread(obj1);
         Thread t2=new Thread(obj2);
         Thread t3=new Thread(obj3);
         
         t1.setName("A");
         t2.setName("B");
         t3.setName("C");
         
         System.out.println(t1.getName());
         System.out.println(t2.getName());
         System.out.println(t3.getName());
         
         t1.start();
         t2.start();
         t3.start();
         
         System.out.println("Exit from the main");
	}
   }
   
         
         
         
	}

}
