import java.io.*;
import java.util.*;
class ChefAndHappiness
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
int T,N,A[],i,j,count;
HashSet<Integer> hs;
FastReader sc=new FastReader();
BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
StringBuilder sb=new StringBuilder();
T=sc.nextInt();
for(i=0;i<T;i++)
{
hs=new HashSet<>();	
count=0;
N=sc.nextInt();
A=new int[N];
for(j=0;j<N;j++)
{
A[j]=sc.nextInt();
hs.add(A[j]);
}
if(hs.size()!=1)
{	
for(Integer k:hs)
{
	for(Integer l:hs)
	{
		if(l!=k)
		{
			if(A[l-1]==A[k-1])
			count=1;
		}
		if(count==1)
			break;
	}
	if(count==1)
		break;
}
}
if(count==1)
sb=sb.append("Truly Happy\n");
else
sb=sb.append("Poor Chef\n");
}
bw.write(sb.toString());
bw.close();
}
}