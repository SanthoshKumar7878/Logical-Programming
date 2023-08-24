package arrays;

import java.util.Scanner;

public class DaysOfWeek 
{
	static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
	   String[]	arr;
	   arr = new String[7];
	   System.out.println("Enter the days in a week one by one");
	   for (int i = 0; i < arr.length; i++)
	    {
		   arr[i] = sc.next();
    	}
	   System.out.println("      Days of the week        ");
	   System.out.println("      ----------------        ");
	   for (int i = 0; i < arr.length; i++) 
	   {
		   System.out.println((i+1)+" day of the week is "+arr[i]);
	   }
	}
}
