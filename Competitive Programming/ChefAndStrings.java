import java.io.*;
import java.util.*;
class ChefAndStrings
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
public static void main(String[] f) throws IOException
{
int N,L,R,Q,C,i,j,count;
String[] myStr;
String P1;
StringBuilder ans=new StringBuilder();
char P;
FastReader sc=new FastReader();
BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
N=sc.nextInt();
myStr=new String[N];
for(i=0;i<N;i++)
myStr[i]=sc.next();
Comparator<String> c=new MyComparator();
Arrays.sort(myStr,c);	
Q=sc.nextInt();
for(i=0;i<Q;i++)
{
count=0;
L=sc.nextInt();
R=sc.nextInt();
C=sc.nextInt();
P1=sc.next();
P=P1.charAt(0);
for(j=(L-1);j<R;j++)
{
if(myStr[j].length()>=C)
{
	if(myStr[j].charAt(C-1)==P)
	count++;
}
else
	break;
}
ans.append(count).append("/n");
}
bw.write(ans.toString());
bw.close();
}
} 
class MyComparator implements Comparator<String>
{
	@Override
	public int compare(String s1,String s2)
	{
		Integer i=s1.length();
		Integer i1=s2.length();
		return i1.compareTo(i);
	}
}