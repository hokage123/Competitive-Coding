import java.io.*;
import java.util.*;
class LetterShop
{
	public static void main(String[] s)
	{
		int N,T,A[],i,j,k,ans,count;
		String S,S1;
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		S=sc.next();
		char ch[]=S.toCharArray();
		char ch1[];
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
				ans=0;
				count=0;
		A=new int[26];
		//B=new int[26];
		S1=sc.next();
		ch1=S1.toCharArray();
		
		for(j=0;j<ch1.length;j++)
		{
			A[ch1[j]-'a']++;
		}
		for(j=0;j<N;j++)
		{
			count=0;
			if(A[ch[j]-'a']>0)
			{
				A[ch[j]-'a']--;
			}
			for(k=0;k<26;k++)
			{
				if(A[k]==0)
					count++;
			}
			if(count==26)
			{
				ans=(j+1);
				break;
			}
		}
		System.out.println(ans);	
		}
	}
}