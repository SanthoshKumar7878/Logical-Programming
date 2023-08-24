package arrays;

public class AlphabetInUpperAndLowerCase
{
   public static void main(String[] args)
    {
      	char[] upperCase;
      	upperCase = CharacterTypeArray.verifierCumSender(true);
      	DisplayAlphabet.receiver(upperCase, true);
      	System.out.println();
      	
      	char[] lowerCase;
      	lowerCase = CharacterTypeArray.verifierCumSender(false);
      	DisplayAlphabet.receiver(lowerCase, false);
      	System.out.println();
      	
      	String[] alphabet;
      	alphabet = CharacterToString.receiverCumSender(upperCase, lowerCase);
      	DisplayAlphabet.receiver(alphabet);
    }
}
