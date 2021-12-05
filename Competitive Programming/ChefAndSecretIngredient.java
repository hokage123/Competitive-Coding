import java.util.*;
import java.io.*;
class ChefAndSecretIngredient
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
	public static void main(String[] m)throws IOException
	{
		int T,N,i,j,k,count;
		String s;
		char g;
		HashMap<Character,Integer> hm=new HashMap<>();
		FastReader sc=new FastReader();
		BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			count=0;
			N=sc.nextInt();
			hm=new HashMap<>();
			for(j=0;j<N;j++)
			{
				s=sc.next();
				for(k=0;k<26;k++)
				{
					g=(char)('a'+k);
					if(s.indexOf(g)!=-1)
					{
						if(hm.containsKey(g))
						{
							hm.put(g,(hm.get(g)+1));
						}
						else
							hm.put(g,1);
					}
				}
			}
			for(char ch:hm.keySet())
			{
				if(hm.get(ch)==N)
					count++;
			}
			sb=sb.append(count+"\n");
		}
		bf.write(sb.toString());
		bf.close();
	}
}