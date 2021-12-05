import java.io.*;
import java.util.*;
class Addition
{
	public static void main(String[] f)
	{
		int T,i,j,count=0,count1=0,count2=0;
		char[] ch,ch1;
		String A,B;
		int sum;
		Scanner sc=new Scanner(System.in);
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			int u,v;
			count=0;
			count1=0;
			count2=0;
			A=sc.next();
			B=sc.next();
			sum=binaryadd(A,B);
			
			
			System.out.println(sum);	
		}
	}
	static  int binaryadd(String A,String B)
	{
		String s="";
		int carry=0,j=0,count=0,c=1;
		while(A.length()<B.length())
			A=("0"+A);
		while(A.length()>B.length())
			B=("0"+B);
		char ch[]=A.toCharArray();
		char ch1[]=B.toCharArray();
		int n=ch.length;
		while(j<A.length())
		{
			if(ch[n-1-j]=='0' && ch1[n-1-j]=='1' && carry==0)
			{
				s=("1"+s);
				c=1;
			}
			else if(ch[n-1-j]=='0' && ch1[n-1-j]=='1' && carry==1)
			{
				s=("0"+s);
				count++;
				c=0;
			}
			else if(ch1[n-1-j]=='0' && ch[n-1-j]=='1' && carry==0)
			{
				s=("1"+s);
				c=1;
			}
			else if(ch1[n-1-j]=='0' && ch[n-1-j]=='1' && carry==1)
			{
				s=("0"+s);
				count++;
				c=0;
			}
			else if(ch1[n-1-j]=='0' && ch[n-1-j]=='0' && carry==0)
			{
				s=("0"+s);
				c=1;
			}
			else if(ch1[n-1-j]=='0' && ch[n-1-j]=='0' && carry==1)
			{
				s=("1"+s);
				carry=0;
				c=1;
				//count++;
			}
			else if(ch1[n-1-j]=='1' && ch[n-1-j]=='1' && carry==0)
			{
				s=("0"+s);
				carry=1;
				count++;
				c=0;
			}
			else if(ch1[n-1-j]=='1' && ch[n-1-j]=='1' && carry==1)
			{
				s=("1"+s);
				c=1;
			}
			j++;
		}
		if(carry==1 && c==0)
		{
			//count--;
			s="1"+s;
		}
				//if(c==1)
				count++;
		return count;
	}
}