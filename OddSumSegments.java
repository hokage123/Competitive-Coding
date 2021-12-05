import java.util.*;
import java.io.*;
class OddSumSegments
{
	public static void main(String[] s)
	{
		Scanner sc=new Scanner(System.in);
		int T,i,j,N,K,a[],odd,even;
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			odd=0;
			even=0;
			N=sc.nextInt();
			K=sc.nextInt();
			a=new int[N];
			for(j=0;j<N;j++)
			{
				a[j]=sc.nextInt();
				if(a[j]%2!=0)
					odd++;
			}
			if(odd>=K && (((odd-K)%2)==0))
			{
				System.out.println("YES");
				for(j=0;j<N;j++)
				{
				if(a[j]%2!=0)
				{
					odd++;
				}
			}
			for(j=0;j<N;j++)
			{
				if(a[j]%2!=0 && even<(K-1))
				{
					even++;
					System.out.print((j+1)+" ");
				}
			}
			System.out.print(N);
			System.out.println();
		}
		else
			System.out.println("NO");
	}
}
}