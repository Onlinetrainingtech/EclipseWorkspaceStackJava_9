//Argument Passing in the Functions
public class Product {

	void addProduct(int productid,String pname)
	{
		System.out.println("Your Details is::"+productid+""+pname);
	}
	void addCategory(int categoryid,String cname)
	{
		System.out.println("Your Categories details is::"+categoryid+""+cname);
	}
	
	
	public static void main(String[] args) {
		
		Product f1=new Product();
		f1.addProduct(1001,"Apple");
		f1.addCategory(2001,"Mobile");

	}

}
