package arrays;

public class MainOfDisplayStringToCharacterAlphabet
{
    public static void main(String[] args) 
    {
	   String[] str = StringTypeArray.sender();	
	   DisplayAlphabetInArray.receiver(str);
	   System.out.println();
	   char[] upperCase =  StringToCharacterConversion.verifierCumSender(str, true);
	   DisplayAlphabetInArray.receiver(upperCase,true);
	   System.out.println();
	   char[] lowerCase =  StringToCharacterConversion.verifierCumSender(str, false);
	   DisplayAlphabetInArray.receiver(lowerCase,false);  
	}
}
