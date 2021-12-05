import java.util.*;
import java.io.*;
class PrimeMinister
{
	public static void main(String[] f)
	{
		int N;
		ArrayList<Integer> ar=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int A[];
		int sum=0,i,sum1=0;
		N=sc.nextInt();
		A=new int[N];
		for(i=0;i<N;i++)
		{
			A[i]=sc.nextInt();
			sum+=A[i];
		}
		for(i=0;i<N;i++)
		{
			
			if(sum1>(sum/2))
				break;
			else
			{
				if(i==0)
				{
					sum1+=A[i];	
				ar.add((i+1));
				}
				else if((2*A[i])=<A[0])
				{
					sum1+=A[i];
					ar.add((i+1));
				}
			}
		}
		if(sum1>(sum/2))
		{
			System.out.println(ar.size());
			for(i=0;i<ar.size();i++)
			{
				System.out.print(ar.get(i).toString()+" ");
			}
		}
		else
			System.out.println("0");
	}
}