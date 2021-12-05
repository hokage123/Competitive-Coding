import java.util.*;
import java.io.*;
class CircularMerging
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
		int T,N,i,j,k,d;
		long sum,sumo,min,A[];
		FastReader sc=new FastReader();
		BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
			T=sc.nextInt();
			for(i=0;i<T;i++)
			{
				d=0;
				min=0;
				sum=0;
				sumo=0;
				N=sc.nextInt();
				A=new long[N];
				for(j=0;j<N;j++)
				{
					A[j]=sc.nextLong();
				}
				for(k=0;k<N;k++)
				{	
				min=0;
				for(j=0;j<N;j++)
				{
					if(j==0)
						sum=(A[0]+A[N-1]);
					else	
					sum=(A[j-1]+A[j]);
					if(min==0 || min>sum)
					{
						min=sum;
						d=j;
					}
				}
				sumo+=min;
				if(d==0)
				{
					
					A[0]+=A[N-1];
					A[N-1]=0;
				}
				else
				{
					A[d-1]+=A[d];
					for(j=d;j<(N-1);j++)
					{
						A[j]=A[j+1];
						
					}
					A[N-1]=0;
				}
				N--;
				}
				sb.append(sumo+"\n");
					
			}
			bf.write(sb.toString());
			bf.close();
			
	}
}