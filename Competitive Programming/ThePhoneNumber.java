import java.util.*;
import java.io.*;
class ThePhoneNumber
{
	public static void main(String[] g)
	{
		int n,count=0,i,j=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int x=n;
		int a[]=new int[n+1];
		for(i=(n/2);i>=1;i--)
		{
			a[j]=i;
			j++;
		}
		n-=(n/2);
		for(i=1;i<=n;i++)
		{
			a[j]=i;
			j++;
		}
		if(n%2!=0 && x>3)
		{
			int swap=a[(x/2)-1];
			a[(x/2)-1]=a[(x/2)];
			a[(x/2)]=swap;
		}
		for(i=1;i<=n;i++)
			System.out.print(a[i]+" ");
	}
}