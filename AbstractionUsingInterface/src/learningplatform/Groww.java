package learningplatform;

public class Groww implements Training
{

	@Override
	public void course() 
	{
		System.out.println("WELCOME To Groww");
		System.out.println("COURSE OFFERED : Developement");
	}
	@Override
	public void time() 
	{
		System.out.println("TIME : 3 Months");
	}

	@Override
	public void price()
	{
		System.out.println("PRICE : 30000");
	}
  
}
