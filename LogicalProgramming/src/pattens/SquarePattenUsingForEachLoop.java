package pattens;

public class SquarePattenUsingForEachLoop 
{
  public static void main(String[] args) 
  {
	  int number = 0;
	  int[] num;
	  num = new int[10];
	  for (int i = 0; i < num.length; i++) 
		 {
			num[i] = number++;
		 }
		
	int data = 1;
	int[] a;
	a = new int[5];
	for (int i = 0; i < a.length; i++) 
	 {
		a[i] = data++;
	 }
	
	int data1 = 1;
	int[] b;
	b = new int[5];
	for (int i = 0; i < b.length; i++) 
	 {
		b[i] = data1++;
	 }
	
	
	for(int z : num)
	{
		for (int x : a) 
		 {
			for (int y : b)   
			 {
				System.out.print(z+" ");
			 }
			System.out.println();
		 }
		System.out.println();
	}
	
	
	
  }
}
