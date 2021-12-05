import java.io.*;
import java.util.*;
public class Ropewalkers
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
	public static void main(String[] g)throws IOException
	{
		int T,d,i,j,A[],sum;
		FastReader sc=new FastReader();
		BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		
			sum=0;
			A=new int[3];
			for(j=0;j<3;j++)
				A[j]=sc.nextInt();
			d=sc.nextInt();
			Arrays.sort(A);
			for(j=0;j<2;j++)
			{
			    if(A[j]>A[j+1])
			    {
			        j--;
			        Arrays.sort(A);
			        continue;
			    }
				if(!((A[j+1]-A[j])>=d))
				{
					sum+=(d-(A[j+1]-A[j]));
					A[j+1]+=(d-(A[j+1]-A[j]));
				}
			}
			sb=sb.append(sum+"\n");
		bf.write(sb.toString());
			bf.close();
	}
}