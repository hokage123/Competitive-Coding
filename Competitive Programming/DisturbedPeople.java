import java.util.*;
import java.io.*;
class DisturbedPeople
{
	public static void main(String[] f)
	{
		int n,a[],i,count=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		a=new int[n];
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(i=1;i<(n-1);i++)
		{
		if(a[i-1]==1 && a[i]==0 && a[i+1]==1)
			{
				a[i+1]=0;
				count++;
			}
		}
		System.out.println(count);
	}
}