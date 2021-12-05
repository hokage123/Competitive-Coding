import java.util.*;
import java.io.*;
class FridgeLockers
{
	public static void main(String[] s)
	{
		long sum=0;
		int n,m,a[],i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		a=new int[n];
		int b[]=new int[1001];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			b[a[i]]=(i+1);
		}
		Arrays.sort(a);
		if(n<3 || m<n)
			System.out.println("-1");
		else
		{
			
			for(i=0;i<m;i++)
			{
				if(i%n==(n-1))
				{
					sum+=(A[n-1]+A[0]);
				}
				else
				{
					sum+=(A[i%n]+A[(i%n)+1]);
				}
			}
			System.out.println(sum);
			
		}
	}
}