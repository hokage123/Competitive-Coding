import java.util.*;
import java.io.*;
import java.math.*;
class Maximizeit
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
	int T,N,i,j,d,ans=0;
	BigInteger A[],c,m,pro,product,product1,K;
	FastReader sc=new FastReader();
	BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
	StringBuilder sb=new StringBuilder();
	T=sc.nextInt();
	for(i=0;i<T;i++)
	{
		ans=0;
		c=new BigInteger("0");
		product=new BigInteger("1");
		N=sc.nextInt();
		K=new BigInteger(sc.next());
		A=new BigInteger[N];
		for(j=0;j<N;j++)
		{
			d=sc.nextInt();
			m=K.pow(d);
			A[j]=c.add(m);
		}
		for(j=0;j<N;j++)
		{
			if(j<(N-1))
			pro=((A[N-1].subtract(A[j])).multiply(A[j]));
			else
				pro=c;
			product1=pro.max(product);
			if(!(product.equals(product1)))
			{
				ans=j+1;
			}
		}
		sb=sb.append(ans+"\n");
	}
	bf.write(sb.toString());
	bf.close();
}
}