import java.util.Scanner;
class DirectSeries
{
public static void main(String[] d)
{
long N,T,j,k,sum,sum1;
int t,i;
long a[];
Scanner sc=new Scanner(System.in);
t=sc.nextInt();
a=new long[t];
for(i=0;i<t;i++)
{
N=sc.nextLong();
T=sc.nextLong();
sum=0;
for(j=1;j<=N;j++)
{
sum1=1;	
for(k=1;k<=T;k++)
{
sum1*=((j+k)%(1000000007));
sum1%=(1000000007);
if(sum1==0)
break;
}
sum+=(sum1%1000000007);
sum%=1000000007;
}
a[i]=sum;
}
for(i=0;i<t;i++)
System.out.println(a[i]);
}
}