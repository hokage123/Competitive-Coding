import java.util.*;
import java.io.*;
class RoundCorridor
{
	public static void main(String[] s)
	{
		Scanner sc=new Scanner(System.in);
		long n,m;
		int q;
		n=sc.nextLong();
		m=sc.nextLong();
		q=sc.nextInt();
		for(int i=0;i<q;i++)
		{
			long a=sc.nextLong();
			long b=sc.nextLong();
			long c=sc.nextLong();
			long d=sc.nextLong();
			if(n==m)
			{
				if(a!=c && b==d)
				System.out.println("YES");
				else
				System.out.println("NO");	
			}
			if(a==1l && c==2l)
			{
				if(b>n/2 && d>m/2)
					System.out.println("YES");
				else if(b<=n/2 && d<=m/2)
					System.out.println("YES");
				else
					System.out.println("NO");
			}
			else if(a==2l && c==1l)
			{
				if(d>n/2 && b>m/2)
					System.out.println("YES");
				else if(d<=n/2 && b<=m/2)
					System.out.println("YES");
				else
					System.out.println("NO");
			}	
			if(a==c)
			{
				if(a==1l)
				{
				if(b>n/2 && d>n/2)
					System.out.println("YES");
				else if(b<=n/2 && d<=n/2)
					System.out.println("YES");
				else
					System.out.println("NO");	
				}
				else
				{
				if(b>=m/2 && d>=m/2)
					System.out.println("YES");
				else if(b<=m/2 && d<=m/2)
					System.out.println("YES");
				else
					System.out.println("NO");	
				}
			}
			
		}
	}
}