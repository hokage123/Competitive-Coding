import java.io.*;
import java.util.*;
class APrank
{
	public static void main(String[] s)
	{
		int n,a[],i,j=0,count=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		a=new int[n];
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(i=1;i<(n-1);i++)
		{
			if(a[i]==(a[i-1]+1) && a[i+1]==(a[i]+1))
				count++;
		}
		if(n>=2 && a[n-2]==999)
			count++;
		if(n>=2 && a[1]==2)
			count++;
		System.out.println(count);
	}
}