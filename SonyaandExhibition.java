import java.util.*;
import java.io.*;
class SonyaandExhibition
{
	public static void main(String[] o)
	{
		int n,m,i,x,y,min=0,max=0;
		String s="";
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		for(i=0;i<n;i++)
		{
			x=sc.nextInt();
			y=sc.nextInt();
			if(i==0)
			{
				min=x;
				max=y;
			}
			if(x<min)
			{
				min=x;
			}
			if(y>max)
			{
				max=y;
			}
		}
		for(i=0;i<n;i++)
		{
			if(i<(x-1))
			{
				s+="1";
			}
			else if(i>(y-1))
			{
				s+="0";
			}
			else
			{
				if(((i-(x-1))%2)==0)
					s+="1";
				else
					s+="0";
			}
			
		}
		System.out.println(s);
	}
	
}