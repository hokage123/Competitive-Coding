import java.io.*;
import java.util.*;
 class AppyLovesOne
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
	int N,Q,K,count=0,count1=0,count2=0,large=0,a,b,c,d=0,e,f,i,j;
	char m[];
	ArrayList<Integer> u,ucount;
	FastReader sc=new FastReader();
	BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
	StringBuilder sb=new StringBuilder();
	N=sc.nextInt();
	Q=sc.nextInt();
	K=sc.nextInt();
	u=new ArrayList<>();
	ucount=new ArrayList<>();
	for(i=0;i<N;i++)
	{
		a=sc.nextInt();
		if(i==0)
		{
			if(a==1)
				count=1;
			else
				count=0;
			u.add(a);
			ucount.add(1);
		}
		else if(a==1 && count==1)
		{
			ucount.set((u.size()-1),((ucount.get(u.size()-1))+1));
		}
		else if(a==0 && count==0)
		{
			ucount.set((u.size()-1),((ucount.get(u.size()-1))+1));
		}
		else if(a==0 && count==1)
		{
			u.add(a);
			ucount.add(1);
			count=0;
		}
		else if(a==1 && count==0)
		{
			u.add(a);
			ucount.add(1);
			count=1;
		}
	}
	//max=Collections.max(ucount);
	m=sc.next().toCharArray();
	if(N==u.size() && N%2==0)
	{
		for(i=0;i<Q;i++)
			{
				if(m[i]=='?')
					sb=sb.append("1\n");
			}	
	}
	else if(K==1)
	{
		if(u.contains(1))
		{
			for(i=0;i<Q;i++)
			{
				if(m[i]=='?')
					sb=sb.append("1\n");
			}
		}
		else
		{
			for(i=0;i<Q;i++)
			{
				if(m[i]=='?')
					sb=sb.append("0\n");
			}
		}
	}
	else if(u.size()==1)
	{
		b=u.get(0);
		c=ucount.get(0);
	for(i=0;i<Q;i++)
	{	
		if(b==1 && m[i]=='?')
		{
			if(c>=K)
				sb=sb.append(K+"\n");
			else
				sb=sb.append(c+"\n");
		}
		else if(b==0 && m[i]=='?')
		{
			sb=sb.append("0\n");
		}
	}
	}
	else
	{	
	for(i=0;i<Q;i++)
	{
		if(m[i]=='!')
		{
			b=u.get(u.size()-1);
			c=ucount.get(u.size()-1);
			e=u.get(0);
			f=ucount.get(0);
			if(c==1)
			{
				u.remove(u.size()-1);
				ucount.remove(ucount.size()-1);
				if(b==(u.get(0)))
				{
					ucount.set(0,(ucount.get(0)+1));
				}
				else
				{
					u.add(0,b);
					ucount.add(0,1);
				}
			}
			else if(c>1)
			{
				ucount.set((u.size()-1),(c-1));
				if(b==(u.get(0)))
				{
					ucount.set(0,(ucount.get(0)+1));
				}
				else
				{
					u.add(0,b);
					ucount.add(0,1);
				}
			}
			if(((b==1  && c==large) || (b==1 && e==1 && f==large)) || large==0)
			count2=1;
		}
		else if(count2==1 && m[i]=='?')
		{
			large=0;
			for(j=0;j<u.size();j++)
			{
				b=u.get(j);
				c=ucount.get(j);
				if(b==1)
				{
					if(c>large)
						large=c;
				}
				if(large>=K)
					break;
				
			}
			if(large>=K)
				sb=sb.append(K+"\n");
			else
				sb=sb.append(large+"\n");
			count2=0;
		}
		else if(count2==0 && m[i]=='?')
		{
			if(large>=K)
				sb=sb.append(K+"\n");
			else
				sb=sb.append(large+"\n");
		}
	}
	}
	bf.write(sb.toString());
	bf.close();
}
}