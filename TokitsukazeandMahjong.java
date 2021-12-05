import java.util.*;
import java.io.*;
class TokitsukazeandMahjong
{
	public static void main(String[] d)
	{
		int ans=2;
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		String s3=sc.next();
		int a1=(s1.charAt(0)-'0');
		int a2=(s2.charAt(0)-'0');
		int a3=(s3.charAt(0)-'0');
		char b1=s1.charAt(1);
		char b2=s2.charAt(1);
		char b3=s3.charAt(1);
		int b[]=new int[3];
		b[0]=a1;
		b[1]=a2;
		b[2]=a3;
		Arrays.sort(b);
		if(b1==b2 && b2==b3)
		{
			if(a1==a2 && a2==a3)
			{	
			ans=0;
			}
			else if(a1==a2 || a2==a3 || a1==a3)
			{	
				ans=1;
			}
			else if(b[1]==(b[0]+1) && b[2]==(b[1]+1))
			{	
			ans=0;
			}
			else
			{
				if(b[2]==(b[1]+1) || b[1]==(b[0]+1) || b[1]==(b[0]+2) || b[1]==(b[0]+1))
				ans=1;
			}
		}
		else
		{
			if(b1==b2)
			{
				if(a1==a2)
				ans=1;
			if(a1>a2)
			{
				if(a1==(a2+1) || a1==(a2+2))
					ans=1;
			}
			else
			{
				if(a2==(a1+1) || a2==(a1+2))
					ans=1;
			}
			}
			if(b2==b3)
			{
				if(a2==a3)
				ans=1;
			if(a2>a3)
			{
				if(a2==(a3+1) || a2==(a3+2))
					ans=1;
			}
			else
			{
				if(a3==(a2+1) || a3==(a2+2))
					ans=1;
			}
			}
			if(b1==b3)
			{
				if(a1==a3)
				ans=1;
			if(a1>a3)
			{
				if(a1==(a3+1) || a1==(a3+2))
					ans=1;
			}
			else
			{
				if(a3==(a1+1) || a3==(a1+2))
					ans=1;
			}
			}
			
		}
		System.out.println(ans);
	}
}