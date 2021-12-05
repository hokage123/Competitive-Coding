import java.io.*;
import java.util.*;
class ThereAreTwoTypesOfBurgers
{
	public static void main(String[] d)
	{
		int t,b,p,cc,h,c,i;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(i=0;i<t;i++)
		{
			int cost=0;
			b=sc.nextInt();
			p=sc.nextInt();
			cc=sc.nextInt();
			h=sc.nextInt();
			c=sc.nextInt();
			if(h>c)
			{
				if(p<=(b/2))
				{
					cost+=(h*p);
					b-=(2*p);
					if(cc<=(b/2))
					{
						cost+=(c*cc);
					}
					else
						cost+=(c*(b/2));
				}
				else
				{
					cost+=(h*(b/2));
				}
			}
			else
			{
				if(cc<=(b/2))
				{
					cost+=(c*cc);
					b-=(2*cc);
					if(p<=(b/2))
					{
						cost+=(p*h);
					}
					else
						cost+=(h*(b/2));
				}
				else
				{
					cost+=(c*(b/2));
				}
			}
			System.out.println(cost);
		}
	}
}