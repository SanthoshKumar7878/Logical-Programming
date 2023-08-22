package arrays;

public class GetContactAndEmail
{
   public static void main(String[] args)
   {
	   char[] contact;
	   contact = new char[13];
	   java.util.Scanner SCANNER = new java.util.Scanner(System.in);
	   System.out.println("Enter your Contact number by using default code number as +91 ");
	   for(int i=0;i<13;i++)
	   {
		   contact[i]=SCANNER.next().charAt(0);   
	   }
	   char[] mail;
	   System.out.println("Enter your mail ID");
	   String id = SCANNER.next();
	   int size = id.length();
	   mail = new char[size];
	   for(int i=0;i<size;i++)
	   {
		   mail[i] = id.charAt(i);
	   }
	   System.out.println("your contact number and mail id");
	   for(int i=0;i<13;i++)
	   {
		   System.out.print(contact[i]);
	   }
	   System.out.println();
	   for(int i=0;i<size;i++)
	   {
		   System.out.print(mail[i]);
	   }
   }
}
