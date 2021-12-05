import java.util.*;
import java.io.*;
class BracketSubsequence
{
	public static void main(String[] d)
	{
		int i,n,k,lastindi=0,firstindi=-1;
		int count1=0,count2=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		String g=sc.next();
		char ch[]=g.toCharArray();
		for(i=0;i<ch.length;i++)
		{
			if(ch[i]=='(')
			{
				count1++;
				count2++;
			}
			else
			{
				count1--;
				count2++;
			}
			if(count1<0)
			{
				count1=0;
				count2=0;
			}
			else if(count1==0)
			{	
				if((count2-lastindi+1)==k)
				{
					lastindi=i;
					break;
				}
				lastindi=i;
			}
		}
		firstindi=(lastindi-k+1);
		for(i=firstindi;i<=lastindi;i++)
			System.out.print(ch[i]);
	}
}