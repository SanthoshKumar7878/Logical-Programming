package arrays;

public class MainAsciiToCharacter 
{
   public static void main(String[] args) 
   {
	int data = 65;
	int[] integer = new int[26];
	for(int i=0; i<integer.length;i++)
	  {
		integer[i] = data++;
	  }
	char[] character = AsciiToCharacter.receiver(integer);
	DisplayCharacter.display(integer,character);
   }
}
