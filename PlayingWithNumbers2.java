import java.io.*;
import java.util.*;
class PlayingWithNumbers2
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
		int T,N,i,j,k,l,a,b,len,len1,count,count1;
		long mymod=0,sum=0,mul=0,max=0,fact;
		FastReader sc=new FastReader();
		BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		T=sc.nextInt();
		HashSet<Integer> hs;
		int[] par,leaf;
		long[] val,mod,modfactor;
		for(i=0;i<T;i++)
		{
		    len=0;
		    count=0;
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
			len=0;
			for(j=1;j<=N;j++)
			{
				val[j]=sc.nextLong();
				if(!(hs.contains(j)))
				len++;
			}
			leaf=new int[len];
			len1=0;
			for(j=1;j<=N;j++)
			{
				if(!(hs.contains(j)))
				{
					leaf[len1]=j;
					len1++;
				}
			}
			for(j=1;j<=N;j++)
			{
				mod[j]=sc.nextInt();
			}
			
			for(j=0;j<len;j++)
			{
			    count=0;
				k=leaf[j];
				mymod=mod[k];
				l=k;
				fact=mymod-1;
				while(l!=0)
				{
					count++;
					l=par[l];
				}
				modfactor=new long[count];
				count=0;
				count1=0;
				while(k!=0)
				{
					modfactor[count]=(val[k]%mymod);
					if(modfactor[count]==0)
						count1++;
					count++;
					k=par[k];
				}
				Arrays.sort(modfactor);
				for(k=(modfactor.length-1);k>=0;k--)
				{
					if(modfactor[k]!=0)
					fact%=modfactor[k];
					if(((mymod-1)%modfactor[k])==0)
					{
						fact=0;
						break;
					}
				}
				if(count==count1)
					sb.append("0 ");
				else
					sb.append((mymod-1-fact)+" ");
			}
			sb.append("\n");
		}
		bf.write(sb.toString());
		bf.close();
	}
}