import java.io.*;
import java.util.*;
class NumberCircle
{
	public static void main(String[] f)
	{
		long A[],sum[],swap;
		int N,i;
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		A=new long[N];
		sum=new long[N];
		
		for(i=0;i<N;i++)
		{
			A[i]=sc.nextLong();
			
			//if(max<A[i])
				//max=A[i];
		}
		Arrays.sort(A);
		for(i=0;i<N;i++)
		{
			if(i==0)
			{
				sum[i]=A[0]+A[N-1];
			}
			else if(i==(N-1))
			{
				sum[i]=A[0]+A[N-2];
			}
			else
			{
				sum[i]=(A[i-1]+A[i+1]);
			}
		}
		
		 if((A[N-2]+A[N-3])>A[N-1])
		{
				swap=A[N-1];
				A[N-1]=A[N-2];
				A[N-2]=swap;
			
		}
		if(sum[N-1]>A[N-1])
		{
			System.out.println("YES");
			for(i=0;i<N;i++)
				System.out.print(A[i]+" ");
		}
		else
		{
			System.out.print("NO");
		}
		
	}
}