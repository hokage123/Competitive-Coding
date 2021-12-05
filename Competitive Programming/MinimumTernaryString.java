import java.io.*;
import java.util.*;
class MinimumTernaryString
{
	public static void main(String[] s)
	{
		int n,i,j=0,swap;
		Scanner sc=new Scanner(System.in);
		String ans="";
		char[] a=sc.next().toCharArray();
		n=a.length;
		for(i=0;i<n;i++)
		{
			if(i==0)
			{
				j++;
			}
			else
			{
				if(a[i]!=a[i-1])
					j++;
			}
		}
		int b[]=new int[j];
		int count[]=new int[j];
		j=0;
		for(i=0;i<n;i++)
		{
			if(i==0)
			{
				b[j]=a[i];
				count[j]++;
			}
			else
			{
				if(a[i]!=a[i-1])
				{	
					j++;
					b[j]=a[i];
					count[j]++;
				}
				else
					count[j]++;
			}
		}
		for(i=1;i<b.length;i++)
		{
			j=i;
			while(b[j]==(b[j-1]-1))
			{
				swap=b[j];
				b[j]=b[j-1];
				b[j-1]=swap;
				swap=count[j];
				count[i]=count[j-1];
				count[j-1]=swap;
				if(j>1)
					j--;
			}
		}
	
		for(i=0;i<b.length;i++)
		{
			for(j=0;j<count[i];j++)
			{
				ans+=(b[i]-'0');
			}
		}
		System.out.println(ans);
	}
}