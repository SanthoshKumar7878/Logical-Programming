package learningplatform;

public class Udemy implements Training
{

	@Override
	public void course() 
	{
		System.out.println("WELCOME To Udemy");
		System.out.println("COURSE OFFERED : Testing and WebDevelopement");
	}
	@Override
	public void time() 
	{
		System.out.println("TIME : 3to4 Months");
	}

	@Override
	public void price()
	{
		System.out.println("PRICE : 30950");
	}
  
}
