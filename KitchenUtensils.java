import java.util.*;
import java.io.*;
class KitchenUtensils
{
	public static void main(String[] s)
	{
		int i,n,k,a[],d,sum=0,count=0,max=0,ans;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		a=new int[101];
		for(i=0;i<n;i++)
			a[sc.nextInt()]++;
		for(i=0;i<=100;i++)
		{
			if(max<=a[i])
				max=a[i];
			if(a[i]>0)
				count++;
			sum+=a[i];
		}
		//System.out.println(sum+" "+k+" "+count);
		if(max%k==0)
			d=max;
		else
			d=((max+k)-(max%k));
		ans=((d*count)-sum);
		System.out.println(ans);
	}
}