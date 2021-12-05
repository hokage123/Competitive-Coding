import java.util.*;
import java.io.*;
class ShahSavesRukh
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
public static void main(String[] f)throws IOException
{
int T,i;
long N;
FastReader sc=new FastReader();
T=sc.nextInt();
BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
StringBuilder sb=new StringBuilder();
for(i=0;i<T;i++)
{
N=sc.nextInt();
sb=sb.append(mytwoposes(N));
sb=sb.append("\n");
}
bw.write(sb.toString());
bw.close();
}
static String mytwoposes(long N)
{
long i;
int j;
CircularLinkedList ll=new CircularLinkedList();
for(i=1;i<=N;i++)
ll.add(i);		
CircularLinkedList.Node First=ll.makeMeHalf();
return First.a+" "+First.next.a;	
}
}
class CircularLinkedList
{
private	Node First;
private Node Last;
	static class Node
	{
		long a;
		Node next;
		public Node(long a)
		{
			this.a=a;
			this.next=null;
		}
	}
	public void add(long N)
	{
		Node m;
		m=new Node(N);
		if(First==null)
		{
			First=m;
			Last=m;
		}
		else
		{
			Last.next=m;
			Last=m;
			Last.next=First;
		}
	}
	public  int size()
	{
		int count=1;
		Node m=First.next;
		while(m!=First)
		{
			count++;
			m=m.next;
		}
		return count;
	}
	public Node	makeMeHalf()
	{
		long r1=Last.a;
		Node m=First,n;
		while(r1>2)
		{
			if((r1%2)==0)
			{
			while(m.next!=First)
			{
				m.next=m.next.next;
				r1--;
				if(r1==2)
					return First;
				if(m.next==Last)
					n=m;
				m=m.next;
			}
				Last=n;
				Last.next=First;
				if(r1==2)
				return First;
			}
			if(r1%2!=0)
			{
			while(m.next!=First)
			{
				m.next=m.next.next;
				r1--;
				if(r1==2)
					return First;
				m=m.next;
			}
			r1--;
			First=First.next;
			Last.next=First;
			if(r1==2)
				return First;
			}
		}
		return First;
	}
}