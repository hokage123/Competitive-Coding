import java.util.*;
import java.io.*;
class PlanningTheExpedition
{
	public static void main(String[] d)
	{
		int n,m,a[],i,max,sum=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		a=new int[101];
		for(i=0;i<m;i++)
			a[sc.nextInt()]++;
		Arrays.sort(a);
		max=a[100];
		for(i=max;i>=1;i++)
		{
			sum=0;
			for(j=0;j<101;j++)
			{
				sum+=(a[j]/i);
			}
			if(sum==0 && i==1)
			{
				System.out.println(1);
				break;
			}
			if(sum>n)
			{
				System.out.println((i+1));
				break;
			}
			else if(sum==n)
			{
				System.out.println(i);
				break;
			}
			sum1=sum;
		}
		
	}
}