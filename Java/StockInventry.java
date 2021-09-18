import java.util.Scanner;

class StockItem
{
	int code,qnty;
	String iname;
	float price,offer,op;

	void getStock(int cd,String name,int qnt,float pr)
	{
		code=cd;
		iname=name;
		qnty=qnt;
		price=qnty*pr;
		getOffer();
	}
	void getOffer()
	{
		if(qnty<50)
		{
			offer=0;
		}
		if(qnty>=50&&qnty<=100)
		{
			offer=price*.05f;
		}
		if(qnty>100)
		{
			offer=price*.1f;
		}
	}
	void showItem()
	{
		System.out.println("Product Code :"+code+"\nProduct Name :"+iname+"\nProduct Quantity :"+qnty+"\nProduct Price :"+price);
		System.out.println("Discount Rs :"+offer);
	}
}

public class StockInventry
{
	public static void main(String args[])
	{
		String nm;
		int cd,qn;
		float prc,offr;

		Scanner sc=new Scanner(System.in);
		StockItem itm1=new StockItem();

			System.out.println("Enter item Code :");
			cd=sc.nextInt();
			System.out.println("Enter item Name :");	
			nm=sc.next();
			System.out.println("Enter item Quantity :");
			qn=sc.nextInt();
			System.out.println("Enter item Price (Rs):");
			prc=sc.nextFloat();
			
			itm1.getStock(cd,nm,qn,prc);
			itm1.showItem();
			
		}
		
	}
