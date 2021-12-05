import java.io.*;
import java.util.*;
class ForcedParticles
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
int T,n,m,a[][],i,j,k;
FastReader sc=new FastReader();
BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
StringBuilder sb=new StringBuilder();
T=sc.nextInt();
String s,s1;
for(i=0;i<T;i++)
{
n=sc.nextInt();
m=sc.nextInt();
a=new int[n][m];
for(j=0;j<n;j++)
{
s=sc.nextLine();
for(k=0;k<m;k++)
a[j][k]=Integer.parseInt(""+s.charAt(k));
}
s1=sc.nextLine();
for(j=0;j<s1.length();j++)
{
if(s1.charAt(j)=='L')
a=myleft(a,n,m);
else if(s1.charAt(j)=='R')
a=myright(a,n,m);
else if(s1.charAt(j)=='U')
a=myup(a,n,m);
else if(s1.charAt(j)=='D')
a=mydown(a,n,m);
}
for(j=0;j<n;j++)
{
for(k=0;k<m;k++)
sb=sb.append(""+a[j][k]);
if(!((i==(T-1) && j==n-1)))
sb=sb.append("\n");
}
}
bw.write(sb.toString());
bw.close();
}
public static int[][] myleft(int a[][],int n,int m)
{
int i,j,count;
for(i=0;i<n;i++)
{
count=0;
for(j=0;j<m;j++)
{
if(a[i][j]==1)
count++;
}
for(j=0;j<m;j++)
{
if(j<count)
a[i][j]=1;
else
a[i][j]=0;
}
}
return a;
}
public static int[][] myright(int a[][],int n,int m)
{
int i,j,count;
for(i=0;i<n;i++)
{
count=0;
for(j=0;j<m;j++)
{
if(a[i][j]==1)
count++;
}
for(j=0;j<m;j++)
{
if(j<count)
a[i][m-1-j]=1;
else
a[i][m-1-j]=0;
}
}
return a;
}
public static int[][] myup(int a[][],int n,int m)
{
int i,j,count;
for(i=0;i<m;i++)
{
count=0;
for(j=0;j<n;j++)
{
if(a[j][i]==1)
count++;
}
for(j=0;j<n;j++)
{
if(j<count)
a[j][i]=1;
else
a[j][i]=0;
}
}
return a;
}
public static int[][] mydown(int a[][],int n,int m)
{
int i,j,count;
for(i=0;i<m;i++)
{
count=0;
for(j=0;j<n;j++)
{
if(a[j][i]==1)
count++;
}
for(j=0;j<n;j++)
{
if(j<count)
a[n-1-j][i]=1;
else
a[n-1-j][i]=0;
}
}
return a;
} 
}