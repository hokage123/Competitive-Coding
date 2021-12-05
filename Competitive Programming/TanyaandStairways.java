import java.util.*;
import java.io.*;
class TanyaandStairways
{
	public static void main(String[] f)
	{
		int N,i,a[];
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		a=new int[N];
		ArrayList<Integer> ar=new ArrayList<>();
		for(i=0;i<N;i++)
			a[i]=sc.nextInt();
		for(i=0;i<N;i++)
		{
			if(i==(N-1))
			{
				ar.add(a[i]);
			}
			else
			{
				if(a[i+1]==1)
					ar.add(a[i]);
			}
		}
		System.out.println(ar.size());
		for(int j:ar)
			System.out.print(j+" ");
	}
}