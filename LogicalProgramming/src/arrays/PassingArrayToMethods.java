package arrays;

public class PassingArrayToMethods
{
   static java.util.Scanner sc=new java.util.Scanner(System.in);
   public static void main(String[] args)
   {
	   int[] array;
	   System.out.println("Enter the size of the integer type of array");
	   int size = sc.nextInt();
	   array = new int[size];
	   for(int i=0;i<array.length;i++)
	   {
		   System.out.println("Enter the elements of the integer type array at "+i+" index");
		   array[i] =sc.nextInt();
	   }
	   Display.receiver(array);
   }
}
