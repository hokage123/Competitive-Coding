import java.util.*;
import java.io.*;
class ShashlikCooking
{
	public static void main(String[] v)
	{
		int n,k,div,rem,i,count=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		div=((n-1)/((2*k)+1));
		rem=((n-1)%((2*k)+1));
		if(rem>k)
		{
			
			System.out.println((div+1));
			for(i=(k+1);i<=n;i+=((2*k)+1))
			{
				count=i;
				System.out.print(i+" ");
			}
		}
		else
		{
			System.out.println((div+1));
			for(i=1;i<=n;i+=((2*k)+1))
				System.out.print(i+" ");
		}
	}
}	