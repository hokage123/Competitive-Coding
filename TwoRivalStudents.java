import java.util.*;
import java.io.*;
class TwoRivalStudents
{
	public static void main(String[] o)
	{
		int i,t,n,x,a,b,a1,b1;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(i=0;i<t;i++)
		{
			n=sc.nextInt();
			x=sc.nextInt();
			a=sc.nextInt();
			b=sc.nextInt();
			a1=Integer.min(a,b);
			b1=Integer.max(a,b);
			if((b1-a1+x)<=(n-1))
				System.out.println((b1-a1+x));
			else
				System.out.println((n-1));
		}
	}
}