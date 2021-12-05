import java.util.*;
import java.io.*;
class BalancedTunnel
{
    public static void main(String[] s)
    {
        int i,count=0,n,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n+1];
        int b[]=new int[n+1];
        int c[]=new int[n+1];
		HashSet<Integer> hs=new HashSet<>();
		HashSet<Integer> hs1=new HashSet<>();
        for(i=1;i<=n;i++)
            a[i]=sc.nextInt();
        for(i=1;i<=n;i++)
		{
            b[i]=sc.nextInt();
			if(i>1)
			hs1.add(b[i])
		}		
        for(i=1;i<=n;i++)
            {
                hs.add(a[i]);
				if(!Collections.disjoint(hs,hs1))
					count++;
				hs1.remove(b[i]);
            }
            System.out.println(count);
    }
}
