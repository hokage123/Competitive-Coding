import java.io.*;
import java.util.*;
import java.math.*;
class SplitaNumber
{
	public static void main(String[] s)
	{
		int N,i,c=0,count=0;
		char ch[],ch1[];
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		String  s1,s2;
		BigInteger b1,b2,b3;
		BigInteger small=new BigInteger("0");
		BigInteger zero=new BigInteger("0");
		String v=sc.next();
		ch=v.toCharArray();
		for(i=((N/2)-1);i<=((N/2)+1);i++)
		{
			if(ch[i+1]!='0')
			{
					s1=v.substring(0,(i+1));
				 s2=v.substring((i+1),N);
				 b1=new BigInteger(s1);
				 b2=new BigInteger(s2);
				 b3=b1.add(b2);
				 if(small.equals(zero))
				 {
					 small=b3;
				 }
				 else if(b3.compareTo(small)==-1)
				 {	 
				 small=b3;
				 }
				 count=1;
			}
		}			
		if(count==0)
		{
		for(i=0;i<(N-1);i++)
		{
		
			if(ch[i+1]!='0' && ch[i]=='0')
			{	
				 s1=v.substring(0,(i+1));
				 s2=v.substring((i+1),N);
				 b1=new BigInteger(s1);
				 b2=new BigInteger(s2);
				 b3=b1.add(b2);
				 if(small.equals(zero))
				 {
					 small=b3;
				 }
				 else if(b3.compareTo(small)==-1)
				 {	 
				 small=b3;
				 }
			}
		}
		}
		System.out.println(small.toString());
		
		
	}
}