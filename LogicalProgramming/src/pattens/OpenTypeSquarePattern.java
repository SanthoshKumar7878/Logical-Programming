package pattens;

public class OpenTypeSquarePattern
{
   public static void main(String[] args)
   {
//	   // square open pattern
//	   for (int i = 0; i < 5; i++) 
//	   {
//		  for (int j = 0; j < 5; j++)
//		  {
//			if(i==0||i==4||j==0||j==4)
//			{
//				System.out.print("*"+" ");
//			}
//			else
//			{
//				System.out.print(" "+" ");
//			}
//		  }
//		  System.out.println();
//	   }
//	   
//	   //square open pattern  in numbers
//	   char ch='0';
//	   for (int i = 0; i <=9; i++)
//	   {
//		   for (int j = 0; j < 5; j++) 
//		   {
//			  for (int k = 0; k < 5; k++)
//			  {
//				if(j==0||j==4||k==0||k==4)
//				{
//					System.out.print(ch+" ");
//				}
//				else
//				{
//					System.out.print(" "+" ");
//				}
//			  }
//			  System.out.println();
//		   }
//		   System.out.println();
//		   ch++;
//	   }
//	
//	   
//	   
	   
	   //square open pattern in alphabet
	 //square open pattern  in numbers
	   char cha='A';
	   for (int i = 0; i <26; i++)
	   {
		   for (int j = 0; j < 5; j++) 
		   {
			  for (int k = 0; k < 5; k++)
			  {
				if(j==0||j==4||k==0||k==4)
				{
					System.out.print(cha+" ");
				}
				else
				{
					System.out.print(" "+" ");
				}
			  }
			  System.out.println();
		   }
		   System.out.println();
		   cha++;
	   }
   }
}
