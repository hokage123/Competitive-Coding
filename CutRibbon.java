import java.io.*;
import java.util.*;
class CutRibbon
{
	public static void main(String[] s)
	{
		int n,a,b,c,min,i;
		Scanner sc=new Scanner(System.in);
		int[] dp=new int[5000];
		n=sc.nextInt();
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		min=Integer.min(a,b);
		min=Integer.min(min,c);
		ArrayList<Integer> ar=new ArrayList<>();
		ar.add(a);
		ar.add(b);
		ar.add(c);
		for(i=0;i<=n;i++)
		{
			if(i==0)
				dp[0]=0;
			else if(i<min)
				dp[i]=-100000;
			else
			{	
			    int max=-100000;
				for(int j:ar)
				{
					if((i-j)>=0)
						max=Integer.max(max,(1+dp[i-j]));	
				}
				dp[i]=max;
			}			
		}
		//for(i=0;i<=n;i++)
		    //System.out.println(i+"===  >  "+dp[i]);
		if(dp[n]<=0)
			System.out.println(1);
		else
			System.out.println(dp[n]);
	}
}