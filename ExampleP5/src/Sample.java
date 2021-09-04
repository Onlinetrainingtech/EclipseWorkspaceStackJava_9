import java.util.Scanner;

class Foo
{
	int pid;
	String pname;
	float  price;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the value is::");
		pid=sc.nextInt();
		pname=sc.next();
		price=sc.nextFloat();
	}
	void display()
	{
		System.out.println("Your ProducdId is:"+pid);
		System.out.println("Your Productname is::"+pname);
		System.out.println("Your ProductPrice is::"+price);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Foo s1=new Foo();
		s1.input();
		s1.display();

	}

}
