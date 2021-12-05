import java.util.*;
import java.io.*; 
class MaxRangeQueries
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
		int T,C[],N,K,L[],R[],max,m1,m2,sum,i,j,k;
		FastReader sc=new FastReader();
		BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			m1=0;
			m2=0;
			sum=0;
			max=0;
			C=new int[100000];
			N=sc.nextInt();
			K=sc.nextInt();
			L=new int[N];
			R=new int[N];
			for(j=0;j<N;j++)
			{
				L[j]=sc.nextInt();
				R[j]=sc.nextInt();
				if(j==0)
				{
					m1=L[j];
					m2=R[j];
				}
				for(k=(L[j]-1);k<R[j];k++)
				{
					C[k]++;	
				}
				if(m1>L[j])
					m1=L[j];
				if(m2<R[j])
					m2=R[j];
			}
			for(j=0;j<N;j++)
			{
				max=0;
				for(k=(L[j]-1);k<R[j];k++)
				{
					C[k]--;
				}
				for(k=m1;k<m2;k++)
				{
					if(C[k]==K)
						max++;
				}
				for(k=(L[j]-1);k<R[j];k++)
				{
					C[k]++;
				}
				if(max>sum)
					sum=max;
			}
			sb=sb.append(sum+"\n");
		}
		bf.write(sb.toString());
			bf.close();
	}
}