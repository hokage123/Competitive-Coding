import java.util.*;
import java.io.*;
class NoChangeRequired
{
	public static void main(String[] f)
	{
		int T,N,i,j;
		long P,A[];
		Scanner sc=new Scanner(System.in);
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			String s="";
			int c=0,indi=-1,maxind=-1;
			long max=0;
			N=sc.nextInt();
			P=sc.nextLong();
			A=new long[N];
			for(j=0;j<N;j++)
			{
				
				A[j]=sc.nextLong();
				max=Long.max(max,A[j]);
				if(A[j]==max)
					maxind=j;	
			}
			for(j=0;j<N;j++)
			{
				if(P%A[j]!=0)
				{
					indi=j;
					c=1;
					break;
					
				}
			}
			if(c==0)
			{
				P-=max;
				for(j=0;j<N;j++)
				{
					if(P%A[j]!=0)
					{
						indi=j;
						c=1;
						break;
						
					}
				}
				if(c==0)
					System.out.println("NO");
				else
				{
					for(j=0;j<N;j++)
					{
						if(j==maxind)
							s+=" 1";
						else if(j==indi)
						{
							s+=" ";
							s+=((P/A[indi])+1);
						}
						else
							s+=" 0";
					}
					System.out.println("YES"+s);
				}
			}
			else
			{
				for(j=0;j<N;j++)
					{
						 if(j==indi)
							{
								s+=" ";
								s+=((P/A[indi])+1);
							}
						else
							s+=" 0";
					}
				System.out.println("YES"+s);	
			}
		}
	}
}