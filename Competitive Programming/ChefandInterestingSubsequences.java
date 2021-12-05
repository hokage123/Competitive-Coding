import java.io.*;
import java.util.*;
class ChefandInterestingSubsequences
{
	public static void main(String[] f)
	{
		int T,i,j,N,K;
		long ans;
		Scanner sc=new Scanner(System.in);
		T=sc.nextInt();
		long c[][]=combinations(50);
		for(i=1;i<=50;i++)
		{
			for(j=1;j<=50;j++)
				System.out.print(c[i][j]+" ");
			System.out.println();
		}
		for(i=0;i<T;i++)
		{
		    ans=0;
			N=sc.nextInt();
			K=sc.nextInt();
			int a[]=new int[101];
			for(j=0;j<N;j++)
				a[sc.nextInt()]++;
			for(j=0;j<=100;j++)
			{
				
				if(a[j]<K)
					K-=a[j];
				else if(K>0 && a[j]>=K)
				{
					ans=c[a[j]][K];
					break;
				}
			}
			System.out.println(ans);
		}
	}
	public static long[][] combinations(int n)
	{
	    int i,j;
		long c[][]=new long[n+1][n+1];
		for(i=1;i<=n;i++)
		{
			c[i][0]=1;
			c[i][i]=1;
			c[i][1]=i;
		}
		for(i=1;i<=n;i++)
		{
			for(j=1;j<i;j++)
			{
				c[i][j]=c[i-1][j]+c[i-1][j-1];
			}
		}
			return c;
	}
}