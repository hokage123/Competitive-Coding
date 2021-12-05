import java.io.*;
import java.util.*;
class Cashier
{
	public static void main(String[] f)
	{
		long n,L,a,i,prevxi=0,prevyi=0,xi,yi;
		long sum=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextLong();
		L=sc.nextLong();
		a=sc.nextLong();
		for(i=0;i<n;i++)
		{
			xi=sc.nextLong();
			yi=sc.nextLong();
			sum+=((xi-prevyi)/(a));
			prevyi=(yi+xi);
		}
		sum+=((L-prevyi)/(a));
		System.out.println(sum);
	}
}