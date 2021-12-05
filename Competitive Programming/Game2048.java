import java.util.*;
import java.io.*;
class Game2048
{
	public static void main(String[] s)
	{
		int a[],N,T,i,j;
		Scanner sc=new Scanner(System.in);
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			N=sc.nextInt();
			a=new int[12];
			for(j=0;j<N;j++)
			{
				int b=sc.nextInt();
				b=(int)(Math.log(b)/Math.log(2));
				if(b>11)
				{}
				else
					a[b]++;
			}
			for(j=0;j<11;j++)
			{
				if(a[j]>=2)
				{
					a[j+1]+=(a[j]/2);
				}
			}
			if(a[11]>=1)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}