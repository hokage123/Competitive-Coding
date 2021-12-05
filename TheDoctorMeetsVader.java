import java.util.*;
import java.io.*;
class TheDoctorMeetsVader
{
	public static void main(String[] o)
	{
		int N,M,A[],i,j,d[],g;
		long mycost=0;
		HashMap<Integer,Long> cost;
		ArrayList<Integer> ar;
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		A=new int[N];
		d=new int[M];
		for(i=0;i<N;i++)
		{
			A[i]=sc.nextInt();
		}
		cost=new HashMap<Integer,Long>();
		for(i=0;i<M;i++)
		{
			d[i]=sc.nextInt();
			g[i]=sc.nextInt();
			
			if(cost.containsKey(d[i]))
			{
				cost.put(d[i],(cost.get(d[i])+(long)g));
			}
			else
				cost.put(d[i],(long)g);
		}
		ar=Collections.sort(new ArrayList(cost.keySet()));
		for(i=1;i<ar.size();i++)
		{
			hm.put(cost.get(i),(hm.get(cost.get(i))+hm.get(cost.get(i-1))));
		}
		//Arrays.sort(d);
		for(i=0;i<N;i++)
		{		
			System.out.print(+" ");
		}
	}
}