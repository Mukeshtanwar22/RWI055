//Multiple inheritance by interface
interface I1
{
	default void show()
	{
		System.out.println("Multiple_Inheritance ......");
	}
}
interface I2
{
	default void show()
	{
		System.out.println("Multiple_Inheritance ......");
		
	}
}
class Base implements I1,I2
{
	void show()
	{
		I1.super.show();
	}
}
class Multiple_Inheritance
{
	public static void main(Strings mk[])
	{
		Base b=new Base();
		b.show();
	}
}