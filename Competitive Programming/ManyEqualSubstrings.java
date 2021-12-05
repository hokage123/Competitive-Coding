import java.util.*;
import java.io.*;
class ManyEqualSubstrings
{
	public static void main(String[] o)
	{
		int count=-1;
		int n,k,i;
		String s;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		s=sc.next();
		char ch[]=s.toCharArray();
		if(n>1)
		{	
		for(i=1;i<n;i++)
		{
			if(s.substring(0,(n-i)).equals(s.substring(i,n)))
			{
				count=(n-i);
				break;
			}
		}
		if(count>-1)
		{	
			String u=s.substring(count,n);
			for(i=2;i<=k;i++)
			{
				s+=u;
			}
		}
		else
		{
			String u=s;
			for(i=2;i<=k;i++)
			{
				s+=u;
			}
		}
		}
		else
		{
			String u=s;
			for(i=2;i<=k;i++)
			{
				s+=u;
			}
		}
		System.out.println(s);
	}
}