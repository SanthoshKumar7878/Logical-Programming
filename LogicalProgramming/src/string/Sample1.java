package string;

public class Sample1 
{
   public static void main (String[] args)
   {
	   
	   //using string class
	   String s1 = "core";
	   System.out.println(s1);
	   String s2 = "java";
	   System.out.println(s2);
	   String s3 = s1+s2;
	   System.out.println(s3);
	   String s4 = s1.concat(s2);
	   System.out.println(s4);
	   
	   //using string buffer
	   StringBuffer sbf1 =new StringBuffer("java");
	   System.out.println(sbf1);
	   StringBuffer sbf2 =new StringBuffer("rani");
	   System.out.println(sbf2);
	   StringBuffer sbf3 = sbf1.append(sbf2);
	   System.out.println(sbf3);
	   
	   //using string builder
	   StringBuilder sbd1 =new StringBuilder("sql");
	   System.out.println(sbd1);
	   StringBuilder sbd2 =new StringBuilder("rani");
	   System.out.println(sbd2);
	   StringBuilder sbd3 = sbd1.append(sbd2);
	   System.out.println(sbd3);
   }
}
