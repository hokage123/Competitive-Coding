import java.io.*;
import java.util.*;
class HardCash
{
public static void main(String[] s)
{
	int i,j,N,K,T;
	int A[];
	Scanner sc=new Scanner(System.in);
	T=sc.nextInt();
	for(i=0;i<T;i++)
	{
		long sum=0;
		N=sc.nextInt();
		K=sc.nextInt();
		A=new int[N];
		for(j=0;j<N;j++)
		{
			A[j]=sc.nextInt();
			sum+=A[j];
		}
		long ans=(sum%K);
		System.out.println(ans);
	}
}
}