//Inventory Management System

package Project;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

class InventoryDemoInventory
{
	static int productid;
	String productname;
	int Quantity;
	String Description;
	float Price;
	
	public InventoryDemoInventory(int productid, String productname, int Quantity, String Description, float price)
	{
		this.productid=productid;
		this.productname=productname;
		this.Quantity=Quantity;
		this.Description=Description;
		this.Price=price;
		
	}
	
	public String toString()
	{
		return("\nProduct Details:"+"\nPRODUCTID:"+this.productid+"\nPRODUCTNAME:"+this.productname+"\nQUANTITY:"+this.Quantity+"\nDESCRIPTION:"+this.Description+"\nPRICE:"+this.Price);	
	}
}
	
	
  class InventoryDemo
{
    public static void display(ArrayList<InventoryDemoInventory>al)
	{
		System.out.println("\n-----------Product List-----------\n");
		System.out.println(String.format("%-10s%-15s%-10s%-20s%-10s","PRODUCTID","PRODUCTNAME","QUANTITY","DESCRIPTION","PRICE"));
		
		for(InventoryDemoInventory d:al)
			
		{
			System.out.println(String.format("%-5s%-20s%-10s%-15s%-10s",d.productid,d.productname,d.Quantity,d.Description,d.Price));
		}
	}

	private static int productid;
	
	public static void main(String[] args)
	{
		int Productid;
		String productname;
		int Quantity;
		String Description;
		float Price;
		
		Scanner sc=new Scanner(System.in);
		ArrayList<InventoryDemoInventory> al=new ArrayList<InventoryDemoInventory>();
		
		File f=null;
		FileInputStream fis=null;
		ObjectInput ois=null;
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		try
		{
			f=new File("/home/Divya/eclipse.workspace/InventoryDemo/src/InventoryDemo");
			if(f.exists())
			{
				fis=new FileInputStream(f);
				al=(ArrayList<InventoryDemoInventory>)ois.readObject();
			}
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		do
		{
			System.out.println("\n*************Welcome to Inventory Management System**********\n");
			System.out.println("1). Add Product to the Database\n"+ "2). Search for Product\n"+ "3). Edit Product deatils\n"+ "4).Delete product details\n"+ "5). Display all Produts in the supermarket\n"+ "6). Exit\n");
			System.out.println("Enter Your Choice :");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1: System.out.println("Enter the following details to ADD List:\n");
			System.out.println("Enter Product ID:");
			Productid=sc.nextInt();
			System.out.println("Enter Product Name:");
			productname=sc.next();
			System.out.println("Enter Quantity:");
			Quantity=sc.nextInt();
			System.out.println("Enter Description:");
			Description=sc.next();
			System.out.println("Enter Price:");
			Price=sc.nextFloat();
			al.add(new InventoryDemoInventory(Productid,productname,Quantity,Description,Price));
			display(al);
			break;
			
			case 2: System.out.println("Enter the Product id to search:");
			Productid=sc.nextInt();
			int i=0;
			for(InventoryDemoInventory d:al)
			{
				try {
					if(productid==d.productid)
					{
						System.out.println(d+"\n");
						i++;
						
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				if(i==0)
				{
					System.out.println("\n Product details are not available, please enter a valid productid:");
				}
				break;
			
				
				case 3: System.out.println("\nEnter the Product id to Edit the details");
				Productid=sc.nextInt();
				int j=0;
				for(InventoryDemoInventory d1:al)
				{
					if(productid==d1.productid)
					{
						j++;
						do
						{
							int ch1=0;
					System.out.println("\nEdit product details:\n"+"1).Product ID\n"+ "2). Productname\n"+ "3).Quantity\n"+ "4).Description\n"+ "5).Price\n"+ "6).GO BACK\n");
			System.out.println("Enter your choice:");
			ch1=sc.nextInt();
			switch(ch1)
			{
				case 1: System.out.println("Enter New Product Id:");
				d1.productid=sc.nextInt();
				System.out.println(d1+"\n");
				break;
				
				case 2: System.out.println("Enter New Product Name:");
				sc.nextLine();
				d1.productname=sc.next();
				System.out.println(d1+"\n");
				break;
				
				case 3: System.out.println("Enter New Product Quantity:");
				d1.Quantity=sc.nextInt();
				System.out.println(d1+"\n");
				break;
			
				case 4: System.out.println("Enter New Product Description:");
				d1.Description=sc.nextLine();
				System.out.println(d1+"\n");
				break;
				
				case 5: System.out.println("Enter Product Price:");
				d1.Price=sc.nextFloat();
				System.out.println(d1+"\n");
				break;
				
				case 6: j++;
				break;
				default:  System.out.println("\nEnter the correct choice from the List:");
				break;
						}
						}
						while(j==1);
					}
				}
				if(j==0)
				{
					System.out.println("\nProduct details are not available.Please enter a valid ProductID:");
				}
				break;
				
				case 4: System.out.println("\nEnter product ID to DELETE from the Database:");
				Productid=sc.nextInt();
			    int k=0;
			    try
			    {
			    	for(InventoryDemoInventory d1:al)
			    	{
			    		try {
							try {
								if(productid==d1.productid)
								{
									al.remove(d1);
									display(al);
									k++;
								}
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			    	}
			    	if(k==0)
			    	{
			    		System.out.println("\nProduct Details are not available.please enter a valid ProductID:");
			    	}
			    }
			    catch(Exception ex)
			    {
			    	System.out.println(ex);
			    }
			    break;
			    case 5:try
			    {
			    	al=(ArrayList<InventoryDemoInventory>)ois.readObject();
			    }
			    catch(ClassNotFoundException e2)
			    {
			    	System.out.println(e2);
			    }
			    catch(Exception e2)
			    {
			    	System.out.println(e2);
			    	
			    }
			    display(al);
			    break;
			    
			    case 6:try
			    {
			    	fos=new FileOutputStream(f);
			    	oos=new ObjectOutputStream(fos);
			    	oos.writeObject(al);
			    }
			    catch(IOException e1)
			    {
			    	e1.printStackTrace();
			    }
			    catch(Exception e2)
			    {
			    	e2.printStackTrace();
			    }
			    finally
			    {
			    	try
			    		{
			    			fis.close();
			    			ois.close();
			    			fos.close();
			    			oos.close();
			    		}
			    	
			    		catch(Exception e1)
			    		{
			    			e1.printStackTrace();
			    		}
			    	}
			    	System.out.println("\n You have chosen EXIT !!! saving Files are Closing the tool.");
			    	sc.close();
			    	System.exit(0);
			    	break;
			    
			    	default:System.out.println("\n Enter a correct choice from the List:");
			    	break;
			    }
			}
			while(true);
			}
 
}


		
				
		
				
				
			

