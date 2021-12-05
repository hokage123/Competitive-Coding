import java.util.*;
import java.io.*;
class  ChessPlacing
{
	public static void main(String[] d)
	{
		int sum1=0,sum2=0;
		int a[],b[],i;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		a=new int[(n+1)];
		a[0]=0;
		for(i=1;i<=n;i++)
			a[i]=i;
		b=new int[(n/2+1)];
		b[0]=0;
		for(i=1;i<=n/2;i++)
		b[i]=sc.nextInt();
		Arrays.sort(b);
		for(i=1;i<=n/2;i++)
		{
			if(a[((2*i)-1)]>=b[i])
			{
				sum1+=(a[((2*i)-1)]-b[i]);
			}
			else
				sum1+=(b[i]-a[((2*i)-1)]);
			if(a[(2*i)]>=b[i])
				sum2+=(a[(2*i)]-b[i]);
			else
				sum2+=(b[i]-a[(2*i)]);
		}
		if(sum1<=sum2)
			System.out.println(sum1);
		else
			System.out.println(sum2);
	}
}
