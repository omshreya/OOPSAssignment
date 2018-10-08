package demo;

public class HealthyBurger extends Hamburger
{
	private int cheese=30;
	private int paneer=50;
	private double price1;
	
	public HealthyBurger()
	{
	}
	
	public HealthyBurger(int cheese,int paneer)
	{
		this.cheese=cheese;
		this.paneer=paneer;
	}
	
	public void calculatePrice(int choice)
	{
		if(choice==1)
		{
			price1=price+cheese;
		}
		if(choice==2)
		{
			price1=price+paneer;
		}
		if(choice!=1 && choice!=2)
		{
			price1=price;
		}
		System.out.println("Price of burger is:"+price1);
		
	}
}
