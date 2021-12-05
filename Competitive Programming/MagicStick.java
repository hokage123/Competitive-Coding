import java.util.*;
import java.io.*;
class MagicStick
{
	public static void main(String[] o)
	{
		int x,y,t,i;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(i=0;i<t;i++)
		{
			x=sc.nextInt();
			y=sc.nextInt();
			if(x==1)
			{
				if(y==1)
					System.out.println("YES");
				else
					System.out.println("NO");
			}
			else if(x==2 || x==3)
			{
				if(y==1 || y==2 || y==3)
					System.out.println("YES");
				else
					System.out.println("NO");
			}
			else
				System.out.println("YES");
		}
	}
}