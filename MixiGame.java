import java.util.Scanner;
import java.math.BigInteger;
class MixiGame
{
public static void main(String[] s)
{
int T,V,K,ans[],i,j,N;
String str;
BigInteger b;
Scanner sc=new Scanner(System.in); 
T=sc.nextInt();
ans=new int[T];
for(i=0;i<T;i++)
{
N=sc.nextInt();
K=sc.nextInt();
str="";
for(j=0;j<N;j++)
str=str+sc.nextInt();
V=mybitCount(str,K);
if((V-K)>=0)
ans[i]=1;
else
ans[i]=2;
}
for(i=0;i<T;i++)
System.out.println(ans[i]);
}
static int mybitCount(String str,int K)
{
	int count1=0;
	char ch[]=str.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		if(i%2==0)
		{
			if(ch[i]=='1')
				count1++;
		}
		else
		{
			if(ch[i]=='1')
			{
				if(count1>0)
					count1--;
				else
					count1++;
			}
		}
	}
	return Math.abs(count1);
}
}