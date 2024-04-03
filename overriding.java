//program for method over ridding
class Super
{
	void show()
	{
		System.out.println("Super class....");
	}
}
class Base extends Super
{
	void show()
	{
		super.show();
		System.out.println("Base class....");
	}
}
class Main
{
	public static void main(String arg[])
	{
		Base b=new Base();
		b.show();
	}
}