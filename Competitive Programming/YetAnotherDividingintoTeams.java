import java.util.*;
import java.io.*;
class YetAnotherDividingintoTeams
{
	public static void main(String[] s)
	{
		int count,i,j,n;
		Scanner sc=new Scanner(System.in);
		int q;
		q=sc.nextInt();
		for(i=0;i<q;i++)
		{
			count=1;
			int a;
			n=sc.nextInt();
			int A[]=new int[101];
			for(j=0;j<n;j++)
			{
				a=sc.nextInt();
				A[a]++;
			}
			for(j=1;j<101;j++)
			{
				if(A[j-1]>0 && A[j]>0)
					count=2;
			}
			System.out.println(count);
		}
	}
}