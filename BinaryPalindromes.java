import java.util.*;
import java.util.*;
class BinaryPalindromes
{
	public static void main(String[] f)
	{
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt(),i,j,k,count1;
		for(k=0;k<q;k++)
		{	
		 count1=0;
		int t=sc.nextInt();
		int ans=t;
		int count[]=new int[2];
		if(t==1)
		{
			String s=sc.next();
			char ch[]=s.toCharArray();
			for(j=0;j<(ch.length/2);j++)
			{
				if(ch[j]!=ch[ch.length-1-j])
					count1=1;
			}
			if(count1==1)
			{
				ans--;
			}
		}
		else
		{	
		for(i=0;i<t;i++)
		{
			String s=sc.next();
			char ch[]=s.toCharArray();
			if(ch.length%2==0)
			{	
			for(j=0;j<ch.length;j++)
			{
				count[ch[j]-'0']++;
			}
			}
			else 
				count1=1;
		}
		
		if(count[0]%2!=0 && count[1]%2!=0 && count1==0)
			ans--;
		}
		System.out.println(ans);
		}
	}
	
}