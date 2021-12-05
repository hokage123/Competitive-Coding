import java.util.*;
import java.io.*;
import java.math.BigInteger;
class ModularGCD
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
int T,i;
long N;
BigInteger A,B,ans,C,D,E,F;
E=new BigInteger("0");
F=new BigInteger("1000000007");
FastReader sc=new FastReader();
T=sc.nextInt();
BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
StringBuilder sb=new StringBuilder();
for(i=0;i<T;i++)
{
A=new BigInteger(sc.next());
B=new BigInteger(sc.next());
N=sc.nextLong();
D=A.subtract(B);
if(D.equals(E))
{
C=myFastPower(A,F,N).add(myFastPower(B,F,N)).mod(F);	
ans=C;
}
else{
C=myFastPower(A,D,N).add(myFastPower(B,D,N)).mod(D);	
	if(C.equals(E))
		ans=D;
	else
    ans=C.gcd(D);
}	
ans=ans.mod(F);
sb=sb.append(ans.toString()).append("\n");
}
bw.write(sb.toString());
bw.close();
}
static BigInteger myFastPower(BigInteger g,BigInteger i,long n)
{
BigInteger t;
if(n==0)
return new BigInteger("1");
else if(n%2==0)
{
t=myFastPower(g,i,n/2).mod(i);

return (t.multiply(t).mod(i));
}
else
return g.mod(i).multiply(myFastPower(g,i,n-1).mod(i)).mod(i);
}
}