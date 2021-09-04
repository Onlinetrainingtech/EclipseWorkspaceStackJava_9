
class Demo
{
	int productid=1001;//class or instance variable
	void get1()
	{
		String pname="apple";//local variable
		System.out.println("Value is::"+pname+""+productid);
		
	}
	void get2()
	{
		int categoryid=2001;
		System.out.println("The value is::"+categoryid);
	}
}

public class Sample {

	
	public static void main(String[] args)
	{
	   
		Demo f1=new Demo();
		f1.get1();
		f1.get2();

	}

}
