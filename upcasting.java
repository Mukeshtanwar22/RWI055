//program to upcasting
class Parent
{
  void show()
  {
	  System.out .println("Upcasting....");
  }  
}
class Chid extends Parent
{
	void show()
	{
		System.out.println("Child class upcasting...");
	}
}
class Main
{
	public static void main(String ar[])
	{
		Parent c=new Chid();
		c.show();
	}
}