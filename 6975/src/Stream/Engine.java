package Stream;

interface Engine 
{
 void speed();
}

class Car
{
	public static void  average()
	{
		System.out.println("The average of the car is very Good");
		
	}

	public static void main(String[] args)
	{
		//using Lambda Expression
		Engine obj=()->System.out.println("Speed is Good");
		obj.speed();
		
		//Lambda replaced with static method Reference
		Engine obj1=Car::average;
		obj1.speed();
	}
}


