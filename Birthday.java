import java.io.*;
import java.util.*;
class Birthday
{
	public static void main(String[] f)
	{
		long N,M,K,L,div,rem;
		Scanner sc=new Scanner(System.in);
		N=sc.nextLong();
		M=sc.nextLong();
		K=sc.nextLong();
		L=sc.nextLong();
		div=((K+L)/M);
		rem=((K+L)%M);
		if(rem==0 && ((div*M)<=N))
		{
			System.out.println(div);
		}
		else if(rem>0 && (((div+1)*M)<=N))
		{
			System.out.println((div+1));
		}
		else
			System.out.println("-1");
	}
}