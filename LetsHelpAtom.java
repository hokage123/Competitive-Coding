import java.util.*;
import java.io.*;
class LetsHelpAtom
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
String S,W,SG;
int ops,k,Q,i;
S="";
char ch[];
ArrayList<String> am=new ArrayList<String>();
ArrayList<Character> ar=new ArrayList<Character>();
FastReader sc=new FastReader();
Q=sc.nextInt();
for(i=0;i<Q;i++)
{	
ops=sc.nextInt();
if(ops==1)
{
am.add(S);
W=sc.next();
S+=W;
}
else if(ops==2)
{
am.add(S);
k=sc.nextInt();
ch=S.toCharArray();
if(ch.length!=k)
S=new String(ch,0,(ch.length-k));
else
S="";	
}
else if(ops==3)
{
k=sc.nextInt();
ar.add(S.charAt(k-1));		
}
else if(ops==4)
{
S=(String)(am.get(am.size()-1));
am.remove(am.size()-1);
}
}
for(Character c:ar)
System.out.println(c);	
}
}