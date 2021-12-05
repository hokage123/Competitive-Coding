import java.util.*;
import java.io.*;
class PerfectTeam
{
	public static void main(String[] f)
	{
		int m,c,s,q,min,sum,i;
		Scanner sc=new Scanner(System.in);
		q=sc.nextInt();
		for(i=0;i<q;i++)
		{
			m=sc.nextInt();
			c=sc.nextInt();
			s=sc.nextInt();
			sum=(m+c+s);
			sum/=3;
			min=sum;
			if(m>c)
			{
				if(c<=sum)
					min=c;
			}
			else
			{
				if(m<=sum)
					min=m;
			}
			System.out.println(min);
		}
	}
}