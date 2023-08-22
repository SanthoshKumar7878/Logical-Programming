package arrays;

public class CharacterToAscii
{
   public static int[] receiverFormMain(char[] character)
    {
	   int[] integer;
	   integer = new int[character.length];
	   for(int i=0;i<integer.length;i++)
	   {
		   integer[i] = character[i];
	   }
	   return integer;
    }
}
