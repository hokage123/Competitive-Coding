import java.util.*;
import java.io.*;
class Threedisplays
{
	public static void main(String[] s)
	{
		int N,a[],cost[],i,j,k;
		ArrayList<Integer> ar=new ArrayList<>(); 
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		a=new int[N];
		cost=new int[N];
		for(i=0;i<N;i++)
			a[i]=sc.nextInt();
		for(i=0;i<N;i++)
			cost[i]=sc.nextInt();
		
		for(i=0;i<N;i++)
			for(j=(i+1);j<N;j++)
				for(k=(j+1);k<N;k++)
					{
						if((a[i]<a[j]) && (a[j]<a[k]))
							ar.add((cost[i]+cost[j]+cost[k]));
					}
		if(ar.size()==0)
				System.out.println("-1");
		else
				System.out.println(Collections.min(ar).toString());
	}
}