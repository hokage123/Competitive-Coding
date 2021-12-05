import java.io.*;
import java.util.*;
class MakeAPermutation
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

public static void main(String[] d)throws IOException
{
int T,A,N,i,j,count=0;
HashSet<Integer> hs;
FastReader sc=new FastReader();
T=sc.nextInt();
StringBuffer sb=new StringBuffer();
BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
for(i=0;i<T;i++)
{
	hs=new HashSet<>();
count=0;
N=sc.nextInt();	
for(j=0;j<N;j++)
{
	A=sc.nextInt();
	if(A<=N)
		hs.add(A);
}
sb=sb.append((N-hs.size())+"\n");
}
bw.write(sb.toString());
bw.close();
}
}