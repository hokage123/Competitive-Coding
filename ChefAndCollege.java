import java.io.*;
import java.util.*;
class ChefAndCollege
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
public static void main(String[] p)
{
int N,Q,i,j,a[][],m,n,d;
ArrayList<String> ar=new ArrayList<>();
FastReader sc=new FastReader();
N=sc.nextInt();
Q=sc.nextInt();
a=new int[N][N];
for(i=0;i<N;i++)
for(j=0;j<N;j++)
a[i][j]=0;
for(i=0;i<Q;i++)
{
d=sc.nextInt();
m=sc.nextInt();
n=sc.nextInt();
if(d==0)
a[m-1][n-1]=1;
else if(d==1)
{ 
if(arewefriends(a,m-1,n-1))
ar.add("YES");
else
ar.add("NO");
}
}
for(String o:ar)
System.out.println(o);	
}
static boolean arewefriends(int a[][],int m,int n)
{
int i,j,k;
if(a[m][n]==1)
return true;
for(i=m;i<=n;i++)
for(j=(i+1);j<=n;j++)
for(k=(j+1);k<=n;k++)
{
if(a[i][j]==1 && a[j][k]==1)
a[i][k]=1;
if(a[m][n]==1)
return true;
}
return false;
}
}