import java.io.*;
import java.util.*;
class MinimizeDigiSum
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
int T,step,i;
long N,D,mymin,N1;
FastReader sc=new FastReader();
T=sc.nextInt();
BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
StringBuilder sb=new StringBuilder();
for(i=0;i<T;i++)
{
step=0;	
N=sc.nextLong();
D=sc.nextLong();
N1=N;
if(D%9==0)
	D=9;
 if(N%9==1 && (N+D)%9==1)
{
mymin=1;
step=min(digisum(N,0,mymin),digisum(N+D,1,mymin));
}
else if(N%9==1)
{
mymin=1;
step=digisum(N,0,mymin);
}
else if(D%9==0)
{
mymin=N%9;
if(mymin==0)
mymin=9;	
step=min(digisum(N,0,mymin),digisum(N+D,1,mymin));
}
else if(D%3==0)
{
mymin=N%3;
if(mymin==0)
	mymin=3;
while(N%9!=mymin)
{
if(Math.log(N%9+D)==mymin && Math.log(N+D)!=mymin)
{	
step+=(digisum(N,0,N%9)+1);
N=(N%9+D);
break;
}	
N=(N+D);
step++;
}
if(N%9==mymin && (N+D)%9==mymin)
step+=(min(digisum(N,0,mymin),digisum(N+D,1,mymin)));
else
step+=digisum(N,0,mymin);

}
else
{
mymin=1;
while(N%9!=mymin)
{
if(Math.log(N%9+D)==mymin && Math.log(N+D)!=mymin)
{	
step+=(digisum(N,0,N%9)+1);
N=(N%9+D);
break;
}	
N=(N+D);
step++;
}
if(N%9==mymin && (N+D)%9==mymin)
step+=(min(digisum(N,0,mymin),digisum(N+D,1,mymin)));
else
step+=digisum(N,0,mymin);
}
sb=sb.append(mymin+" "+step+"\n");
}
bw.write(sb.toString());
bw.close();
}
static int digisum(long N,int step,long mymin)
{
long d=0;
if(N==mymin)
return 0;	
while(N!=0)
{
d+=(N%10);
N=N/10;
}
if(d==mymin)
return step+1;
else
return digisum(d,step+1,mymin);
}
static int min(int a,int b)
{
if(a<b)
return a;
else
return b;
}
}