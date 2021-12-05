import java.util.*;
import java.io.*;
class ConverttoOnes
{
	public static void main(String[] g)
	{
		int n,x,y,i,count0=0,count1=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		x=sc.nextInt();
		y=sc.nextInt();
		String s=sc.next();
		char ch[]=s.toCharArray();
		char x1='2';
		for(i=0;i<ch.length;i++)
		{
			if(i==0)
			{
				if(ch[i]=='1')
					count1++;
				else
					count0++;
			}
			else
			{
				if(ch[i]!=x1)
				{
					if(ch[i]=='1')
					count1++;
					else
					count0++;
				}
			}
			x1=ch[i];
		}	
		if(count0!=0)
		{	
		if(count0<count1)
		{
			if(x<y)
			{
				System.out.println(((count0*x)+y));
			}
			else
			{
				System.out.println((count0*y));
			}	
		}
		else
		{
			if(x<y)
			{
				
				System.out.println(((count1*x)+y));
			}
			else
			{
				if(((count1*x)+y)<(count0*y))
					System.out.println(((count1*x)+y));
				else
					System.out.println((count0*y));
			}
		}
		}
		else
			System.out.println("0");
		
	}
}