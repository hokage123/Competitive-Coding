import java.util.*;
import java.io.*;
class GameofORs
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
	public static void main(String[] s)
	{
		FastReader sc=new FastReader();
		int T,N,i,j,k;
		long A[],sum;
		T=sc.nextInt();
		long pow[]=new long[31];
		for(i=0;i<31;i++)
		{
			if(i==0)
			{
				pow[i]=1;
			}
			else
			{
				pow[i]=(2*pow[i-1]);
			}		
		}		
		for(i=0;i<T;i++)
		{
			int count[]=new int[31];
			HashMap<Long,Integer> hm=new HashMap<>();
			sum=0;
			long sum1=0;
			N=sc.nextInt();
			A=new long[N];
			for(j=0;j<N;j++)
			{
				
				A[j]=sc.nextLong();
				hm.put(A[j],(j+1));
				for(k=0;k<31;k++)
				{
					if((A[j] & pow[k])>=1)
						count[k]++;
						
				}
				sum|=A[j];	
			}
			sum1+=sum;
			
			Arrays.sort(A);
			for(j=0;j<N;j++)
			{
				for(k=0;k<31;k++)
				{
					if((A[j] & pow[k])>=1)
					{
						count[k]--;
						if(count[k]==0)
							sum-=pow[k];
					}	
				}
				sum1+=sum;
			}
			System.out.println(sum);
			for(j=0;j<N;j++)
				System.out.print(hm.get(A[j]).toString()+" ");
			System.out.println(sum1);
		}
	}
}