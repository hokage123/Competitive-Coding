import java.util.Scanner;
import java.util.Arrays;
import java.math.BigInteger;
class XORAGN
{
public static void main(String[] s)
{
int T,i,j,k,N;
long h[];
BigInteger a[],xor,l[];
Scanner sc=new Scanner(System.in);
T=sc.nextInt();
a=new BigInteger[T];
for(i=0;i<T;i++)
{
	xor=new BigInteger("0");
N=sc.nextInt();
l=new BigInteger[N];
h=new long[N];	
for(j=0;j<N;j++)
h[j]=sc.nextLong();


for(j=0;j<N;j++)
{
for(k=0;k<N;k++)
{
	Long l1=h[j];
	Long l2=h[k];
	l[k]=(new BigInteger(l1.toString()).add(new BigInteger(l2.toString())));
}
	xor=myxor(xor,l);
}
a[i]=xor;
}
for(i=0;i<T;i++)
System.out.println(a[i]);
}
static BigInteger myxor(BigInteger xor,BigInteger a[])
{
int m,count1,count2,i;	
String y[],S="";
Arrays.sort(a);
if(xor.compareTo(a[a.length-1])==1)
	m=xor.toString(2).length();
else
	m=a[a.length-1].toString(2).length();
y=new String[a.length+1];
for(i=0;i<y.length;i++)
{
	if(i==0)
	y[i]=xor.toString(2);	
	else
	y[i]=a[i-1].toString(2);	
}
for(i=0;i<m;i++)
{
	count1=0;
	for(int j=0;j<y.length;j++)
	{
		if(i<y[j].length())
		{
			if(y[j].charAt(y[j].length()-1-i)=='1')
				count1++;
		}	
	}
	if(count1%2==1)
		S="1"+S;
	else
		S="0"+S;
}
	return new BigInteger(S,2);
}
}