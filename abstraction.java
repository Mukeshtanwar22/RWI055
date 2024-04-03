//program of achiving abstraction through abstract class
abstract class Super
{
	abstract void show();
}
class Base extends Super
{
  void show()
  {
	  System.out.println("Abstraction bt abstract class...");
  }  
}
class Base2 extends Super
{
	void show()
	{
		System.out.println("Second base class");
	}
}
class Abstraction
{
	public static void main(String mk[])
	{
	   Super a=new Base();
			a.show();
			Super b=new Base2();
			b.show();
	}
}