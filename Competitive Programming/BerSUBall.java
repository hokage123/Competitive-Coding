import java.io.*;
import java.util.*;
class BerSUBall
{
	public static void main(String[] d)
	{
		int a[],b[],i,n,m,count=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		a=new int[n];
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		Arrays.sort(a);	
		m=sc.nextInt();
		b=new int[102];
		for(i=0;i<m;i++)
			b[sc.nextInt()]++;
		for(i=0;i<n;i++)
		{
			if(b[a[i]-1]>0)
			{
				count++;
				b[a[i]-1]--;
			}
			else if(b[a[i]]>0)
			{
				count++;
				b[a[i]]--;
			}
			else if(b[a[i]+1]>0)
			{
				count++;
				b[a[i]+1]--;
			}	
		}
		System.out.println(count);
	}
}