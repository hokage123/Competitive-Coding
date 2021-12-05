import java.io.*;
import java.util.*;
class EqualizePricesAgain
{
	public static void main(String[] t)
	{
		int T,N,a[],i,j;
		long sum,avg;
		Scanner sc=new Scanner(System.in);
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			sum=0;
			N=sc.nextInt();
			a=new int[N];
			for(j=0;j<N;j++)
			{
				a[j]=sc.nextInt();
				sum+=a[j];
			}
			if(sum%N==0)
			{
				System.out.println((sum/N));
			}
			else
				System.out.println(((sum/N)+1));
		}
	}
}