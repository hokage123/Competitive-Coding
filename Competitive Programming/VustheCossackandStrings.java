import java.util.*;
import java.io.*;
class VustheCossackandStrings
{
	public static void main(String[] s)
	{
		long count,count1=0;
		int i,j;
		String A,B;
		char[] a,b;
		Scanner sc=new Scanner(System.in);
		A=sc.next();
		B=sc.next();
		a=A.toCharArray();
		b=B.toCharArray();
			for(j=0;j<=(a.length-b.length);j++)
			{
				count=0;
				for(i=0;i<b.length;i++)
				{
					if(b[i]!=a[i+j])
					{
					count++;	
					}
				}
				if(count%2==0)
					count1++;
			}
			System.out.println(count1);
	}
}