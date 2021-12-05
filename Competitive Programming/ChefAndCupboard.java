import java.util.*;
import java.io.*;
class ChefAndCupboard
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
int T,i;
long[] myX,mYV;
long A,B,X,V,V1;
FastReader sc=new FastReader();
T=sc.nextInt();
myX=new long[T];
mYV=new long[T];
for(i=0;i<T;i++)
{
A=sc.nextLong();
B=sc.nextLong();
X=(((A+B)-(long)(Math.sqrt((A*A)+(B*B)-(A*B))))/3);
V=((A-X)*(B-X)*X);
V1=((A-X-1)*(B-X-1)*(X+1));
if(V1>V)
{
X++;
myX[i]=X;
mYV[i]=V1;
}
else
{
myX[i]=X;
mYV[i]=V;
}
}
for(i=0;i<T;i++)
System.out.println(myX[i]+" "+mYV[i]);
}
}