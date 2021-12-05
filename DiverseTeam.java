import java.io.*;
import java.util.*;
class DiverseTeam
{
	public static void main(String[] s)
	{
		Scanner sc=new Scanner(System.in);
		int N,K,i,a;
		N=sc.nextInt();
		K=sc.nextInt();
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(i=0;i<N;i++)
		{
			a=sc.nextInt();
			if(!(hm.containsKey(a)))
			{
				hm.put(a,(i+1));
			}
		}
		i=0;
		if(hm.size()>=K)
		{
			System.out.println("YES");	
		for(Map.Entry<Integer,Integer> e:hm.entrySet())
		{
			System.out.print(e.getValue().toString()+" ");
			i++;
			if(i==K)
				break;
		}
		}
		else
		{
			System.out.println("NO");
		}	
	}
}