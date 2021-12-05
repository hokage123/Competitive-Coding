import java.io.*;
import java.util.*;
class BinaryStringConstructing
{
	public static void main(String[] o)
	{
		int a,b,x,i;
		String s,s1="",s2="",ans;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		x=sc.nextInt();
		if(a>b)
		{
			s="01";
			a--;
			b--;
			x--;
			for(i=0;i<x;i++)
			{
				if(i%2==0)
				{
					s+="0";
					a--;
				}
				else
				{
					s+="1";
					b--;
				}
			}
			
		}
		else
		{
			s="10";
			a--;
			b--;
			x--;
			for(i=0;i<x;i++)
			{
				if(i%2==0)
				{
					s+="1";
					b--;
				}
				else
				{
					s+="0";
					a--;
				}
			}
		}
		for(i=0;i<a;i++)
		{
			s1+="0";
		}
		for(i=0;i<b;i++)
		{
			s2+="1";
		}
		if(s.charAt(0)=='1')
		{
			ans=(s2+"1"+s1+s.substring(1));
		}
		else
		{
			ans=(s1+"0"+s2+s.substring(1));
		}
		System.out.println(ans);
	}
}