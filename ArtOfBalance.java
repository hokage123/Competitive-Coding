import java.util.*;
import java.io.*;
class ArtOfBalance
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
		
		long m1,m2,m3,avg,min,max;
		int min1,min2,div,d;
		long count[];
		String s;
		char ch[];
		int T,i,j,N,len,k,n,c;
		FastReader sc=new FastReader();
		BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			min1=0;
			min2=0;
			avg=0;
			len=0;
			div=0;
			min=0;
			m1=0;
			m2=0;
			m3=0;
			max=0;
			c=0;
			d=0;
			count=new long[26];
			s=sc.next();
			N=s.length();
			ch=s.toCharArray();
			for(j=0;j<26;j++)
				count[j]=0;
			for(j=0;j<N;j++)
			{
				count[ch[j]-'A']=(count[ch[j]-'A']+1);
			}
			Arrays.sort(count);
			if(len==1)
				m3=0;
			else
			{
				
			for(j=0;j<26;j++)
			{
				if(count[j]>0)
				len++;
				if(max<count[j])
					max=count[j];
			}
			if(isPrime(N))
			{
				m3=(N-max);
			}
			else
			{
			for(n=len;n>=1;n--)
			{
					if(N%n==0)
					{
						div=n;
					
					avg=N/n;		
			for(j=(26-len);j<=(26-div);j++)
			{
				m1=0;
				m2=0;
				
				for(k=0;k<div;k++)
				{
					if((count[j+k]-avg)>=0)
					{
						m1+=(count[j+k]-avg);
					}
					else
						m2+=(avg-count[j+k]);
				}
				if(m3==0 && c==0)
				{
					m3=m2;
				}
				else 
				{
					if(m3>m2)
						m3=m2;
				}
				c++;
			}
			}
			}
			}
			if(c==0)
			{
				m3=(N-max);
			}	
			for(j=len+1;j<=26;j++)
			{
				m1=0;
				if(N%j==0)
				{
						m2=((N/j));
				
				for(k=(26-len);k<26;k++)
				{
					if(count[k]>(N/j))
						m1+=(count[k]-m2);
				}
				if(m3>m1)
				{
					m3=m1;
				}
				}
			}
			if(count[26-len]==count[25])
				m3=0;
			sb=sb.append(m3+"\n");
		}
		}
			bf.write(sb.toString());
			bf.close();
	}
	public static boolean isPrime(int N)
	{
		int j;
		if(N==2)
			return true;
		for(j=2;j<=Math.sqrt(N);j++)
		{
			if(N%j==0)
				return false;
		}
		return true;
	}
}