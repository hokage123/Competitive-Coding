import java.io.*;
import java.util.*;
class PersonalizedCup
{
	public static void main(String[] f)
	{
		int n,i,m=1;
		String h;
		Scanner sc=new Scanner(System.in);
		h=sc.next();
		n=h.length();
		while((n/m)>20)
		{
			m++;
		}
		char ch[]=h.toCharArray();
		int r=m;
		int c=(n/m);
		int nostars=(n%r);
		if(nostars>0)
			System.out.println(r+" "+(c+1));
		else
			System.out.println(r+" "+c);
		int u=nostars;
		if(nostars>0)
		{	
		for(i=0;i<n;i++)
		{
			if((i+1)%(c+1)==0 && nostars>0)
			{
				System.out.print(ch[i]);
				System.out.println();
				nostars--;
			}
			else if((i+1-(u*(c+1)))%c==0 && nostars==0)
			{
				System.out.print(ch[i]);
				System.out.print("*");
				System.out.println();
			}
			else
				System.out.print(ch[i]);	
		}
		}
		else
		{
			for(i=0;i<n;i++)
			{
			if((i+1)%c==0)
			{
				System.out.print(ch[i]);
				System.out.println();
				//nostar--;
			}
			else
				System.out.print(ch[i]);	
			}
		}	
	}
}