import java.io.*;
import java.util.*;
class StringsEqualization
{
	public static void main(String[] s)
	{
		int q,i,count1[],count2[],j;
		Scanner sc=new Scanner(System.in);
		String s1,s2;
		q=sc.nextInt();
		for(i=0;i<q;i++)
		{
			int count=0;
			s1=sc.next();
			s2=sc.next();
			char ch1[]=s1.toCharArray();
			char ch2[]=s2.toCharArray();
			count1=new int[26];
			count2=new int[26];
			for(j=0;j<ch1.length;j++)
				count1[ch1[j]-'a']++;
			for(j=0;j<ch2.length;j++)
				count2[ch2[j]-'a']++;
			for(j=0;j<26;j++)
			{
				if(count1[j]>0 && count2[j]>0)
				{
					count=1;
				}
			}
			if(count==1)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}