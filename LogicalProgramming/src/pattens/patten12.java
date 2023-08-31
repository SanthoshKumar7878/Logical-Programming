package pattens;

public class patten12 
{
   public static void main(String[] arg)
   {
	   char a= '0';
	   for (int i = 0; i <=9; i++) 
	   {
		   for (int j = 0; j <=i; j++)
		   {
			  for (int w = 0; w <=i; w++) 
			  {
				 System.out.print(a+" ");
			  }
			  System.out.println();
		   }
		   System.out.println();
		   a++;
	   }
	   
	   
	   //Using while loop
	   char b ='a';
	   int i =0;
	   while(i<26)
	   {
		   int j=0;
		   while(j<=i)
		   {
			   int w=0;
			   while(w<=i)
			   {
				   System.out.print(b+" ");
				   w++;
			   }
			   System.out.println();
			   j++;
		   }
		   System.out.println();
		   b++;
		   i++;
	   }
	   
	   //Using Dowhile loop
	  char c = 'A';
	  int p =0;
      do{
		   int q=0;
		   do{
			   int r=0;
			   do{
				   System.out.print(c+" ");
				   r++;
			   }while(r<=p);
			   System.out.println();
			   q++;
		   }while(q<=p);
		   System.out.println();
		   c++;
		   p++;
	   } while(p<26);
   }
}
