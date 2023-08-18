package learningplatform;

public class Unacademy implements Training
{

	@Override
	public void course() 
	{
		System.out.println("WELCOME To Unacademy");
		System.out.println("COURSE OFFERED : Testing");
	}
	@Override
	public void time() 
	{
		System.out.println("TIME : 3 Months");
	}

	@Override
	public void price()
	{
		System.out.println("PRICE : 26000");
	}
  
}
