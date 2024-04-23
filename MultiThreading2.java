//program for multithreading by extending Thread class
class A implements Runnable 
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
		Thread t=new Thread(a);
		t.start();
		for(int i=1;i<9;i++)
			System.out.println("mukesh tanwaxhdjnzk	r...");

	
	}
}