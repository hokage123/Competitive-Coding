import java.util.*;
import java.io.*;
class Stones
{
	public static void main(String[] s)
	{
		int t,a,b,c,d,e,f,i,sum1,sum2;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(i=0;i<t;i++)
		{
				a=sc.nextInt();
				b=sc.nextInt();
				c=sc.nextInt();
				d=a;
				e=b;
				f=c;
				int x=Integer.min((b/2),a);
				b=(b-(2*x));
				int y=Integer.min((c/2),b);
				sum1=(3*(x+y));
				x=Integer.min((f/2),e);
				e=(e-x);
				y=Integer.min((e/2),d);
				sum2=(3*(x+y));
				System.out.println(Integer.max(sum1,sum2));
		}
	}
}