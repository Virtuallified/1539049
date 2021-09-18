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
		}
	
	int countVowels()
	{
		int v=0;
		for(int i=0;i<chrlst.length;i++)
		{
			if (chrlst[i]=='a'||chrlst[i]=='e' || chrlst[i]=='i'||chrlst[i]=='o'||chrlst[i]=='u' )
			v=v+1;
			
		}
		return v;
	}
	
	int countWord()
	{
		int wrd=0,sp=0;
			
		for(int i=0;i<chrlst.length;i++)
		{
			if (chrlst[i]==' ')
			sp=sp+1;
			
		}
			wrd=sp+1;
		return wrd;
	}

	/*CharList(CharList chrlst);
	void sortChar();*/

}
public class CharCheck1
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
		System.out.println("no of Vowels :"+cc.countVowels());
		System.out.println("no of words :"+cc.countWord());

		
	}
}