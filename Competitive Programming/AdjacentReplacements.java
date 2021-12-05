import java.io.*;
import java.util.*;
class AdjacentReplacements
{
	public static void main(String[] o)
	{
		int a[],n,i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]%2==0)
				a[i]--;
		}
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}