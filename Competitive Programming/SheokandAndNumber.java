import java.util.*;
import java.io.*;
class SheokandAndNumber
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
public static void main(String[] p)throws IOException
{
int T,i,j;	
long N,M,c,d;
FastReader sc=new FastReader();
BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
StringBuilder sb=new StringBuilder();
ArrayList<Long> ar=new ArrayList<>();
for(i=1;i<=31;i++)
{
for(j=0;j<i;j++)
	ar.add((long)(Math.pow(2,i)+Math.pow(2,j)));
}
Collections.sort(ar);
T=sc.nextInt();
for(i=0;i<T;i++)
{
N=sc.nextLong();
if(ar.get(0).longValue()>N);
M=(ar.get(0).longValue()-N);	
for(j=0;j<(ar.size()-1);j++)
{
	c=ar.get(j).longValue();
	d=ar.get(j+1).longValue();
	if(c==N || d==N)
	{	
	M=0;
	break;
	}
	else if(N<d && N>c)
	{
		if((d-N)<(N-c))
			M=(d-N);
		else
			M=(N-c);
		break;
	}
}
sb=sb.append(M+"\n");	
}
bw.write(sb.toString());
bw.close();	
}
}