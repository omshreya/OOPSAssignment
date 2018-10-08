package demo;


public class Hamburger 
{
	private String rollType;
	private String meat;
	public final double price;
	private String burgerType;
	private int tomato;
	private int onion;
	double burgerPrice=0;
	
	public Hamburger()
	{
		this("ciabatta roll","brisket",100,"Normal Buger",10,10);
	}
	public Hamburger(String rollType, String meat, double price, String burgerType,int tomato,int onion) 
	{
		this.setRollType(rollType);
		this.setMeat(meat);
		this.price = price;
		this.setBurgerType(burgerType);
		this.tomato=tomato;
		this.onion=onion;
	}
	
	public void calculatePrice(int choice)
	{
		if(choice==1)
		{
			burgerPrice=price+tomato;
		}
		if(choice==2)
		{
			burgerPrice=price+onion;
		}
		if(choice!=1 && choice!=2)
		{
			burgerPrice=price;
		}
		
		System.out.println("Price of burger is:"+burgerPrice);
	}
	public String getRollType() {
		return rollType;
	}
	public void setRollType(String rollType) {
		this.rollType = rollType;
	}
	public String getMeat() {
		return meat;
	}
	public void setMeat(String meat) {
		this.meat = meat;
	}
	public String getBurgerType() {
		return burgerType;
	}
	public void setBurgerType(String burgerType) {
		this.burgerType = burgerType;
	}
	
}