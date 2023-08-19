package arrays;
import java.util.Scanner;
public class SimpleArray 
{
   public static final Scanner sc = new Scanner(System.in);
   public static void main(String[] args)
   {
	   char[] array;
	   System.out.println("Enter the size of the Character type array");
	   int size = sc.nextInt();
	   array =  new char [size];
	   for(int i=0;i<array.length;i++)
	    {
	     System.out.println("Enter the element of character array at "+i+" index");
	     array[i] = sc.next().charAt(0);
	    }
	   System.out.println("Element of the character type arrays");
	   System.out.println("------------------------------------");
	   for(int i=0;i<array.length;i++)
	    {
		   System.out.print(array[i]+" ");
	    }
   }
}
