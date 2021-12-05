import java.util.*;
import java.io.*;
class EasySubsequenceSelection
{
	public static void main(String[] o)
	{
		int T,N,alpha[],diff[],min,i,j;
		String s;
		char ch[];
		Scanner sc=new Scanner(System.in);
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			min=-1;
			diff=new int[26];
			alpha=new int[26];
			N=sc.nextInt();
			s=sc.next();
			ch=s.toCharArray();
			for(j=0;j<26;j++)
			{
				alpha[j]=-1;
				diff[j]=-1;
			}
			for(j=0;j<N;j++)
			{
				if(alpha[ch[j]-'a']!=-1)
				{
					if(diff[ch[j]-'a']!=-1)
					diff[ch[j]-'a']=Integer.min((j-alpha[ch[j]-'a']),diff[ch[j]-'a']);
					else
					diff[ch[j]-'a']=(j-alpha[ch[j]-'a']);
					alpha[ch[j]-'a']=j;
				}
				else
				{
					alpha[ch[j]-'a']=j;
				}
			}
			for(j=0;j<26;j++)
			{
				if(min==-1 && diff[j]!=-1)
					min=diff[j];
				else if(min!=-1)
				{
					if(diff[j]!=-1 && diff[j]<min)
						min=diff[j];
				}
			}
			if(min!=-1)
				System.out.println((N-min));
			else
				System.out.println(0);
		}
	}
}