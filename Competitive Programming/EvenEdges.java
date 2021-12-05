import java.util.*;
import java.io.*;
class EvenEdges
{
	static class FastReader
	{
	BufferedReader bf;
	StringTokenizer st;
	public FastReader()
	{
		bf=new BufferedReader(new InputStreamReader(System.in));
	}
	String next()
	{
	while(st==null || !st.hasMoreElements())
	{
		try
		{
			st=new StringTokenizer(bf.readLine());
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
		return st.nextToken();
	}
	int nextInt()
	{
		return Integer.parseInt(next());
	}
	float nextFloat()
	{
		return Float.parseFloat(next());
	}
	long nextLong()
	{
		return Long.parseLong(next());
	}
	double nextDouble()
	{
		return Double.parseDouble(next());
	}
	String nextLine()
	{
		String str="";
		try
		{
			str=bf.readLine();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return str;
	}
	}
	public static void main(String[] r)throws IOException
	{
		int totalEdge=0,i,j,count,c,d;
		int N,T,Edge[],E;
		FastReader sc=new FastReader();
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			c=0;
			d=0;
			count=0;
			N=sc.nextInt();
			E=sc.nextInt();
			totalEdge=E;
			Edge=new int[N+1];
			for(j=1;j<=E;j++)
			{
				c=sc.nextInt();
				d=sc.nextInt();
				Edge[c]++;
				Edge[d]++;
			}
			if(E%2==0)
			{
				System.out.println("1");
				for(j=1;j<=N;j++)
					System.out.print("1 ");
			}
			else
			{	
			for(j=1;j<=N;j++)
			{
				if(Edge[j]%2==1)
				{
					count=j;
					break;
				}
			}
			if(count==0)
			{
				System.out.println(3);
				for(j=1;j<=N;j++)
				{
					if(j==c)
						System.out.print(2+" ");
					else if(j==d)
						System.out.print(3+" ");
					else
						System.out.print(1+" ");
				}
			}
			else
			{
				System.out.println("2");
				for(j=1;j<=N;j++)
				{
					if(j==count)
					{
						System.out.print("2 ");
					}
					else
					{
						System.out.print("1 ");
					}
				}
			}
			}
			System.out.println();
		}
	}
}