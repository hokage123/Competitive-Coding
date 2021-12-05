import java.util.*;
import java.io.*;
class DistributeApples
{
	public static void main(String[] s)
	{
		int T,i,j;
		long N,K,N1;
		Scanner sc=new Scanner(System.in);
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			N=sc.nextLong();
			K=sc.nextLong();
			if(K<=(1000000000l))
			{
				if((N%(K*K))==0)
					System.out.println("NO");
				else
					System.out.println("YES");
			}
			else
			{
				System.out.println("YES");
			}
		}
	}
}