package arrays;

public class Test 
{
	static final java.util.Scanner sc = new java.util.Scanner(System.in);
   public static int[] sender()
   {
	   int[] array;
	   System.out.println("Enter the size of the integer type array");
	   // java.util.Scanner sc = new java.util.Scanner(System.in); 
	   // if we use scanner here it will not close so we declare it in outer method.
	   int size = sc.nextInt();
	   array = new int[size];
	   for(int i=0;i<array.length;i++)
	   {
		   System.out.println("Enter the element of the integer type array at "+i+" index");
		   array[i] = sc.nextInt();
	   }
	   return array;
   }
}
