package string;

public class inbuildMethodsInStringClass
{
	 public static void main(String[] args)
	    {
	    	String str ="javarani";
	    	System.out.println(str.length());
	    	for (int i = 0; i < str.length(); i++) 
	    	{
	    		//it will print the character of the index and codePointAt() will print the ascii value of character
	    		System.out.println(str.charAt(i)+"--->"+str.codePointAt(i));
	    	}
	    	
	    	// it will print the length of the string from the given index
	    	System.out.println(str.codePointCount(0, str.length()));
	    	
	    	for (int i = str.length(); i>0 ; i--) 
	    	{
	    		//it will print the character ascii value of before index of i  
	    		System.out.println(str.codePointBefore(i));
	    	}
	    	
	    	String s1 = "javarani";
	    	String s2 = "javarani";
	    	// it will compare the characters of each string
	    	System.out.println(s1.compareTo(s2));
	    	// it will compare the characters of each string ignore case
	    	System.out.println(s1.compareToIgnoreCase(s2));
	    	
	    	String s3 = "corejava";
	    	String s4 = "corejava";
	    	// it will check for the character of string s4 is present in s3
	    	System.out.println(s3.contains(s4));
	    	// both string character is to be equal
	    	System.out.println(s3.contentEquals(s4));
	    	
	    	
	    	String str1 = "JAVARAJA";
	    	System.out.println(str1);
	    	String str2 = "sqlraja";
	    	System.out.println(str2);
	    	System.out.println(str1.startsWith("J"));
	    	System.out.println(str2.endsWith("i"));
	    	String str3 = str1.toLowerCase();
	    	System.out.println(str3);
	    	String str4 = str2.toUpperCase();
	    	System.out.println(str4);
	    	
	    	
	    	
	    	char[] array;
	    	array = new char[5];
	    	array[0]='i';
	    	array[1]='l';
	    	array[2]='o';
	    	array[3]='v';
	    	array[4]='e';
	    	System.out.println("elements of array");
	    	System.out.println("-----------------");
	    	for (int i = 0; i < array.length; i++) 
	    	{
				System.out.println(array[i]);
			}
	    	
	    	String string = new String(array);
	    	System.out.println("characters of string");
	    	System.out.println("--------------------");
	    	System.out.println(string);
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    }
}
