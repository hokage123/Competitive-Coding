import java.io.*;
import java.util.*;
class PalindromicTwist
{
	public static void main(String[] s)
	{
		int T,n,i,j,count;
		Scanner sc=new Scanner(System.in);
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			count=0;
			n=sc.nextInt();
			String h=sc.next();
			char ch[]=h.toCharArray();
			for(j=0;j<(n/2);j++)
			{
				int x=ch[j];
				x-=ch[n-1-j];
				x=Math.abs(x);
				if(x==0 || x==2)
				{
					count++;	
				}
				else
				{
					count=-1;
					break;
				}
				
			}
			if(count==(n/2))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}