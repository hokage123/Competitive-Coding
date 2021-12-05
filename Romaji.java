import java.util.*;
import java.io.*;
class Romaji
{
	public static void main(String[] g)
	{
		int i,count=0;
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char ch[]=s.toCharArray();
		for(i=0;i<ch.length;i++)
		{
			if(ch[i]!='a' && ch[i]!='e' && ch[i]!='i' && ch[i]!='o' && ch[i]!='u' && ch[i]!='n')
			{
				if(i==(ch.length-1))
					count=1;
				else if(ch[i+1]!='a' && ch[i+1]!='e' && ch[i+1]!='i' && ch[i+1]!='o' && ch[i+1]!='u')
					count=1;
			}
		}
		if(count==0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}