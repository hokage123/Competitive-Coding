import java.util.*;
import java.io.*;
class Heating
{
	public static void main(String[] f)
	{
		int n,sum,c,d,e,i,sq;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			c=sc.nextInt();
			sum=sc.nextInt();
			d=(sum/c);
			e=(sum%c);
			sq=((e*((d+1)*(d+1)))+((c-e)*d*d));
			System.out.println(sq);
		}
	}
}