import java.io.*;
import java.util.*;
class CreatingtheContest
{
	public static void main (String[] f)
	{
		 int a[],n,i,count=0,max=0;
		 Scanner sc=new Scanner(System.in);
		 n=sc.nextInt();
		 a=new int[n];
		 int[] freq=new int[n];
		 for(i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
				if(a[i]<=(2*a[count]))
					freq[count]++;
				else
				{
					while(a[i]>(2*a[count]))	
						count++;
					freq[count]++;
				}
			}
		for(i=1;i<n;i++)
		{
			if(freq[i-1]>1)
				freq[i]+=(freq[i-1]-1);
		}
		for(i=0;i<n;i++)
		{
			if(max<freq[i])
				max=freq[i];
		}
		System.out.println(max);
	}
}