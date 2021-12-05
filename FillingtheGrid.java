import java.util.*;
import java.io.*;
class FillingtheGrid
{
	public static void main(String[] d)
	{
		int h,w,count=1,count1=0,i,j;
		long h1;
		Scanner sc=new Scanner(System.in);
		h=sc.nextInt();
		w=sc.nextInt();
		int row[]=new int[h+1];
		int col[]=new int[w+1];
		int a[][]=new int[h+1][w+1];
		int b[][]=new int[h+1][w+1];
		int c[][]=new int[h+1][w+1];
		for(i=1;i<=h;i++)
			row[i]=sc.nextInt();
		for(i=1;i<=w;i++)
			col[i]=sc.nextInt();
		for(i=1;i<=h;i++)
		{
			for(j=1;j<=row[i];j++)
				a[i][j]=1;
		}
		for(i=1;i<=w;i++)
		{
			for(j=1;j<=col[i];j++)
				b[j][i]=1;
		}
		for(i=1;i<=h;i++)
		{
			for(j=1;j<=w;j++)
			{
				if(a[i][j]==1 && b[i][j]==1)
				{
					c[i][j]=1;
				}
				else if(a[i][j]==1 && b[i-1][j]==0 && i>1)
				{
					c[i][j]=1;
				}
				else if(a[i][j-1]==0 && b[i][j]==1 && j>1)
				{
					c[i][j]=1;
				}
				else if(a[i][j]==b[i][j])
				{
					c[i][j]=a[i][j];
				}
				else
				{
					count=0;
				}
			}
			
		}
		
		for(i=1;i<=h;i++)
		{
			for(j=1;j<=w;j++)
			{
				int count0=0;
				if(i>1 && b[i-1][j]!=1)
					count0++;
				if(j>1 && a[i][j-1]!=1)
					count0++;
				if(count0==2)
					count1++;
				
			}
		}
		h1=count;
		long h2=1000000007l;
		for(i=0;i<count1;i++)
		{
			h1*=2;
			h1%=h2;
		}
		System.out.println(h1);
	}
}