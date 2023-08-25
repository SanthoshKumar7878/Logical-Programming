package arrays;

public class StringTypeArray
{ 
	public static String[] sender()
	{
       String[] str;
       str = new String[26];
       char uca = 'A';
       char lca = 'a';
       for (int i = 0; i < str.length; i++)
         {
		    str[i] = uca+""+lca;
		    uca++;
		    lca++;
	     }
       return str;
	}
}
