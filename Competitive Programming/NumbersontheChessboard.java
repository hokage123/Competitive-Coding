import java.util.*;
import java.io.*;
class NumbersontheChessboard
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
	public static void main(String[] s)
	{
		long n,a,b,i;
		int q;
		FastReader sc=new FastReader();
		n=sc.nextLong();
		long x;
		if(n%2==0)
		{
			x=(n*n);
			x/=2;
		}
		else
		{
			x=(n*n);
			x++;
			x/=2;
		}
		q=sc.nextInt();
		for(i=0;i<q;i++)
		{
			a=sc.nextLong();
			b=sc.nextLong();
			long sum=(((a-1)*n)+b+1);
			sum/=2;
			if((a+b)%2==0)
				System.out.println(sum);
			else
				System.out.println((sum+x));
		}
	}
}