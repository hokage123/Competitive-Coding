import java.io.*;
import java.util.*;
class ChefandSemiPrimes
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
public static void main(String[] u)throws IOException
{
int T,N,i,j;
ArrayList<Integer> ar=new ArrayList<Integer>();
HashSet<Integer> br=new HashSet<Integer>();
FastReader sc=new FastReader();
T=sc.nextInt();
BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
StringBuilder sb=new StringBuilder();
for(i=2;i<200;i++)
if(twoFactor(i))
ar.add(i);
//for(i=0;i<ar.size();i++)
	//System.out.println(ar.get(i));
for(i=0;i<ar.size();i++)
for(j=i;j<ar.size();j++)
br.add(ar.get(i)+ar.get(j));
//for(i=0;i<br.size();i++)
	//System.out.println(br.get(i));
for(i=0;i<T;i++)
{
N=sc.nextInt();
if(br.contains(N))
sb=sb.append("YES\n");
else
sb=sb.append("NO\n");
}
bw.write(sb.toString());
bw.close();
}
public static boolean twoFactor(int N)
{
int i,count=0;;
for(i=2;i<N;i++)
{	
if((N%i==0) && N%(i*i)==0)
return false;
else if(N%i==0)	
count++;
if(count>=3)
return false;
}
if(count==2)
return true;
else
return false;
}
}