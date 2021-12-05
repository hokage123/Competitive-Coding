import java.util.*;
import java.io.*;
class SwordFight
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
public static void main(String[] s)throws IOException
{
int T,N,win[],i,j,k,max,count,p1,p2,c;
long P[],x,y,ty[];
FastReader sc=new FastReader();
BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
StringBuilder sb=new StringBuilder();
T=sc.nextInt();
for(i=0;i<T;i++)
{	
count=0;	
c=0;
N=sc.nextInt();
P=new long[N];
win=new int[N];
for(j=0;j<N;j++)
{	
P[j]=sc.nextLong();
win[j]=0;
}
for(j=0;j<(N-1);j++)
{
for(k=j+1;k<N;k++)
{
x=P[j];
y=P[k];
p1=0;
p2=0;
while(x>0 || y>0)
{
if(x%2==0 && y%2!=0)
p1+=1;
else if(x%2!=0 && y%2==0)
p2+=1;
x=x/2;
y=y/2;
}
if(p1>p2)
win[k]=win[k]+1;
else if(p1<p2)	
win[j]=win[j]+1;
	}
}
max=win[0];
for(j=0;j<N;j++)
{
	if(max<win[j])
		max=win[j];
}
for(j=0;j<N;j++)
{
	if(max==win[j])
		count++;
}
sb=sb.append(count).append("\n");
ty=new long[count];
for(j=0;j<N;j++)
{
	if(max==win[j])
	{
		ty[c]=P[j];
		c++;
	}
	if(c==count)
		break;
}
Arrays.sort(ty);
for(j=0;j<count;j++)
{
	sb.append(ty[count-1-j]).append(" ");
}
sb=sb.append("\n");
}
bw.write(sb.toString());
bw.close();
}
}