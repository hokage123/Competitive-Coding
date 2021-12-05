import java.util.*;
import java.io.*;
class SegmentOccurrences
{
	public static void main(String[] p)
	{
		int n,m,q,i,j;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		q=sc.nextInt();
		int[] a=new int[n];
		String s=sc.next();
		String s1=sc.next();
		HashSet<Integer> hs=new HashSet<>();
		for(i=0;i<(n-m+1);i++)
		{
			hs.add(s.indexOf(s1,i));
		}
		for(int g:hs)
		{
		    if(g>0)
			a[g]++;
		}
		for(i=0;i<q;i++)
		{
			long count=0;
			int L=sc.nextInt();
			int R=sc.nextInt();
			for(j=(L-1);j<=(R-1);j++)
			{
				if((R-j)>=m && a[j]==1)
					count++;
			}
			System.out.println(count);
		}
	}
}