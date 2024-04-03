//program for the Encapsulation 
class Employ
{
	private String name;
	private int idnum;
	private int  age;
	
	public String name()
	{
	return name;
	}
	
	public int idnum()
	{
	return idnum;
	}
	
	public int age()
	{
	return age;
	}
	
	public void setname(String Name)
	{
	name=Name;
	}
	
	public void setidnum(int num)
	{
	idnum=num;
	}
	
	public void setage(int Age)
	{
		age=Age;
	}
}
class Encapsulation
{
	public static void main(String ar[])
	{
		Employ em=new Employ();
		em.setname("Mukesh khichi");
		em.setidnum(101);
		em.setage(24);
		
		System.out.println("Name="+em.name());
		System.out.println("idnum="+em.idnum());
		System.out.println("age="+em.age());
	}
}
// /* File name : RunEncap.java */
// public class RunEncap {

   // public static void main(String args[]) {
      // EncapTest encap = new EncapTest();
      // encap.setName("James");
      // encap.setAge(20);
      // encap.setIdNum("12343ms");

      // System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge());
   // }
// }

// public class EncapTest {
   // private String name;
   // private String idNum;
   // private int age;

   // public int getAge() {
      // return age;
   // }

   // public String getName() {
      // return name;
   // }

   // public String getIdNum() {
      // return idNum;
   // }

   // public void setAge( int newAge) {
      // age = newAge;
   // }

   // public void setName(String newName) {
      // name = newName;
   // }

   // public void setIdNum( String newId) {
      // idNum = newId;
   // }
// }