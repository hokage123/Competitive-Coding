import java.io.*;
import java.util.*;
public class EmailfromPolycarp
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
		int T,i,j;
		String S1,S2,ans;
		char[] ch1,ch2;
		int[] a,b;
		FastReader sc=new FastReader();
		BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			ans="YES";
			S1=sc.next();
			S2=sc.next();
			a=new int[26];
			b=new int[26];
			ch1=S1.toCharArray();
			ch2=S2.toCharArray();
			for(j=0;j<ch1.length;j++)
				a[ch1[j]-'a']++;
			for(j=0;j<ch2.length;j++)
				b[ch2[j]-'a']++;
			for(j=0;j<26;j++)
			{
				if((a[j]>b[j]))
					ans="NO";
				else if(a[j]==0 && b[j]>0)
					ans="NO";
			}
			
			sb=sb.append(ans+"\n");
		}
		bf.write(sb.toString());
			bf.close();
	}
}