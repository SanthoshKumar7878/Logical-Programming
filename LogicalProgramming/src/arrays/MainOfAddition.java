package arrays;

public class MainOfAddition
{
	static java.util.Scanner SCANNER = new java.util.Scanner(System.in);
  public static void main(String[] args)
  {
	  int[] a;
	   System.out.println("Enter the size of the first integer type of array");
	   int size = SCANNER.nextInt();
	   a = new int[size];
	   for(int i=0;i<a.length;i++)
	   {
		   System.out.println("Enter the elements of the first integer type array at "+i+" index");
		   a[i] =SCANNER.nextInt();
	   }
	   Display.receiver(a);
	   
	   int[] b;
	   System.out.println("Enter the size of the second integer type of array");
	   int size1 = SCANNER.nextInt();
	   b = new int[size1];
	   for(int i=0;i<a.length;i++)
	   {
		   System.out.println("Enter the elements of the second integer type array at "+i+" index");
		   b[i] =SCANNER.nextInt();
	   }
	   Display.receiver(b);
	   
	  int[]  add=Addition.sender(a, b);
	  System.out.println("addition of two arrays");
	  Display.receiver(add);
	  
  }
}