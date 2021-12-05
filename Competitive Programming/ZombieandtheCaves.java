import java.io.*;
import java.util.*;
class ZombieandtheCaves
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
	  
  
	public static void main(String[] s)
	{
		TreeMap<Long,ArrayList<Long>> tm;
		int T,i,c[],a[],b[],count,j,N,f[],sum;
		long e,d;
		FastReader sc=new FastReader();
		T=sc.nextInt();
	for(i=0;i<T;i++)
	{
		sum=0;
		count=0;
		N=sc.nextInt();
		c=new int[N];
		a=new int[N];
		b=new int[N];
		f=new int[N];
		for(j=0;j<N;j++)
		{
			c[j]=sc.nextInt();
			if(((j-c[j]+1)<=0))
				b[0]++;
			else 
				b[j-c[j]]++;
			if(((c[j]+j)<(N-1)))
					b[c[j]+j+1]--;
		}
		for(j=0;j<N;j++)
			a[j]=sc.nextInt();
		for(j=0;j<N;j++)
		{
			sum+=b[j];
			f[j]=sum;
		}
			Arrays.sort(f);
			Arrays.sort(a);
			for(j=0;j<N;j++)
			{
				if(a[j]>100000)
					break;
				if(a[j]==f[j])
					count++;
			}
			if(count==N)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}