import java.util.*;
import java.io.*;
public class NickAndArray
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
	public static void main(String[] args)throws IOException
	{
		int i,j=1,N,A[],count0=0,count1=0,count2=0,count3=0,m=0;
		HashMap<Integer,Integer> hm=new HashMap<>();
		FastReader sc=new FastReader();
		BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		N=sc.nextInt();
		A=new int[N];
		for(i=0;i<N;i++)
			A[i]=sc.nextInt();
		int[] B=Arrays.copyOf(A,N);
		Arrays.sort(A);
		if(A[0]==-1 && A[N-1]==0 && N%2!=0)
		{}
	else
	{
		for(i=0;i<N;i++)
		{
			if(A[i]==0)
			{
				A[i]=-1;
				count0++;
			}
			if(A[i]>0)
			{
				count1++;
			}
			if(A[i]<0)
				count3++;
				
		}
	}
		if((count1+count0+count3)%2==0)
			count2=count1;
		else
			count2=(count1-1);
		if(count1==0 && (count0+count3)%2!=0)
		{
			A[0]=(-A[0]-1);
			for(i=0;i<N;i++)
			{
				if(hm.containsKey(A[i]))
			{
				hm.put(A[i],(hm.get(A[i])+1));
			}
			else
				hm.put(A[i],1);	
			}
		}
		else if(count1==0 && (count0+count3)%2==0)
		{
			for(i=0;i<N;i++)
			{
				if(hm.containsKey(A[i]))
			{
				hm.put(A[i],(hm.get(A[i])+1));
			}
			else
				hm.put(A[i],1);
			}
		}
		else{
				for(i=(N-1);i>=0;i--)
		{
			if(j<=count2)
			{
				A[i]=-(A[i]+1);
				j++;
			}
			if(hm.containsKey(A[i]))
			{
				hm.put(A[i],(hm.get(A[i])+1));
			}
			else
				hm.put(A[i],1);
		}
		}
		
		if(count0%2!=0 && count1==0 && count3==0)
		{
			for(i=0;i<N;i++)
				sb=sb.append(0+" ");
		}
		else
		{
		for(i=0;i<N;i++)
		{
			if(hm.containsKey(B[i]))
			{
				if(hm.get(B[i])>1)
				{
					hm.put(B[i],(hm.get(B[i])-1));
				}
				else
				{
					hm.remove(B[i]);
				}
			sb=sb.append(B[i]+" ");
			}
			else
			{
				sb=sb.append((-B[i]-1)+" ");
				if(hm.get(-B[i]-1)>1)
				{
					hm.put((-B[i]-1),(hm.get((-B[i]-1))-1));
				}
				else
				{
					hm.remove((-B[i]-1));
				}
			}
		}
		}
		sb=sb.append("\n");
		bf.write(sb.toString());
		bf.close();
	}
}