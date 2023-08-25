package arrays;

public class StringToCharacterConversion 
{
   public static char[] verifierCumSender(String[] array,boolean status)
   {
	   char[] upperCase;
	   upperCase = new char[array.length];
	   char[] lowerCase;
	   lowerCase = new char[array.length];
	   for (int i = 0; i < array.length; i++) 
	     {
		   if(array[i].charAt(0)>='A'&&array[i].charAt(0)<='Z')
		     {
		        upperCase[i] = array[i].charAt(0);
		     }
		   if(array[i].charAt(1)>='a'&&array[i].charAt(1)<='z')
		     {
		       lowerCase[i] = array[i].charAt(1);
		     }
	     }
	   
	   if(status==true)
	   {
		   return upperCase;
	   }
	   else
	   {
		   return lowerCase;
	   }
   }
}
