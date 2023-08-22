package arrays;

public class DisplayAscii 
{
    public static void receiver(char[] character,int[] integer)
    {
    	System.out.println("ASCII code for the Characters");
    	System.out.println("-----------------------------");
    	for(int i=0;i<character.length;i++)
    	{
    		System.out.println("character: "+character[i]+" ASCII value is: "+integer[i]);
    	}
    }
}
