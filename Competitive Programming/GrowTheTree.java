import java.util.*;
import java.io.*;
class GrowTheTree
{
	public static void main(String[] d)
	{
		Scanner sc=new Scanner(System.in);
		int t,N,i,j;
		long x,y;
		
			x=0;
			y=0;
			N=sc.nextInt();
			int[] A=new int[N];
			for(j=0;j<N;j++)
				A[j]=sc.nextInt();
			Arrays.sort(A);
			for(j=0;j<N;j++)
			{
				if(j<(N/2))
					x+=A[j];
				else
					y+=A[j];
			}
			long sum=((x*x)+(y*y));
			System.out.println(sum);
		
	}
}