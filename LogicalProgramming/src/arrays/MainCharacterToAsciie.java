package arrays;

public class MainCharacterToAsciie 
{
  public static void main(String[] args)
  {
	char data = '0';
	char[] character;
	character = new char[10];
	for(int i=0;i<character.length;i++)
	{
		character[i] = data++;
	}
	
	int[] integer = CharacterToAscii.receiverFormMain(character);
	
	DisplayAscii.receiver(character, integer);
  }
}
