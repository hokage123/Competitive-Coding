import java.io.*;
import java.util.*;
class KnightsofaPolygonalTable
{
	public static void main(String[] d)
	{
		int n,k,pow[],coins[],i,j;
		HashMap<Integer,Integer> hm=new HashMap<>();
		HashMap<Integer,Long> sum=new HashMap<>();
		ArrayList<Integer> ar=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		pow=new int[n];
		coins=new int[n];
		for(i=0;i<n;i++)
			pow[i]=sc.nextInt();
		for(i=0;i<n;i++)
		{
			coins[i]=sc.nextInt();
			hm.put(pow[i],coins[i]);
		}
		int a[]=Arrays.copyOf(pow,n);
		Arrays.sort(a);
		for(i=0;i<n;i++)
		{
			int gr=0;
			long sum1=0;
			for(j=0;j<ar.size();j++)
			{
				gr=ar.get(j);
				sum1+=gr;
			}
			gr=hm.get(a[i]);
			sum1+=gr;
			sum.put(a[i],sum1);
			if(i<k)
			{
				ar.add(hm.get(a[i]));
			}
			else
			{
				ar.add(hm.get(a[i]));
				Collections.sort(ar);
				ar.remove(0);
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.print(sum.get(pow[i]).toString()+" ");
		}
	}
}