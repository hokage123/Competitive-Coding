import java.util.*;
import java.io.*;
class IntenseHeat
{
	public static void main(String[] f)
	{
		int n,k,a[],i;
		double sum,max;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		a=new int[n];
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(i=0;i<n;i++)
		{
			sum=0;
			for(j=(i+1);j<n;j++)
			{
				sum+=a[i];
				if((j-i+1)>=k)
				{
					if(max<(sum/(j-i+1)))
						max=(sum/(j-i+1));
				}
			}
		}
		System.out.println(max);
	}
}