import java.util.*;
import java.io.*;
class ParityAgain
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
		int[] r=new int[200002];
		for(int i=0;i<=200001;i++)
		{
			r[i]=Integer.bitCount(i);
		}
		int T,X,a,b,c,count1,count2,size,i,j,k;
		FastReader sc=new FastReader();
		BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		ArrayList<Integer> ar,odd,even;
		HashSet<Integer> hs;
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			ar=new ArrayList<>();
			hs=new HashSet<>();
			count1=0;
			count2=0;
			X=sc.nextInt();
			for(j=0;j<X;j++)
			{
				a=sc.nextInt();
				if(!hs.contains(a))
				{
					c=Integer.bitCount(a);
					hs.add(a);
					ar.add(a);
					if(c%2==0)
						count2++;
					else
						count1++;
				
				size=(ar.size()-1);
				for(k=0;k<size;k++)
				{
					b=a^(ar.get(k));
					c=Integer.bitCount(b);
					if(!hs.contains(b))
					{
					hs.add(b);
					ar.add(b);
					if(c%2==0)
						count2++;
					else
						count1++;
					}	
				}
				}
				sb.append(count2+" "+count1+"\n");
			}
		}
		bf.write(sb.toString());
		bf.close();
		
	}
}