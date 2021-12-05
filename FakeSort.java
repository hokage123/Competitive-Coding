import java.util.*;
import java.io.*;
class FakeSort
{
	static int  c=0;
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
int T,N,i,j,k,count;
Anji[] A;
long C[];
FastReader sc=new FastReader();
T=sc.nextInt();
StringBuilder sb=new StringBuilder();
BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
for(i=0;i<T;i++)
{
count=0;
N=sc.nextInt();
A=new Anji[N];
C=new long[N];
for(j=0;j<N;j++)
A[j]=new Anji(sc.nextLong(),(j+1));
Comparator<Anji> m=new Meow();
Arrays.sort(A,m);
for(j=0;j<N;j++)
C[j]=(A[j].ele*(Math.abs((j+1)-A[j].ind)));
count(C,0,(C.length-1));
sb=sb.append(""+c).append("\n");
c=0;
}
bw.write(sb.toString());
bw.close(); 
}
static void count(long a[],int p,int r)
	{
		int q = (p+r)/2;
		if(p<r)
		{
			count(a,p,q);
			count(a,q+1,r);
			mergeCountSplit(a,p,q,r);
		}
	}
	static void mergeCountSplit(long a[],int p,int q,int r)
	{
		int i = 0,j = 0;
		long l1[] = new long[q-p+1];
		long l2[] = new long[r-q];
		for(i=p,j=0;i<=q;i++,j++)
			l1[j] = a[i];
		for(i=q+1,j=0;i<=r;i++,j++)
			l2[j] = a[i];
		i = 0;
		j = 0;
		int k = p;
		while(i<q-p+1 && j<r-q)
		{
			if(l1[i] <= l2[j])
			{
				a[k] = l1[i];
				i++;
			}
			else
			{
				a[k] = l2[j];
				c += l1.length-i;
				j++;
			}
			k++;
		}
		while(i<q-p+1)
		{
			a[k] = l1[i];
			i++;
			k++;
		}
		while(j<r-q)
		{
			a[k] = l2[j];
			j++;
			k++;
		}
	}
}
class Anji 
{
long ele;
int ind;
Anji(long ele,int ind)
{
this.ele=ele;
this.ind=ind;
}
}
class Meow implements Comparator<Anji>
{
@Override
public int compare(Anji a1,Anji a2)
{
Long i1=a1.ele;
Long i2=a2.ele;
return i1.compareTo(i2);
}
} 