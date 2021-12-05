import java.math.BigInteger;
import java.util.Scanner;
class BinaryShuffle
{
public static void main(String[] f)
{
BigInteger A,B,ans[],laststr2;
int T,i,count1;
String str1,str2;
Scanner sc=new Scanner(System.in);
T=sc.nextInt();
ans=new BigInteger[T];
for(i=0;i<T;i++)
{	
A=new BigInteger(sc.next());
B=new BigInteger(sc.next());
str1=A.toString(2);
str2=B.toString(2);
if(str1.equals(str2))
ans[i]=new BigInteger("0");
else
{	
count1=count1(str1,str2);
if((count1<=0 && str1.length()>str2.length()) || (count1<0 && str1.length()==str2.length() && B.compareTo(A)==-1))
{
	ans[i]=new BigInteger("-1");
}
else
{
	laststr2=new BigInteger("0");
	ans[i]=new BigInteger("0");
	if(count1>0 && str1.length()<str2.length())
	{
	Integer m=count1-1;	
	ans[i]=new BigInteger(m.toString());
	}
	if(count1==0 || (str1.length()==str2.length() && B.compareTo(A)==1))
	laststr2=B.subtract(A);
	else
	laststr2=laststr2(str2); 
	ans[i]=ans[i].add(laststr2);
}
}
}
for(i=0;i<T;i++)
	System.out.println(ans[i]);
}
static int count1(String str1,String str2)
{	
int i,count1=0,count2=0;
char[] ch1,ch2;
ch1=str1.toCharArray();
ch2=str2.toCharArray();
for(i=0;i<ch1.length;i++)
{
if(ch1[i]=='1')
count1++;
}
for(i=0;i<ch2.length;i++)
{
if(ch2[i]=='1')
count2++;
}
return (count2-count1);
}
static BigInteger laststr2(String str2)
{
	int i,m=0;
	for(i=0;i<str2.length();i++)
	{
	if(str2.charAt(i)=='1')
	m=i;
	}
return (new BigInteger("2").pow(str2.length()-m-1));
}
}