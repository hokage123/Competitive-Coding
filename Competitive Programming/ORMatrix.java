import java.io.*;
import java.util.*;
class ORMatrix
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

public static void main(String u[])throws IOException
{
int T,N,M,i,j,k,ar[][],br,sum;
FastReader sc=new FastReader();
StringBuilder sb=new StringBuilder();
BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
String s="";
T=sc.nextInt();
for(i=0;i<T;i++)
{
sum=0;
N=sc.nextInt();
M=sc.nextInt();
ar=new int[N][];
for(j=0;j<N;j++)
ar[j]=new int[M];	
for(j=0;j<N;j++)
{
s=sc.next();	
for(k=0;k<M;k++)
{
ar[j][k]=Integer.parseInt(""+s.charAt(k));
sum+=ar[j][k];
}
}
for(j=0;j<N;j++)
{
for(k=0;k<M;k++)
{
br=-1;	
if(sum>=1)
{
if(ar[j][k]==1)
br=0;
else if(myrowcolumn1(ar,j,k,N,M))
br=1;
else
br=2;
}
sb=sb.append(br).append(" ");
}
if(!(i==(T-1) && j==(N-1)))
sb=sb.append("\n");
}
}
bw.write(sb.toString());
bw.close();
}
static boolean myrowcolumn1(int[][] ar,int n,int m,int N,int M)
{
int i;
for(i=0;i<M;i++)
{
if(ar[n][i]==1)
return true;
}
for(i=0;i<N;i++)
{
if(ar[i][m]==1)
return true;
}
return false;
}
}