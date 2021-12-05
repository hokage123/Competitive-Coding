/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) //throws java.lang.Exception
	{
		String s;
	int j,k,m=0,m1=0,y=0,l[],h,n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	l=new int[n];
	for( h=0;h<n;h++)
    {   

   j=sc.nextInt();
		s=Integer.toBinaryString(j);
		System.out.println(s);
		m1=0;
		k=s.length();
		j=0;
		y=0;
		for(int i=0;i<k;i++)
		{
			if(j<12)
			{
				if(s.charAt(k-i-1)=='1')
				m1+=1;
				m=m1;
			}
			else
			{
		if(s.charAt(k-i-1)=='1')
				{
				y+=Math.pow(2,i-11);
				}
			}
			j++;
		}
		if(k>=12)
		{
			if(s.charAt(k-12)=='0')
				m=m1+y;
		}
			l[h]=m;
		}
		for(h=0;h<n;h++)
			System.out.println(l[h]);
	}
	}  