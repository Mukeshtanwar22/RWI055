//Multilevel Inheritance program
class A
{
	void show()
	{
		System.out.println("Class A");
	}
}
class B extends A
{
	void display()
	{
		super.show();
		System.out.println("display something you want...");
	}
}
class C extends B
{
	void sum()
	{
		int a=2;
		int b=3;
	int c=a+b;
	System.out.println(c);
	}
}	
class Multilevel_Inheritance
{
	public static void main(String mk[])
	{
		C c=new C();
		c.sum();
		c.display();
	}
	
}