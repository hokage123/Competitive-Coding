import java.util.*;
import java.io.*;
class SocialNetwork
{
	public static void main(String[] d)
	{
		int n,k,i;
		Scanner sc=new Scanner(System.in);
		HashSet<Integer> hs=new HashSet<>();
		LinkedList<Integer> ll=new LinkedList<>();
		n=sc.nextInt();
		k=sc.nextInt();
		for(i=0;i<n;i++)
		{
			int a=sc.nextInt();
			if(!hs.contains(a))
			{
				hs.add(a);
				if(ll.size()==k)
				{
					int b=ll.removeLast();
					hs.remove(b);
				}
				ll.addFirst(a);
			}
		}
			System.out.println(ll.size());
			for(int j:ll)
				System.out.print(j+" ");
	}
}