package arrays;

public class DisplayCharacter 
{
   public static void display(int[] integer,char[] character) 
   {
	   System.out.println("Ascii value to character value");
	   System.out.println("------------------------------");
	   for (int i = 0; i < character.length; i++)
	    {
		  System.out.println(integer[i]+" is equle to character of "+ character[i]); 
	    }
   }
}
