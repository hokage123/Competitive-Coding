import java.util.*;
import java.io.*;
class Boredom
{
	public static void main(String[] g)
	{
		int n,i;
		long a[],max=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		a=new long[100001];
		for(i=0;i<n;i++)
		{
			int m=sc.nextInt();
			a[m]+=m;
		}
		for(i=2;i<=100000;i++)
		{
			if(i==2)
			{
				a[i]+=a[i-2];
			}
			else
			{
				a[i]+=Long.max(a[i-2],a[i-3]);
			}
		}
		for(i=1;i<=100000;i++)
			max=Long.max(max,a[i]);
		System.out.println(max);
	}
}