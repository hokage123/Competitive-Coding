import java.util.*;
import java.io.*;
class ViewsMatter
{
	public static void main(String[] f)
	{
		int top,m,max,a,i,count1=0,countno1=0;
		max=Integer.MIN_VALUE;
		long sum=0;
		Scanner sc=new Scanner(System.in);
		top=sc.nextInt();
		m=sc.nextInt();
		for(i=0;i<top;i++)
		{
			
			a=sc.nextInt();
			max=Integer.max(a,max);
			if(a==1 && count1==0)
			{	
			count1++;
			countno1++;
			sum++;
			}
			else if(a==1 && count1==1)
			{
				countno1++;
			}	
			else
				sum+=a;
		
		}
		top-=countno1;
		long ans;
		ans=Long.min((sum-max),(sum-top));
		System.out.println(ans);
	}
}