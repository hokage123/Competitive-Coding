import java.io.*;
import java.util.*;
class Guessit
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
public static void main(String[] d)
{
int T,N,i,j,k,count,length;
String myans[],sa;
ArrayList<String> pass;
String mycombo,ans;
FastReader sc=new FastReader();
T=sc.nextInt();
myans=new String[T];
for(i=0;i<T;i++)
{
	N=sc.nextInt();
	pass=new ArrayList<String>(N);
	for(j=0;j<N;j++)
		pass.add(sc.next());
	mycombo=sc.next();
	ans="";
	count=0;
	length=0;
 for(j=0;j<mycombo.length();j++)
 { 
	 for(k=(j+1);k<=mycombo.length();k++)
	 {
		 sa=mycombo.substring(j,k);
		 if(pass.contains(sa))
		 { 
			length+=sa.length();
			 ans+=(sa+" ");
		 }
		 if(length==mycombo.length())
		 {
			 count=1;
			 break;
		 }
	 }
	 if(count==1)
		 break;
 }
 if(count==1)
	 myans[i]=ans;
 else
	 myans[i]="WRONG PASSWORD";
}
for(i=0;i<T;i++)
System.out.println(myans[i]);
}
}