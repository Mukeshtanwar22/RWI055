//program of constructor(default and paramertised)
class A
{
	A()
	{
		System.out.println("default constructor....");
	}
	A(int a,int b)
	{
		int c=a+b;
		System.out.println("Para....con....");
		System.out.println(c);
	}
	A(int x,int y,int z)
	{
		int m=x*y*z;
		System.out.println(m);
	}
}
class Main 
{
	public static void main(String mk[])
	{
		A a=new A(10,20);
	}
}