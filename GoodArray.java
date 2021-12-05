import java.io.*;
import java.util.*;
class GoodArray
{
	public static void main(String[] d)
	{
		int n,i,count=0,maxy=-1;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		long a[]=new long[n];
		ArrayList<Integer> ar=new ArrayList<>();
		long max=0,secondmax=0,sum=0;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextLong();
			if(max<a[i])
			{
				max=a[i];
				maxy=i;
			}
			sum+=a[i];
		}
		for(i=0;i<n;i++)
		{
			if(secondmax<a[i] && i!=maxy)
				secondmax=a[i];
		}
		//System.out.println(max+" "+secondmax);
		for(i=0;i<n;i++)
		{
			long f=sum-a[i];
			if((f%2)==0)
			{
				if(i==maxy && f==(2*secondmax))
				{
					count++;
					ar.add((i+1));
				}
				else if(f==(2*max) && i!=maxy)
				{
					count++;
					ar.add((i+1));
				}
			}
		}	
			System.out.println(count);
			for(int g:ar)
				System.out.print(g+" ");
		
	}
}