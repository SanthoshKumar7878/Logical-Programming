package string;

public class Sample 
{
   public static void main(String[] args)
   {
	   //string class
	   String s1 = "java";
	   System.out.println(s1);
	   String s2 = "java";
	   System.out.println(s2);
	   System.out.println(s1.equals(s2));
	   System.out.println(s1.hashCode());
	   System.out.println(s2.hashCode());
	   
	   //string buffer class
	   StringBuffer sbf1 =new StringBuffer("javarani");
	   System.out.println(sbf1);
	   StringBuffer sbf2 =new StringBuffer("javarani");
	   System.out.println(sbf2);
	   System.out.println(sbf1.equals(sbf2));
	   System.out.println(sbf1.hashCode());
	   System.out.println(sbf2.hashCode());
	   
	   //string builder class
	   StringBuilder sbd1 =new StringBuilder("sqlrani");
	   System.out.println(sbd1);
	   StringBuilder sbd2 =new StringBuilder("sqlrani");
	   System.out.println(sbd2);
	   System.out.println(sbd1.equals(sbd2));
	   System.out.println(sbd1.hashCode());
	   System.out.println(sbd2.hashCode());
   }
}
