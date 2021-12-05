import java.io.*;
import java.util.*;
class VovaandTrophies
{
	public static void main(String[] f)
	{
		 int GLeft[],GRight[],S[],i,Gnum=0;
		 int max=0,maxLeft=0,maxRight=0;
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 char ch[]=sc.next().toCharArray();
		 GLeft=new int[n];
		 GRight=new int[n];
		 S=new int[n];
		 for(i=0;i<n;i++)
			 if(ch[i]=='G')
				 Gnum++;
		 for(i=0;i<n;i++)
			 if(ch[i]=='S')
				 S[i]=1;
		 for(i=0;i<n;i++)
		 {
			 if(i==0 && ch[i]=='G')
				 GLeft[i]=1;
			 else if(i==0)
				 GLeft[i]=0;
			 else if(ch[i]=='G')
				 GLeft[i]=(GLeft[i-1]+1);
			 maxLeft=Integer.max(maxLeft,GLeft[i]);
		 }
		 for(i=(n-1);i>=0;i--)
		 {
			 if(i==(n-1) && ch[i]=='G')
				 GRight[i]=1;
			 else if(i==(n-1))
				 GRight[i]=0;
			 else if(ch[i]=='G')
				 GRight[i]=(GRight[i+1]+1);
			 maxRight=Integer.max(maxRight,GRight[i]);
		 }
		 
		for(i=0;i<n;i++)
		{
			if(S[i]==1)
			{	
			if(i==0)
				
				max=Integer.max(max,GRight[i+1]);
			else if(i==(n-1))
				max=Integer.max(max,GLeft[i-1]);
			else
				max=Integer.max(max,(GLeft[i-1]+GRight[i+1]));
			}
		}
		max=Integer.max(max,maxLeft);
		max=Integer.max(max,maxRight);
		if(max<Gnum)
			max++;
		System.out.println(max);
	}
}