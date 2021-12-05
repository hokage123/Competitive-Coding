import java.io.*;
import java.util.*;
class MinionsandVoting
{
	public static void main(String[] s)
	{
		int S[],T,N,i,j,k;
		Scanner sc=new Scanner(System.in);
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			N=sc.nextInt();
			S=new int[N];
			long S1=0;
			long ans[]=new long[N];
			for(j=0;j<N;j++)
				S[j]=sc.nextInt();
			for(j=0;j<N;j++)
			{
				S1=0;
				for(k=(j+1);k<N;k++)
				{
					if(S1<=S[j])
						ans[k]++;
					else
						break;
					S1+=S[k];
				}
			}
			for(j=(N-1);j>=0;j--)
			{
				S1=0;
				for(k=(j-1);k>=0;k--)
				{
					if(S1<=S[j])
						ans[k]++;
					else
						break;
					S1+=S[k];
				}
			}
			for(j=0;j<N;j++)
				System.out.print(ans[j]+" ");
			System.out.println();
		}
	}
}