import java.util.Scanner;
import java.util.Arrays;
class MightyFriend
{
public static void main(String[] u)
{
int T,N,K,i,j,a[],b[],c[],sum1,sum2,m,n,sw;
Scanner sc=new Scanner(System.in);
T=sc.nextInt();
String S[];
S=new String[T];
for(i=0;i<T;i++)
{
sum1=0;
sum2=0;
m=0;
n=0;
N=sc.nextInt();
K=sc.nextInt();
a=new int[N];
for(j=0;j<N;j++)
a[j]=sc.nextInt();
if(N%2==0)
{
	b=new int[N/2];
	c=new int[N/2];
}
else
{
	b=new int[N/2+1];
	c=new int[N/2];
}
for(j=0;j<N;j++)
{
	if(j%2==0)
	{	
	b[m]=a[j];
	m++;
	}
	else
	{	
	c[n]=a[j];
	n++;
	}
}
Arrays.sort(b);
Arrays.sort(c);
m=b.length-1;
n=0;
for(j=0;j<K;j++)
{
	if(c[n]<b[m])
	{
		sw=c[n];
		c[n]=b[m];
		b[m]=sw;
		m--;
		n++;
	}
}
m=0;
n=0;
for(j=0;j<N;j++)
{
	if(j%2==0)
	{	
	sum1+=b[m];
	m++;
	}
	else
	{	
	sum2+=c[n];
	n++;
	}
}

if(sum2>sum1)
	S[i]="YES";
	else
	S[i]="NO";
}
for(i=0;i<T;i++)
System.out.println(S[i]);
}
}