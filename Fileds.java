interface I1 //interface creted here
{
	void show(); //Abstract and public method decleare here
}
class A implements I1 //interface implements here
{
	int a=10;
	A()
	{
		System.out.println("Constructor....");
	}
	public void show()  // show method override here
	{
		System.out.println("a="+a);
		
	}
	class Inner //inner class here
	{
		void display()
		{
		System.out.println("inner class");
			
		}
	}
}
class B
{
	public static void main(String args[])
	{
		
		A a=new A(); //creation of object
		a.show();//method calling through the object
		A.Inner b=new A().new Inner();
		b.display();
	}
}