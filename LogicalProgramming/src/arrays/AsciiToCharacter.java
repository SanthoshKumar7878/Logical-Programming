package arrays;

public class AsciiToCharacter 
{
  public static char[] receiver(int[] integer)
  {
	  char[] character;
	  character = new char[integer.length];
	  for(int i=0;i<character.length;i++)
	  {
		  character[i] = (char) integer[i];
	  }
	  return character;
  }
}
