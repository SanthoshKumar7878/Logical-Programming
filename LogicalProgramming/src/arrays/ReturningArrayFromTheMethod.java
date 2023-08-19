package arrays;

public class ReturningArrayFromTheMethod 
{
  public static void main(String[] args)
  {
	  int[] array = Test.sender();
	  Display.receiver(array);
  }
}
