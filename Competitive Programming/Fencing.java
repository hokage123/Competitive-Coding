import java.util.*;
import java.io.*;
class Fencing
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
	public static void main(String[] s)//throws IOException
	{
		int T,N,M,K,i,j,sum;
		int[] a,b;
		HashSet<String> hs;
		Scanner sc=new Scanner(System.in);
		BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		T=sc.nextInt();
		int ans[]=new int[T];
		for(i=0;i<T;i++)
		{
			sum=0;
			N=sc.nextInt();
			M=sc.nextInt();
			K=sc.nextInt();
			a=new int[K];
			b=new int[K];
			hs=new HashSet<>();
			for(j=0;j<K;j++)
			{
				a[j]=sc.nextInt();
				b[j]=sc.nextInt();
				hs.add((a[j])+":"+(b[j]));
			}
			for(j=0;j<K;j++)
			{
				
				
					if(!(hs.contains((a[j]-1)+":"+b[j])))
						sum+=1;
					if(!(hs.contains((a[j]+":"+(b[j]-1)))))
						sum+=1;
					if(!(hs.contains((a[j]+":"+(b[j]+1)))))
						sum+=1;
					if(!(hs.contains(((a[j]+1)+":"+b[j]))))
						sum+=1;
			}
			ans[i]=sum;
			//sb=sb.append(sum+"\n");
		}
		for(i=0;i<T;i++)
		{
		    System.out.println(ans[i]);
		}
		//bf.write(sb.toString());
		//bf.close();
	}
}