import java.io.*;
import java.util.*;
class CodehorsesTshirts
{
	public static void main(String[] s)
	{
		Scanner sc=new Scanner(System.in);
		int n,i;
		n=sc.nextInt();
		ArrayList<String> hs=new ArrayList<>();
		ArrayList<String> hs1=new ArrayList<>();
		for(i=0;i<n;i++)
		{
			hs.add(sc.next());
		}
		for(i=0;i<n;i++)
		{
			hs1.add(sc.next());
		}
		for(String u:hs)
		{
			if(hs1.contains(u))
			{
				hs1.remove(hs1.indexOf(u));
			}
		}
		System.out.println(hs1.size());
	}
}