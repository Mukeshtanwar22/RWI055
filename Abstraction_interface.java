//program of abstraction through the interface
interface I1
{
	void balance();
	void message();
}
interface I2
{
	abstract void debit();
	abstract void credit();
}
class User implements I1
{
	public void balance()
	{
		System.out.println("Available balance is=6000");
	}
	public void message()
	{
		System.out.println("pop up message....");
	}
	public void debit()
	{
		System.out.println("Debited amout from your account...");
	}
	public void credit()
	{
		System.out.println("Credited amount from your account....");
	}
}
class Abstraction_Interface
{
	public static void main(String mk[])
	{
		User user=new User();
		user.message();
		user.balance();	
		user.debit();
		user.credit();
	}
}