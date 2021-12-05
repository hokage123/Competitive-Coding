import java.io.*;
import java.util.*;
class PolycarpsPockets
{
	public static void main(String[] g)
	{
		int n,i,max=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[101];
		for(i=0;i<n;i++)
			a[sc.nextInt()]++;
		for(i=1;i<=100;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		System.out.println(max);
	}
}