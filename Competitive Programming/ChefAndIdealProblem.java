import java.util.*;
import java.io.*; 
class ChefAndIdealProblem
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
		int N,X,Y;
		double d;
		FastReader sc=new FastReader();
		BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		d=(Math.random()*3);
		if(d!=(int)d)
			X=(int)(d+1);
		else
			X=(int)d;
		System.out.println(X);
		Y=sc.nextInt();
		if((X==1 && Y==2) || (X==2 && Y==1))
			System.out.println("3");
		else if((X==2 && Y==3) || (X==3 && Y==2))
			System.out.println("1");
		else
			System.out.println("2");
	}
}