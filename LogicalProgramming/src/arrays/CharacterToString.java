package arrays;

public class CharacterToString 
{
   public static String[] receiverCumSender(char[] a,char[] b)
   {
	   String[] alphabets;
	   alphabets = new String[a.length];
	   for (int i = 0; i < alphabets.length; i++) 
	   {
		  alphabets[i] = a[i]+""+b[i];
	   }
	   return alphabets;
   }
}
