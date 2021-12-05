import java.util.*;
import java.io.*;
class PilesWithStones
{
	public static void main(String[] s)
	{
		int N,a[],b[],i,sum=0,sum1=0;
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		a=new int[N];
		b=new int[N];
		for(i=0;i<N;i++)
		{
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		for(i=0;i<N;i++)
		{
			b[i]=sc.nextInt();
			sum1+=b[i];
		}
		if(sum>=sum1)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}