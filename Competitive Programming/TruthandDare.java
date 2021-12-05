import java.util.*;
import java.io.*;
class TruthandDare
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
		int T,N1,N2,N3,N4,i,j,d;
		FastReader sc=new FastReader();
		BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		T=sc.nextInt();
		ArrayList<Integer> T1,T2,T3,T4;
		for(i=0;i<T;i++)
		{
			
			N1=sc.nextInt();
			T1=new ArrayList<>();
			for(j=0;j<N1;j++)
			{
				d=sc.nextInt();
				if(!T1.contains(d))
				T1.add(d);
			}
			N2=sc.nextInt();
			T2=new ArrayList<>();
			for(j=0;j<N2;j++)
			{
				d=sc.nextInt();
				if(!T2.contains(d))
				T2.add(d);
			}
			N3=sc.nextInt();
			T3=new ArrayList<>();
			for(j=0;j<N3;j++)
			{
				d=sc.nextInt();
				if(!T3.contains(d))
				T3.add(d);
			}
			N4=sc.nextInt();
			T4=new ArrayList<>();
			for(j=0;j<N4;j++)
			{
				d=sc.nextInt();
				if(!T4.contains(d))
				T4.add(d);
			}
			if(T1.containsAll(T3) && T2.containsAll(T4))
				sb=sb.append("yes\n");
			else
				sb=sb.append("no\n");
		}
		bf.write(sb.toString());
		bf.close();
	}
}