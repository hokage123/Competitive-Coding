import java.io.*;
import java.util.*;
class Heist
{
	public static void main(String[] g)
	{
		int A[],n,i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		A=new int[n];
		for(i=0;i<n;i++)
			A[i]=sc.nextInt();
		Arrays.sort(A);
		System.out.println((A[n-1]-A[0]+1-n));
	}
}