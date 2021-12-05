import java.io.*;
import java.util.*;
class TwoSubstrings
{
	public static void main(String[] f)
	{
		int count1=0,count2=0,i,FAB[],FBA[],FABsum=0,FBAsum=0;
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String ans="NO";
		char ch[]=s.toCharArray();
		FAB=new int[(ch.length-1)];
		FBA=new int[(ch.length-1)];
		for(i=0;i<(ch.length-1);i++)
		{
				if(ch[i]=='A' && ch[i+1]=='B')
				{
					FAB[i]=1;	
				}
				if(ch[i]=='B' && ch[i+1]=='A')
				{
					FBA[i]=1;
				}
				
		}
		for(i=0;i<(ch.length-1);i++)
		{
			if(i==0)
			{
				FABsum+=FAB[i];
				FBAsum+=FBA[i];
			}
			else
			{
				FABsum+=FAB[i];
				FBAsum+=FBA[i];
				if(FBA[i]==1 && FAB[i-1]==1)
				{
					count1=1;
					count2=(FABsum-1);
				}
				else if(FBA[i-1]==1 && FAB[i]==1)
				{
					count1=(FBAsum-1);
					count2=1;
				}
				else if((FBA[i]==1 && FAB[i-1]==0) || (FBA[i-1]==0 && FAB[i]==1))
				{
					if(FAB[i]==1)
					{	
					count1=(FBAsum);
					count2=1;
					}
					else
					{
					count1=1;
					count2=FABsum;	
					}
				}
			}
			if(count1>0 && count2>0)
			{
				ans="YES";
				break;
			}			
		}
		System.out.println(ans);
	}
}