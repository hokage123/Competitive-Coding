import java.io.*;
import java.util.*;
class ChefandMean
{
	public static void main(String[] v)
	{
		int N,T,i,j;
		long A[],B[],ans=0,min=0;
		double sum1=0.0,sum2=0.0;
		Scanner sc=new Scanner(System.in);
		T=sc.nextInt();
		for(j=0;j<T;j++)
		{	
		sum1=0;
		sum2=0;
			ans=0;
			min=0;
			N=sc.nextInt();
			A=new long[N];
			B=new long[N];
			for(i=0;i<N;i++)
			{
				A[i]=sc.nextLong();
				sum1+=A[i];
			}
			for(i=0;i<N;i++)
			{
				sum2=(sum1-A[i]);
				if((sum1/(double)N)==(sum2/(double)(N-1)))
				{
					if(min==0)
					{
					ans=(i+1);
					min=A[i];
					}
					else if(A[i]<min)
					{
						ans=(i+1);
					min=A[i];
					}	
				}
			}
			if(ans==0)
			{
				System.out.println("Impossible");
			}
			else
				System.out.println(ans);
		}
	}
}