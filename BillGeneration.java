package demo;

import java.util.Scanner;

public class BillGeneration 
{

	public static void main(String[] args) 
	{
		int burgerType,choice;
		Hamburger burger;
		do
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("What buger you want??? \n 1:Hamburger \n 2:HealthyBurger \n 3:DeluxeBurger");
			System.out.println("Enter your choice:");
			burgerType=sc.nextInt();
			switch(burgerType)
			{
				case 1 : System.out.println("Hamburger");
				 		 System.out.println("What you want extra??? \n 1:tomato \n 2:onion \n 3:don't want any extra");
				 		 choice=sc.nextInt(); 
						 burger=new Hamburger();
						 burger.calculatePrice(choice);
						 break;
						 
				case 2 : System.out.println("Healthy burger");
						 System.out.println("What you want extra??? \n 1:cheese \n 2:paneer \n 3:don't want any extra");
						 choice=sc.nextInt(); 
						 burger=new HealthyBurger();
						 burger.calculatePrice(choice);
						 break;
						 
				case 3 : System.out.println("Deluxe burger");
				 		 System.out.println("What you want extra??? \n 1:chips \n 2:drinks \n 3:don't want any extra");
				 		 choice=sc.nextInt(); 
				 		 burger=new DeluxeBurger();
				 		 burger.calculatePrice(choice);
				 		 break;
				 		 
			}
			
		}while(burgerType!=0);
		
	}

}
