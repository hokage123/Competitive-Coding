import java.io.*;
import java.util.*;
class Forgery
{
	public static void main(String[] t)
	{
		String ans="Yes";
		int n,m,i,j;
		char a[][];
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		a=new char[n][];
		for(i=0;i<n;i++)
			a[i]=sc.next().toCharArray();
		char b[][]=new char[n][m];
		for(i=0;i<n;i++)
			for(j=0;j<m;j++)
			{
				b[i][j]='.';
			}
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				if((i+2)<n && (j+2)<m)
				{
					if(a[i][j]=='#' && a[i+1][j]=='#' && a[i+2][j]=='#' && a[i][j+1]=='#' && a[i+2][j+1]=='#' && a[i][j+2]=='#' && a[i+1][j+2]=='#' && a[i+2][j+2]=='#')
					{
						b[i][j]='#';
						b[i+1][j]='#';
						b[i+2][j]='#';
						b[i][j+1]='#';
						b[i+2][j+1]='#';
						b[i][j+2]='#';
						b[i+1][j+2]='#';
						b[i+2][j+2]='#';
					}
				}
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				if(a[i][j]!=b[i][j])
				{
					ans="No";
					break;
				}
			}
			if(ans.equals("No"))
				break;
		}
		System.out.println(ans);
	}
}