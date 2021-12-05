import java.io.*;
import java.util.*;
class SerejaandSuffixes
{
	public static void main(String[] g)
	{
		int i,a[],dp[],n,m;
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,Integer> hm=new HashMap<>();
		n=sc.nextInt();
		m=sc.nextInt();
		a=new int[n];
		dp=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(hm.containsKey(a[i]))
				hm.put(a[i],(hm.get(a[i])+1));
			else
				hm.put(a[i],1);
		}
		dp[0]=(hm.size());
		if(hm.get(a[0])>1)
				hm.put(a[0],(hm.get(a[0])-1));
		else
				hm.remove(a[0]);
		for(i=1;i<n;i++)
		{
			if(hm.containsKey(a[i-1]))
				dp[i]=dp[i-1];
			else
				dp[i]=(dp[i-1]-1);
			if(hm.get(a[i])>1)
				hm.put(a[i],(hm.get(a[i])-1));
			else
				hm.remove(a[i]);
		}
		for(i=1;i<=m;i++)
			System.out.println(dp[sc.nextInt()-1]);
	}
}