import java.util.*;
import java.io.*;
import java.math.*;
class GuessItRight
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
	public static void main(String[] o)throws IOException
	{
		int T,i,j,k;
		long sum,sum1,sum2,a,b,c,d,e;
		long f=1000000007;
		int M,N,K;
		FastReader sc=new FastReader();
		BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			N=sc.nextInt();
			K=sc.nextInt();
			M=sc.nextInt();
			a=N;
			b=N-1;
			c=N+K;
			 if(M%2==0)
			{
			d=pow(a,M/2);
			e=pow(b,M/2);
			sum1=(d%f-e%f)%f;
			sum1=(sum1*(c%f))%f;
			sum1=(sum1+e%f)%f;
			sum2=d%f;
			sum2=(sum2*c%f)%f;
			sum2=(modInverse(sum2,f));
			sum2=sum2%f;
			sum=sum1*sum2;
			sum=sum%f;
			}
			else
			{
			d=pow(a,(M+1)/2);
			e=pow(b,(M+1)/2);
			sum1=(d%f-e%f)%f;
			sum2=d%f;
			sum2=modInverse(sum2,f);
			sum2=sum2%f;
			sum=sum1*sum2;
			sum=sum%f;
			}
			sb=sb.append(sum+"\n");
		}
		bf.write(sb.toString());
			bf.close();
	}
	public static long pow(long a,int b)
	{
		long f=1000000007,x;
		if(b==0)
		{
			return 1;
		}
		else if(b==1)
			return a%f;
		else if(b%2==0)
		{
			x=(pow(a,b/2)%f);
			return ((x*x)%f);
		}
		else
		{
			x=(pow(a,b-1)%f);
			return (((a%f)*x)%f);
			
		}
	}
	public static long modInverse(long a,long m)
	{
		long m0 = m; 
        long y = 0, x = 1; 
  
        if (m == 1) 
            return 0; 
  
        while (a > 1) 
        { 
            long q = a / m; 
  
            long t = m; 
            m = a % m; 
            a = t; 
            t = y; 
            y = x - q * y; 
            x = t; 
        } 
  
        if (x < 0) 
            x += m0; 
  
        return x;
		
	}
}