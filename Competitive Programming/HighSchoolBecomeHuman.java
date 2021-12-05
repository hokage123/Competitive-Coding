import java.util.*;
import java.io.*;
import java.math.*;
class HighSchoolBecomeHuman
{
	public static void main(String[] s)
	{
		int x,y;
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		if((x==2 && y==3) || (y==2 && x==3))
		{
			
			if(x==y)
			System.out.println("=");
			if(x<y)
			System.out.println("<");
			if(y<x)
			System.out.println(">");
		}
		else if(x>1 && y>1)
		{
			if(x!=2 && y!=2)
			{	
			if(x==y)
			System.out.println("=");
			if(x>y)
			System.out.println("<");
			if(y>x)
			System.out.println(">");
			}
			else
			{
				if(x==2 && y!=2)
				{
					double d=(Math.log(y)/Math.log(2));
					if(d==(int)d)
					{
						int h=(int)d;
						if((h*x)==y)
							System.out.println("=");
						else
						{
							if(x==y)
							System.out.println("=");
							if(x>y)
							System.out.println("<");
							if(y>x)
							System.out.println(">");
						}
					}
					else
					{
						if(x==y)
							System.out.println("=");
						if(x>y)
							System.out.println("<");
						if(y>x)
							System.out.println(">");
					}
				}
				if(y==2 && x!=2)
				{
					double d=(Math.log(x)/Math.log(2));
					if(d==(int)d)
					{
						int h=(int)d;
						if((h*y)==x)
							System.out.println("=");
						else
						{
							if(x==y)
							System.out.println("=");
							if(x>y)
							System.out.println("<");
							if(y>x)
							System.out.println(">");
						}
					}
					else
					{
						if(x==y)
							System.out.println("=");
						if(x>y)
							System.out.println("<");
						if(y>x)
							System.out.println(">");
					}
				}
				if(x==y)
					System.out.println("=");
			}
		}
		else
		{
			if(x==1 && y>1)
			{
			
			if(x<y)
				System.out.println("<");
			if(y<x)
				System.out.println(">");
			}
			else if(x>1 && y==1)
			{
				
			if(x<y)
				System.out.println("<");
			if(y<x)
				System.out.println(">");
			}
			else
				System.out.println("=");
		}
	}
}