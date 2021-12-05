import java.io.*;
import java.util.*;
class QAQ
{
	public static void main(String[] s)
	{
		int sum=0;
		int left[],right[],i;
		char ch[];
		Scanner sc=new Scanner(System.in);
		ch=sc.next().toCharArray();
		left=new int[ch.length];
		right=new int[ch.length];
		for(i=0;i<ch.length;i++)
		{
			if(i==0)
			{
				if(ch[i]=='Q')
					left[i]=1;
				else
					left[i]=0;
			}
			else if(ch[i]=='Q')
				left[i]=(left[i-1]+1);
			else
				left[i]=left[i-1];
		}
		for(i=(ch.length-1);i>=0;i--)
		{
			if(i==(ch.length-1))
			{
				if(ch[i]=='Q')
					right[i]=1;
				else
					right[i]=0;
			}
			else if(ch[i]=='Q')
				right[i]=(right[i+1]+1);
			else
				right[i]=right[i+1];
		}
		for(i=1;i<(ch.length-1);i++)
			if(ch[i]=='A')
				sum+=(right[i+1]*left[i-1]);
		System.out.println(sum);
	}
}