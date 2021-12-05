import java.util.*;
import java.io.*;
class BrokenKeyboard
{
	public static void main(String[] h)
	{
		int t,i,j;
		Scanner sc=new Scanner(System.in);
		int count[];
		t=sc.nextInt();
		for(i=0;i<t;i++)
		{
			String s=sc.next();
			
			char ch[]=s.toCharArray();
			count=new int[26];
			for(j=0;j<ch.length;j++)
			{
				if(j<(ch.length-1) && ch[j]==ch[j+1] && count[ch[j]-'a']==0)
				{
					count[ch[j]-'a']=2;
					j++;
				}
				else if((j<(ch.length-1) && ch[j]!=ch[j+1] && count[ch[j]-'a']==2)|| (count[ch[j]-'a']==2 && j==(ch.length-1)))
				{
					count[ch[j]-'a']=1;
				}
				else
				{
					count[ch[j]-'a']=1;
				}
			}
			for(j=0;j<26;j++)
			{
				if(count[j]==1)
				{
					System.out.print(((char)('a'+j)));
				}
			}
			System.out.println();
		}
	}
}