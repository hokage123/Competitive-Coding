import java.util.*;
import java.io.*;
class TwoGroups
{
	public static void main(String[] s)
	{
		int q,A,B,i,j,C,sum;
		Scanner sc=new Scanner(System.in);
		q=sc.nextInt();
		for(i=0;i<q;i++)
		{
			A=sc.nextInt();
			B=sc.nextInt();
			C=sc.nextInt();
			sum=(A+(B*2)+(C*3));
			if(sum%2==0)
			{
				if(A>0 && B>0)
					System.out.println("YES");
				else if(B%2==0)
				{
					if(C%2==0)
						System.out.println("YES");
					else
						System.out.println("NO");
				}
				else
					System.out.println("NO");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}
}