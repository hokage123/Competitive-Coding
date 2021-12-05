import java.util.*;
import java.io.*;
class KuriyamaMiraisStones
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
		int n,m,norm[],sorted[],i,type[],L[],R[];
		long normsum[],sortedsum[];
		FastReader sc=new FastReader();
		BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		n=sc.nextInt();
		norm=new int[n];
		for(i=0;i<n;i++)
			norm[i]=sc.nextInt();
		m=sc.nextInt();
		type=new int[m];
		L=new int[m];
		R=new int[m];
		for(i=0;i<m;i++)
		{
			type[i]=sc.nextInt();
			L[i]=sc.nextInt();
			R[i]=sc.nextInt();
		}
		sorted=Arrays.copyOf(norm,n);
		Arrays.sort(sorted);
		normsum=new long[n+1];
		sortedsum=new long[n+1];
		for(i=1;i<=n;i++)
		{
			if(i==1)
				normsum[i]=norm[i-1];
			else
				normsum[i]=(norm[i-1]+normsum[i-1]);
		}
		for(i=1;i<=n;i++)
		{
			if(i==1)
				sortedsum[i]=sorted[i-1];
			else
				sortedsum[i]=(sorted[i-1]+sortedsum[i-1]);
		}
		for(i=0;i<m;i++)
		{
			if(type[i]==1)
				sb.append(""+(normsum[R[i]]-normsum[L[i]-1])+"\n");
			else
				sb.append(""+(sortedsum[R[i]]-sortedsum[L[i]-1])+"\n");
		}
		bf.write(sb.toString());
		bf.close();
	}
}