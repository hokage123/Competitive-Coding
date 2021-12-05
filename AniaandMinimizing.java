import java.util.*;
import java.io.*;
class AniaandMinimizing
{
	public static void main(String[] g)
	{
		int n,k,i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		String s=sc.next();
		char ch[]=s.toCharArray();
		if(n>1)
		{	
		for(i=0;i<n;i++)
		{
			if(k>0)
			{
				if(i==0 && ch[i]>'1')
				{
					ch[i]='1';
					k--;
				}
				else if(i>0 && ch[i]>'0')
				{
					ch[i]='0';
					k--;
				}
				
			}
		}
		}
		if(n==1)
		{
			ch[0]='0';
		}
		else if(n==1 && k>=1)
				ch[0]='1';
		s=new String(ch);
		System.out.println(s);
	}
}