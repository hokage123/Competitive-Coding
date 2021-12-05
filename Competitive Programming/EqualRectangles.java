import java.util.*;
import java.io.*;
class EqualRectangles
{
	public static void main(String[] g)
	{
		int T,a[],i,j,N,m,n;
		Scanner sc=new Scanner(System.in);
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			N=sc.nextInt();
			HashSet<Integer> hs=new HashSet<>();
			ArrayList<Integer> sd=new ArrayList<>();
			a=new int[(4*N)];
			for(j=0;j<(4*N);j++)
				a[j]=sc.nextInt();
			Arrays.sort(a);
			for(j=0;j<(4*N);j+=2)
			{
				if(a[j]==a[j+1])
				sd.add(a[j]);
			}
			if(sd.size()==(2*N))
			{
			for(j=0;j<N;j++)
			{
				m=sd.get(j);
				n=sd.get((2*N)-(j+1));
				hs.add((m*n));
			}
			}
			if((hs.size()==1) && (sd.size()==(2*N)))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}