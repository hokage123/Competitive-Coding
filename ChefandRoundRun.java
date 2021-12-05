import java.util.*;
import java.io.*;
class ChefandRoundRun
{
	public static void main(String[] p)throws IOException
	{
		int T,N,A[],i,j;
		FastReader sc=new FastReader();
		BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			N=sc.nextInt();
			A=new int[N];
			for(j=0;j<N;j++)
				A[j]=sc.nextInt();
			for(j=0;j<N;j++)
			{
				k=j;
				while((k-j)<=N)
				{
					k+=A[k];
					if(su)
						break;
				}
			}
		}
	}
}