import java.util.*;
import java.io.*;
class WarOfXors
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

public static void main(String[] args)throws IOException
{
	int T,ar,i,j;
	long count,N,s1,s2,c,c1,c2;
	HashMap<Integer,Integer> hm;
	FastReader sc=new FastReader();
	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	StringBuilder sb=new StringBuilder();
	T=sc.nextInt();
	for(i=0;i<T;i++)
	{
		hm=new HashMap<Integer,Integer>();
		s1=0;
		s2=0;
		c=0;
		c1=0;
		c2=0;
		N=sc.nextLong();
		count=(N*(N-1))/2;
		for(j=0;j<N;j++)
		{	
		ar=sc.nextInt();
		if(hm.containsKey(ar))
			hm.put(ar,(hm.get(ar)+1));
		else
			hm.put(ar,1);	
		}
		for(int k:hm.keySet())
		{
			c1=hm.get(k);
					if(k%2==0)
						s1+=c1;
					else
						s2+=c1;
			count-=(c1*(c1-1))/2;
			if(hm.containsKey(k^2))
			{
			c2=hm.get(k^2);
			c+=(c1*c2);
			}	
		}
		count-=(c/2+s1*s2);
		sb=sb.append(count+"\n");
	}
	bw.write(sb.toString());
	bw.close();
}
}