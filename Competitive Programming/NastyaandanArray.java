import java.io.*;
import java.util.*;
class NastyaandanArray
{
	public static void main(String[] s)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),i,a,sum1=0,sum2=0;
		HashSet<Integer> hs=new HashSet<>();
		ArrayList<Integer> ar=new ArrayList<>();
		ArrayList<Integer> ar1=new ArrayList<>();
		for(i=0;i<n;i++)
		{
			a=sc.nextInt();
			if((!hs.contains(a)) && a!=0)
			{
				hs.add(a);
				if(a>0)
				ar.add(a);
				else
				ar1.add(a);	
			}
		}
		Collections.sort(ar);
		Collections.sort(ar1);
		for(i=0;i<ar.size();i++)
		{
			a=ar.get(i);
			if(i!=0)
			{
				if(hs.contains(sum1))
				{
					hs.remove(sum1);
				}
			}
			sum1+=a;
		}
		for(i=(ar1.size()-1);i>=0;i--)
		{
			a=ar.get(i);
			if(i!=0)
			{
				if(hs.contains(sum2))
				{
					hs.remove(sum2);
				
				}
			}
			sum2+=a;
		}
			System.out.println(hs.size());
	}
}