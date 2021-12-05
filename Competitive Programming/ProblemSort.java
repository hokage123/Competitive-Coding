import java.util.*;
import java.io.*;
class ProblemSort
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
int P,S,myans2[],i,j,ans,count=0,vs[],b[],c[];
Integer myans[];
AG a[],d[];
HashSet<Integer> ms;
ArrayList<Integer> ll;
BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
StringBuilder sb=new StringBuilder();
FastReader sc=new FastReader();
P=sc.nextInt();
S=sc.nextInt();
a=new AG[S];
b=new int[S];
c=new int[S];
d=new AG[P];
myans=new Integer[P];
myans2=new int[P];
for(i=0;i<P;i++)
{
	ans=0;
	for(j=0;j<S;j++)
		b[j]=sc.nextInt();
	for(j=0;j<S;j++)
		c[j]=sc.nextInt();
	for(j=0;j<S;j++)	
a[j]=new AG(b[j],c[j]);
Arrays.sort(a,new Mycomp());
for(j=0;j<(S-1);j++)
{
if(a[j].getnT()>a[j+1].getnT())
ans++;
}
myans[i]=ans;
myans2[i]=1;
}
 ms=new HashSet<Integer>(Arrays.asList(myans));
 ll=new ArrayList<Integer>(ms);
 Collections.sort(ll);
 vs=ll.stream().mapToInt(k->k).toArray();
 for(i=0;i<vs.length;i++)
 {
	for(j=0;j<P;j++)
	{
		if(myans[j].intValue()==vs[i])
		{
			count++;
			myans2[j]=count;
			sb=sb.append(j+1).append("\n");
		}
	}	
 }
	bw.write(sb.toString());
 	bw.close();
}
}
class AG
{
	int sT;
	int nT;
	AG(int sT,int nT)
	{
		this.sT=sT;
		this.nT=nT;
	}
	public int getsT()
	{
		return sT;
	}
	public int getnT()
	{
		return nT;
	}
}
class Mycomp implements Comparator<AG>
{
	@Override
	public int compare(AG a1,AG a2)
	{
		if(a1.getsT()>a2.getsT())
			return 1;
		else
			return -1;
	}
}