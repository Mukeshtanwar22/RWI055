//program for multithreading by extending Thread class
class A extends Thread
{
	public void run()
	{
		for(int i=1;i<9;i++)
			System.out.println("mukesh tanwar...");
	}
}
class Main
{
	public static void main(String[] mk)
	{
		A a=new A();
		a.start();
	}
}