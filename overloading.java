//method over loading program.....
class B
{
	void show1()
	{
		
		System.out.println("one");
	}
	void show2(int a,int b)
	{
		System.out.println(a+" "+b);
		
	}
	void show3(int a,int b,int c)
	{
		System.out.println(a+" "+b+" "+c);
	}
}
class  A  
{
	public static void main(String args[])
	{
	  B b=new B();
        b.show1();
        b.show2(10,20);
		b.show3(20,30,40);		
	}
}