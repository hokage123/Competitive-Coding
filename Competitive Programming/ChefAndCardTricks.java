import java.util.*;
import java.io.*;
class ChefAndCardTricks
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
int T,N,i,j,k,count,b;
int[] A,B; 
FastReader sc=new FastReader();
T=sc.nextInt();
BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
StringBuilder sb=new StringBuilder();
for(i=0;i<T;i++)
{
N=sc.nextInt();
A=new int[N];
count=0;
for(j=0;j<N;j++)
	A[j]=sc.nextInt();
B=Arrays.copyOf(A,N);
Arrays.sort(B);
for(j=0;j<N;j++)
{
	if(imSorted(A,B))
		count=1;

	if(count==1)
		break;
	k=0;	
b=A[0];
while(k<(N-1))
{
A[k]=A[k+1];
k++;	
}
A[k]=b;
}
if(count==1)
sb=sb.append("YES\n");
else
sb=sb.append("NO\n");
}
bw.write(sb.toString());
bw.close();
}
static boolean imSorted(int[] A,int[] B)
{
	int j=0,count=0;
	while(j<A.length)
	{
		if(A[j]==B[j])
			count++;
		else
			return false;
		j++;
	}
		return true;
}
}