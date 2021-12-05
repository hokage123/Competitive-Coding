import java.util.*;
import java.io.*;
class PlayingwithMatches
{
	public static void main(String[] o)
	{
		int q,A,B,i,j,C;
		long sum=0;
		Scanner sc=new Scanner(System.in);
		q=sc.nextInt();
		int a[]={6,2,5,5,4,5,6,3,7,6};
		for(i=0;i<q;i++)
		{
		    sum=0;
			A=sc.nextInt();
			B=sc.nextInt();
			C=(A+B);
			String s=new String(""+C);
			char ch[]=s.toCharArray();
			for(j=0;j<ch.length;j++)
			{
				sum+=a[ch[j]-'0'];
			}
			System.out.println(sum);
		}
	}
}