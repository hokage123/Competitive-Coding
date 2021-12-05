import java.io.*;
import java.util.*;
class ChefAndModuloGame
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
	public static void main(String[] v)throws IOException
	{
		int T,N,P,i,j,k,l,m;
		HashMap<Integer,Integer> hm;
		FastReader sc=new FastReader();
		BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			hm=new HashMap<>();
			N=sc.nextInt();
			P=sc.nextInt();
			for(j=1;j<=P;j++)
			{
				for(k=1;k<=P;k++)
				{	
				for(l=1;l<=P;l++)
					{
						m=((((N%j)%k)%l)%N);
						if(hm.containsKey(m))
							hm.put(m,(hm.get(m)+1));
						else
							hm.put(m,1);
					}
				}
			}
			sb=sb.append(hm.get(Collections.max(hm.keySet()))+" "+"\n");		
		}
		bf.write(sb.toString());
		bf.close();
	}
}