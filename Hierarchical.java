// program for hierarchical
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
		System.out.println("display something you want...");
	}
}
class C extends A
{
	void sum()
	{
		int a=2;
		int b=3;
	int c=a+b;
	System.out.println(c);
	}
}	
class Hierarchical_Inheritance
{
	public static void main(String mk[])
	{
		C c=new C();
		c.sum();
		c.show();
		B b=new B();
		b.display();
		b.show();
	}
	
	
}