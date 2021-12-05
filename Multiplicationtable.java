import java.io.*;
import java.util.*;
class Multiplicationtable
{
	public static void main(String[] g)
	{
		int n,i,j;
		long a[][];
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		a=new long[n+1][n+1];
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
				a[i][j]=sc.nextLong();
		}
		long b[]=new long[n+1];
			long h=a[1][2];
			h*=a[1][3];
			h/=a[2][3];
			b[1]=(int)(Math.sqrt(h));
		for(i=2;i<=n;i++)
		{
			b[i]=(a[1][i]/b[1]);
		}
		for(i=1;i<=n;i++)
			System.out.print(b[i]+" ");
	}	
}