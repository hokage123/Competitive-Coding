import java.util.*;
import java.io.*;
class PointsinSegments
{
	public static void main(String[] g)
	{
		int n,m,sum1=0,l,r,i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		ArrayList<Integer> ar=new ArrayList<>();
		int sum[]=new int[m+1];
		for(i=0;i<n;i++)
		{
			l=sc.nextInt();
			r=sc.nextInt();
			sum[l]++;
			if(r<m)
			sum[r+1]--;	
		}
		for(i=1;i<=m;i++)
		{
			sum1+=sum[i];
			if(sum1==0)
				ar.add(i);
		}
		System.out.println(ar.size());
		for(int j:ar)
			System.out.print(j+" ");
	}	
}