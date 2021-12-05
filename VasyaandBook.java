import java.util.*;
import java.io.*;
class VasyaandBook
{
	public static void main(String[] f)
	{
		long n,x,y,d,ans=-1,i;
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(i=0;i<t;i++)
		{
			ans=-1;
		n=sc.nextLong();
		x=sc.nextLong();
		y=sc.nextLong();
		d=sc.nextLong();
		if(y>=x)
		{
			if((y-x)%d==0)
				ans=((y-x)/d);
			else if((y-1)%d==0 && (n-y)%d==0)
			{
				
				long ans1=(((y-1)/d)+((x-1)/d)+1);
				long ans2=(((n-y)/d)+((n-x)/d)+1);
				ans=Long.min(ans1,ans2);
			}
			else if((y-1)%d==0)
			ans=(((y-1)/d)+((x-1)/d)+1);
			else if((n-y)%d==0)
			ans=(((n-y)/d)+((n-x)/d)+1);
			
		}
		else if(x>y)
		{
			if((x-y)%d==0)
				ans=((x-y)/d);
			else if((y-1)%d==0 && (n-y)%d==0)
			{
				
				long ans1=(((y-1)/d)+((x-1)/d)+1);
				long ans2=(((n-y)/d)+((n-x)/d)+1);
				ans=Long.min(ans1,ans2);
			}
			else if((y-1)%d==0)
			ans=(((y-1)/d)+((x-1)/d)+1);
			else if((n-y)%d==0)
			ans=(((n-y)/d)+((n-x)/d)+1);
		}
		System.out.println(ans);
	}
	}
}