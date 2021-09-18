import java.util.Scanner;

class Charlist
{
	char []chrlst;
	char vow[];
	char wrd[];
	
	Charlist()
	{
	chrlst=null;
	}
	
	Charlist(char []chlst)
		{
		chrlst=new char[chlst.length];
		for(int i=0;i<chlst.length;i++)
			{
			chrlst[i]=chlst[i];
			}
		countVowels();
		countWord();	
		}

	void show()
		{
		for(int i=0;i<chrlst.length;i++)
			{
			System.out.println(" "+chrlst[i]);
			}
		System.out.println("The vowels are : ");	
		for(int i=0;i<chrlst.length;i++)
			{
			if (vow[i]!=0)
			System.out.print(vow[i]);
			}
		//System.out.println("The Words are : ");	
		//System.out.println(wrd[i]);
		}
	
	int countVowels()
	{
		vow=new char[chrlst.length];
		for(int i=0;i<chrlst.length;i++)
		{
			if (chrlst[i]=='a'||chrlst[i]=='e')
			vow[i]=chrlst[i];
			if (chrlst[i]=='i'||chrlst[i]=='o')
			vow[i]=chrlst[i];
			if (chrlst[i]=='u')
			vow[i]=chrlst[i];
		}
		return vow.length;
	}
	
	int countWord()
	{
		wrd=new char[chrlst.length];
		int i=0;
		while (i<chrlst.length)
		{
			if (chrlst[i]==0)
			{
				i++;
				System.out.print(chrlst[i]"\n");
			}
			
			i++;
		}
		return wrd.length;
	}

	/*CharList(CharList chrlst);
	void sortChar();*/

}
public class CharCheck
{
	public static void main(String args[])
	{
		
		String st;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");		
		st=sc.nextLine();
		char wd[]=new char[st.length()];
		for(int i=0;i<st.length();i++)
		{
		wd[i]=st.charAt(i);
		}

		Charlist cc=new Charlist(wd);
		cc.show();

		
	}
}