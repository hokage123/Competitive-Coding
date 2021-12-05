import java.util.*;
import java.io.*;
class OneMoreWeirdGame
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
	public static void main(String[] s)throws IOException
	{
		int T,N,M,i,j,k;
		long sum;
		int a[][];
		FastReader sc=new FastReader();
		BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			sum=0;
			N=sc.nextInt();
			M=sc.nextInt();
			a=new int[N][M];
			for(j=0;j<N;j++)
			{
				for(k=0;k<M;k++)
				{
					if(((j+1)%2==0) && ((k+1)%2==0))
					{
						a[j][k]=1;
					}
					else if(((j+1)%2!=0) && ((k+1)%2!=0))
					{
						a[j][k]=1;
					}
					else
					{
						a[j][k]=1;
					}
				}
			}
			for(j=0;j<N;j++)
			{
				for(k=0;k<M;k++)
				{
					if(a[j][k]==0)
					{
						if(j>0)
						{
							sum+=a[j-1][k];
						}
						if(j<(N-1))
						{
							sum+=a[j+1][k];
						}
						if(k>0)
						{
							sum+=a[j][k-1];
						}
						if(k<(M-1))
						{
							sum+=a[j][k+1];
						}
					}
				}
			}
			sb=sb.append(sum+"\n");
		}
		bf.write(sb.toString());
		bf.close();
	}
}