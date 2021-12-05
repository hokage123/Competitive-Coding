import java.util.*;
import java.io.*;
import java.math.*;
class ChefandEasyProblem
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
	public static void main(String[] d)
	{
		int N,Q,X,a[],i,j,k;
		FastReader sc=new FastReader();
		N=sc.nextInt();
		Q=sc.nextInt();
		char bin[][]=new char[31][N];
		a=new int[N];
		for(i=0;i<N;i++)
		{
			a[i]=sc.nextInt();
			String f=Integer.toBinaryString(a[i]);
			char ch[]=f.toCharArray();
			for(j=0;j<f.length()/2;j++)
			{
				char swap=ch[j];
				ch[j]=ch[ch.length-1-j];
				ch[ch.length-1-j]=swap;
			}
			for(j=0;j<31;j++)
			{
				if(j<ch.length)
					bin[j][i]=ch[j];
				else
					bin[j][i]='0';
			}
		}
		int zero[][]=new int[31][N];
		int one[][]=new int[31][N];
		for(j=0;j<31;j++)
		{
			for(k=0;k<N;k++)
			{
				if(k==0)
				{	
					if(bin[j][k]=='1')
					{
						zero[j][k]=0;
						one[j][k]=1;
					}
					else
					{
						zero[j][k]=1;
						one[j][k]=0;
					}
				}
				else
				{
					if(bin[j][k]=='1')
					{
						zero[j][k]=zero[j][k-1];
						one[j][k]=one[j][k-1]+1;
					}
					else
					{
						zero[j][k]=zero[j][k-1]+1;
						one[j][k]=one[j][k-1];
					}
				}
			}
		}
		for(i=0;i<Q;i++)
		{
			int realans=0;
			int L=sc.nextInt();
			int R=sc.nextInt();
			char ans[]=new char[31];
			for(j=0;j<31;j++)
			{
				int count0=0;
				int count1=0;
				if(L==1)
				{
					count0=zero[j][R-1];
					count1=one[j][R-1];
				}
				else
				{
					count0=(zero[j][R-1]-zero[j][L-2]);
					count1=(one[j][R-1]-one[j][L-2]);
				}
				if(count1>=count0)
				{
					ans[j]='0';
				}
				else
					ans[j]='1';	
			}
			for(j=0;j<15;j++)
			{
				char swap=ans[j];
				ans[j]=ans[30-j];
				ans[30-j]=swap;
			}
			Integer real=Integer.parseInt(new String(ans),2);
			realans=real;	
			System.out.println(realans);	
		}
	}
}