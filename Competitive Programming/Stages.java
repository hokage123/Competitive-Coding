import java.util.*;
import java.io.*;
class Stages
{
	public static void main(String[] f)
	{
		int n,k,i,j,count=0,sum=0,min=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		String s=sc.next();
		char[] ch=s.toCharArray();
		int[] g=new int[26];
		for(i=0;i<n;i++)
			g[ch[i]-'a']++;
		for(i=0;i<26;i++)
		{
			count=0;
			sum=0;
			for(j=i;j<26;)
			{
				if(g[j]>=1)
				{	
					count++;
					sum+=(j+1);
				}
				if(j==i)
				{
				    j+=2;
				}
				else
				j++;
				if(count==k)
				break;
			}
			if(count==k)
			{
				if(min==0)
					min=sum;
				else if(sum<min)
					min=sum;
			}
		}
			if(min==0)
				System.out.println("-1");
			else
				System.out.println(min);
	}
}