import java.io.*;
import java.util.*;
class Makeatriangle
{
	public static void main(String[] s)
	{
		int a,b,c,sum=0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if((a+b)<=c)
		{
			sum+=(c-(a+b)+1);
		}
		else if((a+c)<=b)
		{
			sum+=(b-(a+c)+1);
		}
		else if((b+c)<=a)
		{
			sum+=(a-(b+c)+1);
		}
		System.out.println(sum);
	}
}