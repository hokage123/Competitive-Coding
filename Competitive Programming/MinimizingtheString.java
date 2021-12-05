import java.util.*;
import java.io.*;
class MinimizingtheString
{
	public static void main(String[] g)
	{
		int count=-1,i,j=0;
		Scanner sc=new Scanner(System.in);
		int n;
		String u;
		n=sc.nextInt();
		u=sc.next();
		char ch[]=u.toCharArray();
		for(i=0;i<(n-1);i++)
		{
			if(ch[i]>ch[i+1])
			{
				count=i;
				break;
			}
		}
		if(count==-1)
			count=(n-1);
		char ch1[]=new char[n-1];
		for(i=0;i<(n-1);i++)
		{
			if(j==count && count<(n-1))
			{
				ch1[i]=ch[j+1];
				j+=2;
			}
			else
			{
				ch1[i]=ch[j];
				j++;
			}
		}
		String s=new String(ch1);
		System.out.println(s);
	}
}