import java.io.*;
import java.util.*;
class TelephoneNumber
{
	public static void main(String[] d)
	{
		int t,i,l,j,N;
		String s;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(i=0;i<t;i++)
		{
			l=-1;
			N=sc.nextInt();
			s=sc.next();
			char ch[]=s.toCharArray();
			for(j=0;j<N;j++)
			{
				if(ch[j]=='8')
				{
					l=j;
					break;
				}
			}
			if(l==-1)
			{
				System.out.println("NO");
			}
			else
			{
				if((N-l)>=11)
					System.out.println("YES");
				else
					System.out.println("NO");
			}
		}
	}	
}