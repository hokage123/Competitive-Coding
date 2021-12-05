import java.util.*;
import java.io.*;
class BeautifulGarland
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
public static void main(String[] d)throws IOException
{
	int T,n,i,c,j;
	String s,g,h;
	FastReader sc=new FastReader();
	T=sc.nextInt();
	BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
	StringBuilder sb=new StringBuilder();
	for(i=0;i<T;i++)
	{
		c=0;
		g="";
		s=sc.next();
		n=s.length();
		if(n%2==0)
		{	
		if(imbeautiful(s,n))
			c=1;
		else
		{	
			for(j=0;j<=(n/2);j++)
			{
				String u=s.substring(0,j);
				String y=s.substring((j+n/2),n);
				StringBuffer sj=new StringBuffer(s.substring(j,(j+n/2)));
				StringBuffer sk=new StringBuffer(u+y);
				g=(u+new String(sj.reverse())+y);
				h=(new String(sk.reverse())+new String(sj));
				if(imbeautiful(g,n) || imbeautiful(h,n))
				{
					c=1;
					break;
				}
			}
		}
		}
		if(c==1 || s=="R" || s=="G")
			sb=sb.append("yes\n");
		else
			sb=sb.append("no\n");
	}
	bf.write(sb.toString());
	bf.close();
}
static boolean imbeautiful(String e,int n)
{
int i;
char g,c;
g='A';
char ch[]=e.toCharArray();	
	for(i=0;i<n;i++)
	{
		c=ch[i];
		if(i==0 && ch[i]=='R')
		{
			g=ch[i];
		}
		else if(i==0 && ch[i]=='G')
		{
			g=ch[i];
		}
		else if(g!=c)
		{
			g=c;
		}
		else
			return false;
	}
	return true;
}
}