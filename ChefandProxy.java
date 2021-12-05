import java.io.*;
import java.util.*;
class ChefandProxy
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
	public static void main(String[] p)throws IOException
	{
		int T,N,i,j,co=0,po=0,f=0;
		String S;
		FastReader sc=new FastReader();
		BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			co=0;
			po=0;
			N=sc.nextInt();
			S=sc.next();
			char ch[]=S.toCharArray();
			for(j=0;j<N;j++)
			{
				if(ch[j]=='P')
				{
					co++;
				}
				else if(j==0 || j==1 || j==(N-1) || j==(N-2))
				{
					
				}
				else if(((ch[j-1]=='P') || (ch[j-2]=='P')) && ((ch[j+1]=='P') || (ch[j+2]=='P')))
				{
					po++;
				}
			}
			if(N%4==0)
			{
				f=((3*N)/4);
			}
			else
			{
				f=(((3*N)/4)+1);
			}
			if(co>=f)
			{
			    sb=sb.append("0\n");
			}
			else if((co+po)>=f)
				sb=sb.append((f-co)+"\n");
			else
				sb=sb.append("-1\n");
		}
		bf.write(sb.toString());
		bf.close();
	}

}