package arrays;

public class Addition
{
   public static int[] sender(int[]a,int[]b)
   {
	   int[] c;
	   c=new int[a.length];
	   for(int i=0;i<c.length;i++)
	   {
		   c[i]=a[i]+b[i];
	   }
	   return c;
   }
}
