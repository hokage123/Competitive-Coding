import java.io.*;
import java.util.*;
class VasyaandCornfield
{
	public static void main(String[] t)
	{
		int m,n,d,i,x,y,c1,c2,c3,c4;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		d=sc.nextInt();
		m=sc.nextInt();
		for(i=0;i<m;i++)
		{
			x=sc.nextInt();
			y=sc.nextInt();
			c1=(x-y+d);
			c2=(x+y+d-(2*n));
			c3=(x+y-d);
			c4=(x-y-d);
			if(c1>=0 && c2<=0 && c3>=0 && c4<=0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}