import java.io.*;
import java.util.*;
class ChooseTwoNumbers
{
	public static void main(String[] g)
	{
		int n,a,b,j,k,count=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		HashSet<Integer> hs=new HashSet<>();
		ArrayList<Integer> ar=new ArrayList<>();
		ArrayList<Integer> ar1=new ArrayList<>();
		for(j=0;j<n;j++)
		{
			a=sc.nextInt();
			ar.add(a);
			if(!hs.contains(a))
			{
				hs.add(a);
			}
		}
		int m=sc.nextInt();
		for(j=0;j<m;j++)
		{
			a=sc.nextInt();
			ar1.add(a);
			if(!hs.contains(a))
			{
				hs.add(a);
			}
		}
		for(j=0;j<n;j++)
		{
			for(k=0;k<m;k++)
			{
				a=ar.get(j);
				b=ar1.get(k);
				if(!hs.contains((a+b)))
				{
					System.out.println(a+" "+b);
					count=1;
				}
				if(count==1)
				break;
			}
			if(count==1)
				break;
		}
	}
}