import java.util.*;
import java.io.*;
class Dilemma
{
	public static void main(String[] o)
	{
		Scanner sc=new Scanner(System.in);
		int i,j,T,count;
		char ch[];
		String s;
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			count=0;
			s=sc.next();
			ch=s.toCharArray();
			for(j=0;j<ch.length;j++)
			{
				if(ch[j]=='1')
				{
					count++;
				}
			}
			if(count%2==1)
				System.out.println("WIN");
			else
				System.out.println("LOSE");
	}
}
}