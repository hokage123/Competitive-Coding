import java.io.*;
import java.util.*;
class EasyFibonacci
{
	public static void main(String[] f)
	{
		long N;
		int T,i;
		Scanner sc=new Scanner(System.in);
		int F[]=new int[61];
		F[0]=0;
		F[1]=1;
		for(i=2;i<=60;i++)
			F[i]=((F[i-1]+F[i-2])%10);
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			N=sc.nextLong();
			String s=Long.toBinaryString(N);
			N=(long)(Math.pow(2,(s.length()-1)));
			N--;
				System.out.println(F[(int)(N%60)]);
		}
	}
}