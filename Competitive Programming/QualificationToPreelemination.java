import java.io.*;
import java.util.*;
class QualificationToPreelemination
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
int T,N,K,i,j,s,ans,rank,count;
Integer a[];
//ArrayList<Integer> ar;
FastReader sc=new FastReader();
T=sc.nextInt();
BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
StringBuilder sb=new StringBuilder();
for(i=0;i<T;i++)
{
	ans=0;
	count=0;
	rank=0;
N=sc.nextInt();
K=sc.nextInt();
a=new Integer[N];
//ar=new ArrayList<Integer>();
for(j=0;j<N;j++)
a[j]=sc.nextInt();
Arrays.sort(a,Collections.reverseOrder());
s=a[0];
while(j<N)
{
	if(a[j].equals(s))
		count++;
	else
	{
		s=a[j];
		rank+=count;
		count=0;
	}
	if(rank==(K-1))
		break;
}
while(j<N)
{
	if(a[j].equals(s))
		ans++;
	else if(s<a[j])
		break;
}
ans+=rank;
sb=sb.append(ans+"\n");
}
bw.write(sb.toString());
bw.close();
}
}