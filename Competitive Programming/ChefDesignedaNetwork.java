import java.util.*;
import java.io.*;
class ChefDesignedaNetwork
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
	public static void main(String[] s)
	{
		int T,i;
		long N,M;
		long count;
		FastReader sc=new FastReader();
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			count=-1;
			//ans=-1;
			N=sc.nextLong();
			M=sc.nextLong();
			if(M<=((N*(N+1))/2))
			{
			if(N==2)
			{
				if(M==1)
				count=1;
				else if(M==2 || M==3)
				count=2;	
			}
			else if(N==1)
			{
				if(M<=N)
				count=M;
				else
				count=-1;	
			}
			else if(M>=(N-1))
			{
				count=0;
			if(M>=(N) || M>=(N-1))
				count+=2;
			if(M>(N+1))
				count++;
			if(N%2==0 && M>(2*N))
				{
				    M-=(2*N);
				    if(M%(N/2)==0)
				    count+=(M/(N/2));
				    else
				    {
				        count+=(M/(N/2));
				        count++;
				    }
				}
			if(N%2!=0 && M>(2*N))
			{
				M-=(2*N);
				if(M>=N)
				count+=((M/N)*2);
				M%=N;
				if(M!=0)
				count++;
				M-=(N/2);
				if(M>0)
				count++;
			}
			}
			}
			if(count<=N)
			System.out.println(count);
			else 
			System.out.println("-1");	
		}
				
		}
	}