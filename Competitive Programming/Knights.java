import java.util.*;
import java.io.*;
class Knights
{
	public static void main(String[] f)
	{
		char a[][];
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		a=new char[n+1][n+1];
		for(i=1;i<=n;i++)
			for(j=1;j<=n;j++)
			{
				if(i%2!=0)
				{
					if(j%2==0)
						a[i][j]='W';
					else
						a[i][j]='B';
				}
				else
				{
					if(j%2==0)
						a[i][j]='B';
					else
						a[i][j]='W';
				}
			}
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.print("\n");
		}			
	}
}