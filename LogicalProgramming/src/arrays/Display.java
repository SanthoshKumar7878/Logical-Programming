package arrays;

public class Display 
{
  public static void receiver(int[] array)
  {
	  System.out.println("Element of the integer type array");
	  System.out.println("---------------------------------");
	  for(int i=0;i<array.length;i++)
	  {
		  System.out.print(array[i]+" ");
	  }
  }
}
