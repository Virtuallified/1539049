import java.util.Scanner;
class StockItem 
{
	int code,qnty;
	String iname; 
	float price,offer;
	
	
	 void getStock() 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Item Details \n");
		System.out.println("Enter Item Name :");
		iname= sc.next();
		System.out.println("Enter Item Code :");
		code= sc.nextInt();
		System.out.println("Enter Item Quantity :");
		qnty= sc.nextInt();
		System.out.println("Enter Item MRP :");
		price= sc.nextFloat();
		offer= getOffer();
		
	}	
	
	float getOffer()
	{
		if(qnty <= 50)
			return 0;
		else if((50 < qnty) && (qnty <= 100)) 	
			return 5;
		else 
			return 10;
	}
	
	
	void showItem()
	{
		System.out.println("Name of item : "+iname);
		System.out.println("Code of item : "+code);
		System.out.println("Quantity of item : "+qnty);
		System.out.println("MRP of item : "+price);
		float offerprc=((100-offer)/100)*price;
		System.out.println("Offer price of the item is : " +offerprc);
		
	}
	
}
 public class StockItemTest
 {
	public static void main(String arg[])
	{
		StockItem st= new StockItem();
		st.getStock();
		System.out.println("Item with OFFER PRICE :");
		st.showItem();
	}
 }





































