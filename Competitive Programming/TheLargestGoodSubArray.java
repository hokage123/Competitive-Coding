import java.io.*;
import java.util.*;
class TheLargestGoodSubArray
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
public static void main(String[] d)throws IOException
{
	int T,n,a[],length,i,j,k,count;
	FastReader sc=new FastReader();
	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	StringBuilder sb=new StringBuilder();
	T=sc.nextInt();
	for(i=0;i<T;i++)
	{
	length=0;
	count=0;
	n=sc.nextInt();
	a=new int[n];
	for(j=0;j<n;j++)
	a[j]=sc.nextInt();
	for(j=0;j<n;j++)
	{
	for(k=(n-1);k>=j;k--)
	{
	if(a[j]>=a[k])
	{
	if(length<(k-j+1))
	length=(k-j+1);
	}
	if(length>=(n-j-1))
	{	
		count=1;
		break;
		}
	}
	if(count==1)
		break;
	}
	if(i!=(T-1))
	sb=sb.append(""+length).append("\n");
	else
	sb=sb.append(""+length);	
	}
	bw.write(sb.toString());
	bw.close();
}
}