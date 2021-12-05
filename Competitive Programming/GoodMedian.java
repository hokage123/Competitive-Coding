import java.util.*;
import java.io.*;
class GoodMedian
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
public static void main(String[] s)throws IOException
{
int T,N,i,j,k,B[];
long c;
int p=1000000007;
long A[];
FastReader sc=new FastReader();
BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
StringBuilder sb=new StringBuilder();
T=sc.nextInt();
for(i=0;i<T;i++)
{
	c=0;
	N=sc.nextInt();
	A=new long[N];
	for(j=0;j<N;j++)
		A[j]=sc.nextLong();
	Arrays.sort(A);
	c=fastpower(2,N-1,p);
	c=c%p;
	for(j=0;j<(N-1);j++)
	{
		if(A[j]==A[j+1])
		{
			c=(c+(mylucastheorem((N-2),j,p)));
			c=c%p;
		}
	}
	sb=sb.append(c+"\n");
}
bf.write(sb.toString());
bf.close();
}
static long fastpower(int n,int pow,int p)
{
	long y;
	if(pow==0)
		return 1;
	else if(pow%2==0)
	{
		 y=fastpower(n,pow/2,p);
		return (((y%p)*(y%p))%p);
	}
	else
	{
		 y=fastpower(n,pow-1,p);
		return (((n%p)*(y%p))%p);
	}
} 
static long mylucastheorem(int n,int r,int p)
{
	if(r==0)
		return 1;
int n1=n%p;
int r1=r%p;
return ((mylucasd(n1,r1,p)*mylucastheorem((n/p),(r/p),p))%p);	
}
static long mylucasd(int n,int r,int p)
{
	int i,j;
	long C[]=new long[r+1];
	C[0]=1;
	for(i=1;i<=n;i++)
	{
		for(j=Integer.min(i,r);j>0;j--)
		{
			C[j]=(C[j]+C[j-1])%p;
		}
	}
	return C[r];
}
}