import java.util.*;
import java.io.*;
class Football
{
	public static void main(String[] s)
	{
		int T,A[],B[],i,j,max,N;
		Scanner sc=new Scanner(System.in);
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			N=sc.nextInt();
			A=new int[N];
			B=new int[N];
			for(j=0;j<N;j++)
				A[j]=sc.nextInt();
			for(j=0;j<N;j++)
				B[j]=sc.nextInt();
			max=((2*A[0])-B[0]);
			for(j=0;j<N;j++)
			{
			if(max<((2*A[j])-B[j]))
					max=((2*A[j])-B[j]);	
			}
			if(max>=0)
			System.out.println((max*10));
			else 
			System.out.println("0");	
		}
	}
}