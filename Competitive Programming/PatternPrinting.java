import java.util.*;
import java.io.*;
class PatternPrinting
{
public static void main(String[] f)
{
	int N,i,j,count,m,s,k;
	String S,S1;
	Scanner sc=new Scanner(System.in);
	N=sc.nextInt();
	count=N;
	m=N;
	s=N*(N+1);
	k=1;
	for(i=0;i<N;i++)
	{
		S="";
		S1="";
		for(j=0;j<i;j++)
		{
			S+="**";
		}
		j=1;
		while(j<=count)
		{
			S+=k;
			S+="0";
			j++;
			k++;
		}
		j=1;
		while(j<=count)
		{
			if(j==1)
			{
				S1=""+s;
			}
			else
			{
				S1=(s+"0"+S1);
			}
			s--;
			j++;
		}
		count--;
		S+=S1;
		System.out.println(S);
	}
}
}