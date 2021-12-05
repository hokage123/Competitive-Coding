import java.util.*;
import java.io.*;
class DeathNote
{
	public static void main(String[] s)
	{
		int n,m,a[],b[],i,j;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		a=new int[n];
		b=new int[n];
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		j=0;
		int sum=0;;
		for(i=0;i<n;i++)
		{
			sum+=a[i];
			if(i==0)
				b[i]=sum/m;
			else
				b[i]=sum/m;
		}
		sum=0;
		for(i=0;i<n;i++)
		{
			if(i==0)
			System.out.print(b[i]+" ");
			else
			System.out.print((b[i]-b[i-1])+" ");	
		}
	}
}