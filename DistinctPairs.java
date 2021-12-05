import java.util.*;
import java.io.*;
class DistinctPairs
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
		int N,M,i,j,k,value1,value2;
		long a,l;
		HashMap<Long,Integer> al,bl;
		long[] A,B;
		al=new HashMap<>();
		bl=new HashMap<>();
		FastReader sc=new FastReader();
		BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		N=sc.nextInt();
		M=sc.nextInt();
		A=new long[N];
		B=new long[M];
		for(i=0;i<N;i++)
		{
			a=sc.nextLong();
			al.put(a,i);
			A[i]=a;
		}
		for(i=0;i<M;i++)
		{
			a=sc.nextLong();
			bl.put(a,i);
			B[i]=a;
		}
		
		Arrays.sort(A);
		Arrays.sort(B);
		for(i=0;i<M;i++)
			sb=sb.append(al.get(A[0]).toString()+" "+bl.get(B[i]).toString()+"\n");
		for(i=1;i<N;i++)
			sb=sb.append(al.get(A[i]).toString()+" "+bl.get(B[M-1]).toString()+"\n");
		bf.write(sb.toString());
		bf.close();
	}
}