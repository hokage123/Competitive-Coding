import java.io.*;
import java.util.*;
class VasyaandChocolate
{
	public static void main(String[] o)
	{
		int t,i;
		int s,a,b,c;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(i=0;i<t;i++)
		{
			s=sc.nextInt();
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			long b1=(s/c);
			long b2=(b1/a);
			System.out.println((b1+(b2*b)));
		}
	}
}