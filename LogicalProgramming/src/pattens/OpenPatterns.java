package pattens;
import java.util.ArrayList;

public class OpenPatterns 
{
    public static void main(String[] args)
    {
    	
//    	//open pattern for number in grow
//    	for (int i = 0; i <=9; i++) 
//    	{
//			  for (int j = 0; j <=i; j++) 
//			  {
//				 for (int j2 = 0; j2 <=i; j2++) 
//				 {
//					if(j==0||j2==0||j==i||j2==i)
//					{
//						System.out.print(i+" ");
//					}
//					else
//					{
//						System.out.print(" "+" ");
//					}
//				 }
//				 System.out.println();
//			  }
//			  System.out.println();
//		}
//    	
    	
    	
    	//open pattern for alphabet in grow
    	
    	int data = 0;
  	    int[] a;
  	    a = new int[26];
  	    for (int i = 0; i < a.length; i++) 
  	   	  {
  		 	a[i] = data++;
  		  }
  	    ArrayList<Integer> b = new ArrayList<Integer>();
     	
  	    char ch='A';
  	    for(int x:a)
  	    {
  	    	b.add(x);
  	    	for(int y:b)
  	    	{
  	    		for(int z:b)
  	    		{
  	    			if(y==0|| z==0 ||y==x || z==x )
  	    			{
  	    				System.out.print(ch+" ");
  	    			}
  	    			else
  	    			{
  	    				System.out.print(" "+" ");
  	    			}
  	    		}
  	    		System.out.println();
  	    	}
  	    	System.out.println();
  	    	ch++;
  	    }
  	    
    }
}
