import java.io.DataInputStream;
import java.io.IOException;

class Demo
{
	int empid;
	String empname;
	float avg;
	DataInputStream dis=new DataInputStream(System.in);
	void input() throws IOException 
	{
		System.out.println("Enter the value is::");
		empid=Integer.parseInt(dis.readLine());
		empname=dis.readLine();
		avg=Float.parseFloat(dis.readLine());
	}
	void show()
	{
		System.out.println("Your Value is::"+empid+""+empname+""+avg);
	}
}
public class Sample {

	public static void main(String[] args) throws IOException {
		
		
		Demo f1=new Demo();
		f1.input();
		f1.show();

	}

}
