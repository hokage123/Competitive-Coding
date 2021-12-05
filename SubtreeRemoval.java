import java.io.*;
import java.util.*;
class SubtreeRemoval
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
		int T,i,j,N;
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> ar;
		ArrayList<Integer> sum;
		ArrayList<ArrayList<Integer>> br;
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			N=sc.nextInt();
			ar=new ArrayList<>();
			br=new ArrayList<>();
			sum=new ArrayList<>();
			for(j=0;j<N;j++)
			{
				ar.add(sc.nextInt());
				br.add(new ArrayList<Integer>());
			}
			for(j=0;j<(N-1);j++)
			{
				br.get((sc.nextInt()-1)).add((sc.nextInt()-1));
			}
			for(j=0;j<N;j++)
				sum.add(sum(0,ar,br,j));
			for(j=0;j<N;j++)
				System.out.println(sum.get(j));
		}
	}
	static int sum(int sum,ArrayList<Integer> ar,ArrayList<ArrayList<Integer>> br,int j)
	{
		int i;
		sum+=ar.get(j);
		for(i=0;i<br.get(j).size();i++)
		{
			sum+=(ar.get(br.get(j).get(i))+sum(sum,ar,br,i));
		}
		return sum;
	}
}