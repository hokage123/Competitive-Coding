import java.util.*;
import java.io.*;
import java.math.*;
class BinaryNim2
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
int T,N,i,j,count=0;
String S,B;
FastReader sc=new FastReader();
T=sc.nextInt();
BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
StringBuilder sb=new StringBuilder();
for(i=0;i<T;i++)
{	
B="";
N=sc.nextInt();
S=sc.next();
count=0;
for(j=0;j<N;j++)
B+=sc.next();
if(new BigInteger(B,2).bitCount()<=(N-new BigInteger(B,2).bitCount()))
sb=sb.append(S+"\n");
else
{
	if(S=="Dee")
		sb=sb.append("Dum\n");
	else
		sb=sb.append("Dee\n");
}
}
bw.write(sb.toString());
bw.close();
}
}