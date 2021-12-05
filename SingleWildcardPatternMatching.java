import java.util.*;
import java.io.*;
class SingleWildcardPatternMatching
{
	public static void main(String[] f)
	{
		Scanner sc=new Scanner(System.in);
		int n,m,i=0;
		int count=0;
		String s,s1;
		n=sc.nextInt();
		m=sc.nextInt();
		s=sc.next();
		s1=sc.next();
		char ch[]=s.toCharArray();
		char ch1[]=s1.toCharArray();
		int count1=s.indexOf('*');
		if(count1>=0)
		{
		while(ch[i]!='*' && i<n && i<m)
		{
			if(ch[i]!=ch1[i])
			{
				count=1;
				break;
			}
			i++;
		}
		i=1;
		while(ch[n-i]!='*' && i<=n && i<=m)
		{
			if(ch[n-i]!=ch1[m-i])
			{
				count=1;
				break;
			}
			i++;
		}
		}
		if(count1<0)
		{
			if(s.equals(s1))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		else
		{	
			if(count==1 || m<(n-1))
				System.out.println("NO");
			else
				System.out.println("YES");
		}
	}
}