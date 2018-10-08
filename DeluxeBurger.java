package demo;

public class DeluxeBurger extends Hamburger
{
	private int chips=10;
	private int drinks=20;
	private double price2;
	
	public DeluxeBurger()
	{
	}
	
	public DeluxeBurger(int chips,int drinks)
	{
		this.chips=chips;
		this.drinks=drinks;
	}
	
	public void calculatePrice(int choice)
	{
		if(choice==1)
		{
			price2=price+chips;
		}
		if(choice==2)
		{
			price2=price+drinks;
		}
		if(choice!=1 && choice!=2)
		{
			price2=price;
		}
		System.out.println("Price of burger is:"+price2);
	}
}
