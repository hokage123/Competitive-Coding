import java.util.*;
import java.io.*;
class TheBits
{
	public static void main(String[] d)
	{
		Scanner sc=new Scanner(System.in);
		long count0=0,count1=0,count2=0,count3=0;
		int i,n;
		n=sc.nextInt();
		String s=sc.next();
		String s1=sc.next();
		char ch[]=s.toCharArray();
		char ch1[]=s1.toCharArray();
		for(i=0;i<n;i++)
		{
			if(ch[i]=='0')
				count0++;
			if(ch[i]=='0' && ch1[i]=='0')
				count2++;
			if(ch[i]=='1')
				count1++;
			if(ch[i]=='1' && ch1[i]=='0')
				count3++;
		}
		long count=((count1*count2)+(count0*count3)-(count2*count3));
		System.out.println(count);
	}
}