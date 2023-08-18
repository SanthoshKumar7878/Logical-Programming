package learningplatform;

import java.util.Scanner;

public class MainOfTrining
{
	static Scanner sc;
  public static void main(String[] args)
  {
		  sc = new Scanner(System.in);
	  Factory f = new Factory();
	  System.out.println("Select any one of the following Training platform");
	  System.out.println("1.Udemy\n2.Qspider\n3.Unacademy\n4.Groww");
	  int choise = sc.nextInt();
	  switch (choise)
	    {
	      case 1 : f.get(new Udemy());
	               break;
	      case 2 : f.get(new Qspiders());
	               break;
	      case 3 : f.get(new Unacademy());
	               break;
	      case 4 : f.get(new Groww());
	               break;
	     } 
  }
}
