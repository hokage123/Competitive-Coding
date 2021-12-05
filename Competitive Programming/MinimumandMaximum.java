import java.math.*;
import java.io.*;
import java.util.*;
class MinimumandMaximum
{
	public static void main(String[] s)
	{
		BigInteger A,B;
		int T,i,j,N,K;
		Scanner sc=new Scanner(System.in);
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			A=new BigInteger(""+sc.next());
			B=new BigInteger(""+sc.next());
			N=Integer.parseInt(A.toString());
			if(A.compareTo(B)>=0)
			{
				K=Integer.parseInt(B.toString());
				if((N%2)!=0)
				{
					if(K<=(N-K))
					{
						System.out.println((2*K));
					}
					else
					{
						System.out.println((2*(N-K)));
					}
				}
				else
				{
					if(K==(N-K))
					{
						System.out.println((2*K)-1);
					}
					else if(K<(N-K))
					{
						System.out.println((2*K));
					}
					else
					{
						System.out.println((2*(N-K)));
					}
				}
			}
			else
			{
				K=Integer.parseInt(B.mod(A).toString());
				if((N%2)!=0)
				{
					if(K<=(N-K))
					{
						System.out.println((2*K));
					}
					else
					{
						System.out.println((2*(N-K)));
					}
				}
				else
				{
					if(K==(N-K))
					{
						System.out.println((2*K)-1);
					}
					else if(K<(N-K))
					{
						System.out.println((2*K));
					}
					else
					{
						System.out.println((2*(N-K)));
					}
				}
			}
		}
	}
}