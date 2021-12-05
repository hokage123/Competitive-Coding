import java.util.*;
import java.io.*;
class TableGame
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

public static void main(String[] m) throws IOException
{
int T,N,M,Q,ar[][],i,j,k;
char[] a,b;
String s;
FastReader sc=new FastReader();
BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
StringBuilder sb=new StringBuilder();
T=sc.nextInt();
for(i=0;i<T;i++)
{
	s="";
 a=sc.next().toCharArray();
 b=sc.next().toCharArray();
 N=a.length;
 M=b.length;
 Q=sc.nextInt();
 ar=new int[M+1][N+1];
 for(j=0;j<=M;j++)
 for(k=0;k<=N;k++)
 {
 if(j==0 && k==0)
 ar[j][k]=0;
else if(j==0)
ar[j][k]=a[k-1]-48;
else if(k==0)
ar[j][k]=b[j-1]-48;
else if((j-1)>=0 || (k-1)>=0)
{	
	if((j-1)==0)
{
if(ar[j-1][k]==0)
ar[j][k]=1;
}
 if((k-1)==0)
{
if(ar[j][k-1]==0)
ar[j][k]=1;
}
}
else
ar[j][k]=0; 
 }
 for(j=1;j<=M;j++)
 for(k=1;k<=N;k++)
 {
  if((j-1)>=1 && (k-1)>=1)
  {
  if(ar[j-1][k-1]==1)
  ar[j][k]=1;
  }
  if((j-2)>0 && k>1)
  {
  if(ar[j-2][k]==1)
  ar[j][k]=1;
  }
  if((k-2)>0 && j>1)
  {
  if(ar[j][k-2]==1)
  ar[j][k]=1;
  }
 }
 for(j=0;j<Q;j++)
 {
 if(ar[sc.nextInt()][sc.nextInt()]==1)
 s+="1";
 else
 s+="0";
 }
 sb.append(s +"\n");
}
bw.write(sb.toString());
bw.close();
}
}