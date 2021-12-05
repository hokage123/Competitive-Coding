import java.io.*;
import java.util.*;
class Benches
{
	public static void main(String[] u)
	{
		int n,m,a[],sum=0,max=0,i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		 a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			sum+=a[i];
			if(a[i]>max)
				max=a[i];
		}
		int div=((sum+m)/n);
		int rem=((sum+m)%n);
		if(div>=max)
		{
			if(rem>0)
				System.out.println((div+1)+" "+(m+max));
			else
				System.out.println(div+" "+(m+max));
		}
		else
			System.out.println(max+" "+(m+max));
	}
}