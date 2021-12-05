import java.io.*;
import java.util.*;
class FrogJumping
{
	public static void main(String[] f)
	{
		int t,i;
		long a,b,k;
		long sum;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(i=0;i<t;i++)
		{
			a=sc.nextLong();
			b=sc.nextLong();
			k=sc.nextLong();
			if(k%2==0)
				sum=((k/2)*(a-b));
			else
				sum=(((k/2)*(a-b))+a);
			System.out.println(sum);
		}
	}
}