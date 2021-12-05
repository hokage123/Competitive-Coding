import java.io.*;
import java.util.*;
class GameShopping
{
	public static void main(String[] f)
	{
		int c[],a[],n,m,i,j=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		c=new int[n];
		a=new int[m];
		for(i=0;i<n;i++)
		{
			c[i]=sc.nextInt();
		}
		for(i=0;i<m;i++)
		{
			a[i]=sc.nextInt();
		}
		i=0;
		while(i<n && j<m)
		{
			if(c[i]<=a[j])
			{
				j++;
			}
			i++;
		}
		System.out.println(j);
	}
}