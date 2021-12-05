import java.util.*;
import java.io.*;
class FriendorGirlfriend
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
	public static void main(String[] g)throws IOException
	{
		int T,N,count,count1,i,j;
		String S;
		long A[],sum;
		char X,ch[];
		FastReader sc=new FastReader();
		BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			sum=0;
			count=0;
			N=sc.nextInt();
			S=sc.next();
			X=sc.next().charAt(0);
			ch=S.toCharArray();
			for(j=0;j<N;j++)
			{
				if(ch[j]==X)
					count++;
			}
			A=new long[count];
			count1=0;
			for(j=0;j<N;j++)
			{
				if(ch[j]==X)
				{
					A[count1]=j;
					count1++;
				}
			}
			for(j=0;j<count;j++)
			{
				if(j==0)
				{
					sum+=(N+(A[j]*(N-1-A[j])));
				}
				else
				{
					sum+=((A[j]-A[j-1])+((A[j]-A[j-1])*(N-1-A[j])));
				}
			}
			sb=sb.append(sum+"\n");
		}
		bf.write(sb.toString());
		bf.close();
	}	
}