import java.io.*;
import java.util.*;
class CoverPoints
{
	public static void main(String[] r)
	{
		int n,max=0,i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int A[]=new int[n];
		int B[]=new int[n];
		for(i=0;i<n;i++)
		{
			A[i]=sc.nextInt();
			B[i]=sc.nextInt();
			if(max<(A[i]+B[i]))
				max=(A[i]+B[i]);
		}
		System.out.println(max);
	}
}