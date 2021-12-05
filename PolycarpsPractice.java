import java.util.*;
import java.io.*;
class PolycarpsPractice
{
	public static void main(String[] s)
	{
		int n,k,a[],b[],i,sum=0,inti=0,count=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		ArrayList<Integer> ar=new ArrayList<>();
		a=new int[n];
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		b=Arrays.copyOf(a,n);
		Arrays.sort(b);
		for(i=0;i<n;i++)
		{
			if(i>=(n-k))
			{
				ar.add(b[i]);
				sum+=b[i];
			}
		}
		System.out.println(sum);
		for(i=0;i<n;i++)
		{
			if(ar.contains(a[i]))
			{
				if(count<(k-1))
				{	
				System.out.print(((i-inti)+1)+" ");
				count++;
				inti=(i+1);
				}
				else
				{
				System.out.print((n-inti)+" ");
				count++;	
				break;
				}
				ar.remove(ar.indexOf(a[i]));
			}
		}
	}
}