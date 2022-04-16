package Java8;

import java.util.function.Supplier;


public class SupplierEX 
{

		public static void main(String[] args)
		{
		Supplier<Double>sup=()->Math.random();
		System.out.println(sup.get());

		}

		}





