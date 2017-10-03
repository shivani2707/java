package practise;

public class Product {
	
	 double price ;
	 String description;
	 String code;
	
	public Product(String description,double price,String code)
	{
		this.price=price;
		this.description=description;
		this.code=code;
		
	}
	Product()
	{
		this.price=0;
		this.description="No Description set";
		this.code="No Code Set";
		
		

	}
	 public static void main(String[]args){
		
		 Product book = new Product(10D, "123ABC", "A textbook for Java");
		 System.out.println(book.code);
		 		
	 }
}
