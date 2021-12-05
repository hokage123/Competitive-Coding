import java.util.*;
import java.io.*;
class GivenLengthandSumofDigits
{
	public static void main(String[] d)
	{
		int m,s,i=1;
		String num,num1;
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		s=sc.nextInt();
		if(m==1 && s==0)
			System.out.println("0 0");
		else if(s==0 || m==0 || s>(m*9))
			System.out.println("-1 -1");
		else
		{
			num="1";
			while(i<m)
			{
				num+="0";
				i++;
			}
			num1=new String(num);
		s--;
		char[] smallnum=num.toCharArray();
		char[] largenum=num1.toCharArray();
		int s1=s;
		for(i=0;i<m;i++)
		{
			while(smallnum[i]<'9' && s>0)
			{
				smallnum[i]++;
				s--;
			}
		}
		for(i=(m-1);i>=0;i--)
		{
			while(largenum[i]<'9' && s1>0)
			{
				largenum[i]++;
				s1--;
			}
		}
		num=new String(smallnum);
		num1=new String(largenum);
		System.out.println(num1+" "+num);
		}
	}
}