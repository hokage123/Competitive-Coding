import java.io.*;
import java.util.*;
class Fingerprints
{
	public static void main(String[] h)
	{
		int i;
		ArrayList<Integer> ar=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int d[]=new int[10];
		for(i=0;i<n;i++)
			ar.add(sc.nextInt());
		for(i=0;i<m;i++)
			d[sc.nextInt()]++;
		for(i=0;i<10;i++)
		{
		if(d[i]==0)
		{
			if(ar.contains(i))
				ar.remove(ar.indexOf(i));
		}
		}
		for(int j:ar)
			System.out.print(j+" ");
	}
}