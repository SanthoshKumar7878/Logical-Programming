package arrays;

public class DisplayAlphabet
{
   public static void receiver(char[] array,boolean status)
   {
	   if(status==true)
	   {
		   System.out.println("Upper case Aiphabets");
		   System.out.println("--------------------");
	   }
	   else
	   {
		   System.out.println("Lower case Aiphabets");
		   System.out.println("--------------------");
	   }
	   for (int i = 0; i < array.length; i++)
	    {
		   System.out.print(array[i]+" ");
	    }
	   System.out.println();
   }
   public static void receiver(String[] array)
   {
	   System.out.println("String representation of the Aiphabets");
	   System.out.println("--------------------------------------");
	   for (int i = 0; i < array.length; i++)
	     {
		   System.out.print(array[i]+" ");
	     }
	   System.out.println();
   }
}
