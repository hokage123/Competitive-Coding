import java.util.*;
import java.io.*;
class CrucialEquation
{
	public static void main(String[] f)
	{
		Scanner sc=new Scanner(System.in);
		int T,i;
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			int a,b,c;
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			int h=gcd(a,b);
			if(c%h==0)
				System.out.println("Case "+(i+1)+": Yes");
			else
				System.out.println("Case "+(i+1)+": No");
		}
	}
	public static int gcd(int a,int b)
	{
		if(b==0)
			return a;
		else
			return gcd(b,(a%b));
	}
}