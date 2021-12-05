import java.io.*;
import java.util.*;
class SchoolofGeometry
{
	public static void main(String[] s)
	{
		int i,j,T,N,A[],B[];
		Scanner sc=new Scanner(System.in);
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			long S=0;
			N=sc.nextInt();
			A=new int[N];
			B=new int[N];
			for(j=0;j<N;j++)
				A[j]=sc.nextInt();
			for(j=0;j<N;j++)
				B[j]=sc.nextInt();
			Arrays.sort(A);
			Arrays.sort(B);
			for(j=0;j<N;j++)
				S+=Integer.min(A[j],B[j]);
			System.out.println(S);
		}
	}
}