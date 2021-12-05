import java.util.*;
import java.io.*;
import java.math.*;
class ChefandIngredients
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
		int T,i;
		long K,N,u,v;
		HashSet<Character> hs;
		BigInteger a,b,c,d,e,ans1,ans2,ans;
		FastReader sc=new FastReader();
		BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			N=sc.nextLong();
			K=sc.nextLong();
			u=((K-1)/(N-1));
			v=((K-1)%(N-1));
			a=new BigInteger(""+u);
			b=new BigInteger(""+(u+1));
			c=new BigInteger(""+v);
			d=new BigInteger(""+(N-1));
			e=new BigInteger(""+1000000007);
			ans1=d.multiply(a).multiply(b).divide(new BigInteger("2"));
			ans2=c.multiply(b);
			ans=ans1.add(ans2);
			ans=ans.mod(e);
			sb=sb.append(ans.toString()+"\n");
		}
		bf.write(sb.toString());
			bf.close();
	}
}