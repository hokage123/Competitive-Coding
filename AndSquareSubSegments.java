import java.util.*;
import java.io.*;
class AndSquareSubSegments
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
public static void main(String[] e)throws IOException
{
int T,N,Q,i,j,k,m,n,count;
double d;
long A[],s;
FastReader sc=new FastReader();
StringBuilder sb=new StringBuilder();
BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
T=sc.nextInt();
for(i=0;i<T;i++)
{
N=sc.nextInt();
Q=sc.nextInt();
A=new long[N];
for(j=0;j<N;j++)
A[j]=sc.nextLong();
for(j=0;j<Q;j++)
{
	count=0;
m=sc.nextInt();
n=sc.nextInt();
if(m==n)
{
	s=A[m-1];
	d=Math.sqrt(s);
	if(d==(long)d)
	sb=sb.append(1+"\n");
	else
		sb=sb.append(0+"\n");
}
else if(m<n)
{
for(k=(m-1);k<=(n-1);k++)
{
		s=A[k];
	d=Math.sqrt(s);
	if(d==(long)d)
	count++;
for(int l=k+1;l<=(n-1);l++)
{
	if(s==0)
	{
		count+=(n-l);
		break;
	}
	else
	{
		s=(s&A[l]);
		d=Math.sqrt(s);
		if(d==(long)d)
			count++;
	}
}
}
sb=sb.append(count+"\n");	
}
}
}
bw.write(sb.toString());
bw.close();
}
}