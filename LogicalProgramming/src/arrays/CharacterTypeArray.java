package arrays;

public class CharacterTypeArray
{
   public static char[] verifierCumSender(boolean status)
   {
	  char[] lowerCase;
	  lowerCase = new char[26];
	  char smallLetter='a';
	  for (int i = 0; i < lowerCase.length; i++) 
	  {
		  lowerCase [i] = smallLetter++;
	  }
	  
	  char[] upperCase;
	  upperCase = new char[26];
	  char captialLetter='A';
	  for (int i = 0; i < upperCase.length; i++) 
	  {
		  upperCase [i] = captialLetter++;
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
