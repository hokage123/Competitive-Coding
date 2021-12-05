import java.util.*;
import java.io.*;
class GoodolNumbersColoring
{
	public static void main(String[] g)
	{
		int a,b,t,min,max,i;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(i=0;i<t;i++)
		{
			a=sc.nextInt();
			b=sc.nextInt();
			min=Integer.min(a,b);
			max=Integer.max(a,b);
			if(gcd(min,max)==1)
				System.out.println("Finite");
			else
				System.out.println("Infinite");
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