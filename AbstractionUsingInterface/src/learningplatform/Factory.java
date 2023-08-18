package learningplatform;

public class Factory
{
  public void get(Training t)
  {
	  if(t instanceof Qspiders)
	  {
		  Qspiders q1=(Qspiders) t;
		  q1.course();
		  q1.time();
		  q1.price();
	  }
	  else if(t instanceof Udemy)
	  {
		  Udemy u1=(Udemy) t;
		  u1.course();
		  u1.time();
		  u1.price();
	  }
	  else if(t instanceof Unacademy)
	  {
		  Unacademy u2=(Unacademy) t;
		  u2.course();
		  u2.time();
		  u2.price();
	  }
	  else if(t instanceof Groww)
	  {
		  Groww g1 = (Groww) t;
		  g1.course();
		  g1.time();
		  g1.price();
	  }
  }
}
