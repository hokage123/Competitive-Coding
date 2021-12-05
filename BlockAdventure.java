import java.util.*;
import java.io.*;
class RoundCorridor
{
	public static void main(String[] s)
	{
		Scanner sc=new Scanner(System.in);
		int n,m,q;
		n=sc.nextLong();
		m=sc.nextLong();
		q=sc.nextLong();
		for(int i=0;i<T;i++)
		{
			int a=sc.nextLong();
			int b=sc.nextLong();
			int c=sc.nextLong();
			int d=sc.nextLong();
			if(a==1l && c==2l)
			{
				if(b>=n/2 && d>=m/2)
					System.out.println("Yes");
				else if(b<n/2 && d<m/2)
					System.out.println("Yes");
				else
					System.out.println("No");
			}
			else
			{
				if(d>=n/2 && b>=m/2)
					System.out.println("Yes");
				else if(d<n/2 && b<m/2)
					System.out.println("Yes");
				else
					System.out.println("No");
			}	
				
		}
	}
}