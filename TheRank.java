import java.util.*;
import java.io.*;
class TheRank
{
	public static void main(String[] f)
	{
		int count=0,sum[],n,i;
		int a,b,c,d;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		sum=new int[n];
		for(i=0;i<n;i++)
		{
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			d=sc.nextInt();
			sum[i]=(a+b+c+d);
			if(sum[i]>sum[0])
			{
				count++;
			}
		}
		System.out.println((count+1));
	}
}