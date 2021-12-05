import java.io.*;
import java.util.*;
class MaximumSumofDigits
{
	public static void main(String[] d)
	{
		long n,i;
		String s="";
		Scanner sc=new Scanner(System.in);
		n=sc.nextLong();
		int digi=((int)(Math.log(n)/Math.log(10)));
		for(i=0;i<digi;i++)
		{
			s+="9";
		}
		long f;
		if(s.length()==0)
			f=0;
		else
			f=Long.parseLong(s);
		n-=f;	
		long e=sumdigi(n);
		System.out.println((e+(digi*9)));
		
	}
	 static long sumdigi(long n)
	 {
		 long sum=0;
		 while(n!=0)
		 {
			 sum+=(n%10);
			 n/=10;
		 }
		 return sum;
	 }
}