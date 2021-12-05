import java.util.*;
import java.io.*;
class Equality
{
	public static void main(String[] g)
	{
		int n,i,k,min=0,count=0;
		char ch[];
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		ch=sc.next().toCharArray();
		int alpa[]=new int[26];
		for(i=0;i<n;i++)
			alpa[ch[i]-'A']++;
		Arrays.sort(alpa);
		for(i=0;i<26;i++)
		{
			if(alpa[i]>0)
				count++;
		}
		if(count==k)
		{	
			for(i=0;i<26;i++)
			{
				if(min==0 && alpa[i]>0)
					min=alpa[i];
				if(min>alpa[i] && alpa[i]>0)
					min=(alpa[i]);
			}
		}
		System.out.println((min*k));
	}
}