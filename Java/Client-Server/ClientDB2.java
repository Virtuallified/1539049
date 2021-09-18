import java.net.*;
import java.io.*;
import java.util.*;
public class ClientDB2
{
	public static void main(String args[]) throws Exception
	{
		Socket soc=new Socket("localhost",888);
		System.out.println("Enter Your Choice:");
		System.out.println("1 for All details of employees:");
		System.out.println("2 for All details of specific employee:");
		System.out.println("3 for Insert new employee details:");
		System.out.println("4 for Update details of specific employee:");
		System.out.println("5 for Delete details of specific employee:");
		System.out.println("Type 'exit' for Exit:");
		BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));		//to read data from keyboard
		DataOutputStream dos=new DataOutputStream(soc.getOutputStream());		//to send data to server
		BufferedReader br=new BufferedReader(new InputStreamReader(soc.getInputStream()));	//to read data from server
		String str, str1;
		while(!(str=kb.readLine()).equals("exit"))
		{
			dos.writeBytes(str+"\n");	//send to server
			str1=br.readLine();	//receive from server
			System.out.println(str1);
		}
		dos.close();
		kb.close();
		br.close();
		soc.close();
	}
}