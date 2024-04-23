//program for multithreading by extending Thread Schedular
class A extends Thread


{
	public void run()
	{
		String n=Thread.currentThread().getName();
		for(int i=1;i<3;i++)
			System.out.println("Mukesh tanwar..."+n);
	}
}
class Main
{
	public static void main(String[] mk)
	{
		A t=new A();
		A t1=new A();
		A t2=new A();
		A t3=new A();
		t.setName("Mukesh");
		t.setName("dev");
		t.setName("sanjay");
		t.setName("Chetan");
		
		t.start();
		t1.start();
		t2.start();
		t3.start();

	
	}
}