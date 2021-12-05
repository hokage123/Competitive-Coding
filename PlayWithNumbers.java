import java.io.*;
import java.util.*;
class PlayingWithNumbers
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
	public static void main(String[] f)throws IOException
	{
		int T,N,i,j,k,a,b;
		long mymod=0,sum=0,mul=0,max=0;
		Scanner sc=new Scanner(System.in);
		BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		T=sc.nextInt();
		HashSet<Integer> hs;
		int[] par;
		long[] val,mod;
		for(i=0;i<T;i++)
		{
			hs=new HashSet<>();
			N=sc.nextInt();
			par=new int[N+1];
			val=new long[N+1];
			mod=new long[N+1];
			par[1]=0;
			for(j=0;j<(N-1);j++)
			{
				a=sc.nextInt();
				b=sc.nextInt();
				par[b]=a;
				hs.add(a);
			}
			for(j=1;j<=N;j++)
			{
				val[j]=sc.nextLong();
			}
			for(j=1;j<=N;j++)
			{
				sum=0;
				max=0;
				mod[j]=sc.nextLong();
				k=j;
				if(!hs.contains(k))
				{
					while(k!=0)
					{
						sum=val[k];
					sum%=mod[j];
					mymod=sum%mod[j];
					if(mymod!=0)
					{
					if(mod[j]%mymod==0)
						mul=(sum/mymod-1);
					else
						mul=sum/mymod;
					}
					mymod*=mul;
					if(max<mymod)
						max=mymod;
						k=par[k];
					}
					
					sb.append(max+" ");
				}
				
			}
			sb.append("\n");
		}
		bf.write(sb.toString());
		bf.close();
	}
}