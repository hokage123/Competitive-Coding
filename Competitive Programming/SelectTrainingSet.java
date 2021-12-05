import java.util.*;
import java.io.*;
class SelectTrainingSet
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
	public static void main(String[] f)
	{
		FastReader sc=new FastReader();	
		int t,i,j;
		t=sc.nextInt();
		for(i=0;i<t;i++)
		{
			int N;
			String s;
			int a;
			HashMap<String,Long> hm=new HashMap<>();
			HashMap<String,Long> hm1=new HashMap<>();
			HashSet<String> hs=new HashSet<>();
			N=sc.nextInt();
			for(j=0;j<N;j++)
			{
				s=sc.next();
				a=sc.nextInt();
				if(a==0)
				{
					if(hm.containsKey(s))
					{
						hm.put(s,(hm.get(s)+1L));
					}
					else
					{
						hm.put(s,1L);
						
					}
				}
				if(a==1)
				{
					if(hm1.containsKey(s))
					{
						hm1.put(s,(hm1.get(s)+1L));
					}
					else
					{
						hm1.put(s,1L);
						
					}
				}
				if(!hs.contains(s))
					hs.add(s);
			}
			long sum=0;
			for(String y:hs)
			{
				if(hm.containsKey(y) && hm1.containsKey(y))
					sum+=Long.max(hm.get(y),hm1.get(y));
				else if(hm1.containsKey(y))
					sum+=hm1.get(y);
				else
					sum+=hm.get(y);
			}
			System.out.println(sum);
		}
	}
}