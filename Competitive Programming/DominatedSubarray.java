import java.util.*;
import java.io.*;
class DominatedSubarray
{
	public static void main(String[] s)
	{
		int i,t,j,n;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(i=0;i<t;i++)
		{
			int key=-1;
			int min=1;
			int A[]=new int[200001];
			n=sc.nextInt();
			for(j=0;j<n;j++)
				A[sc.nextInt()]++;
			for(j=0;j<A.length;j++)
			{
				if(A[j]>1)
				{
					if(min==1)
					{
						min=A[j];
						key=j;
					}
					else if(min>A[j])
					{
						min=A[j];
						key=j;
					}
				}
			}
			if(min==1)
			System.out.println("-1");
			else
			System.out.println(key);	
		}
	}
}