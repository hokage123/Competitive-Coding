import java.io.*;
import java.util.*;
class Balloons
{
	public static void main(String[] f)
	{
		Scanner sc=new Scanner(System.in);
		int N,a[],i,sum=0,sum1=0,count=0,count1=0;
		N=sc.nextInt();
		a=new int[N];
		for(i=0;i<N;i++)
		{
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		for(i=0;i<N;i++)
		{
			sum1+=a[i];
			if((sum-sum1)!=sum1)
			{
				count=1;
				count1=(i+1);
				break;
			}
		}
		if((count==0) || (sum1==sum))
			System.out.println("-1");
		else
		{
			System.out.println(count1);
			for(i=0;i<count1;i++)
				System.out.println((i+1));
		}
	}
}