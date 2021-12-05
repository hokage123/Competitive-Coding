import java.io.*;
import java.util.*;
class KefaandFirstSteps
{
	public static void main(String[] s)
	{
		int l=0,n,ar[],max=0,i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		ar=new int[n];
		for(i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(l==0)
				l=1;
			else if(ar[i]>=ar[i-1])
				l++;
			else
				l=1;
			max=Integer.max(max,l);
		}
		System.out.println(max);
	}
}