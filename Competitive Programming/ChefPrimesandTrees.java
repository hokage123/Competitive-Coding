import java.util.*;
import java.io.*;
class ChefPrimesandTrees
{
public static void main(String[] d)throws IOException
{
int N,a[],b[],aprime[],bprime[],i,max,max1,c=0,sum=0,sum1=0,sum2=0;
Scanner sc=new Scanner(System.in);
BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
StringBuilder sb=new StringBuilder();
N=sc.nextInt();
a=new int[N];
b=new int[N];
aprime=new int[N];
bprime=new int[N];
for(i=0;i<N;i++)
{
a[i]=sc.nextInt();
sum+=a[i];
if(isPrime(a[i]))
{
aprime[i]=1;
sum1+=1;
}
}
for(i=0;i<N;i++)
{
b[i]=sum-a[i];
if(isPrime(b[i]))
{
bprime[i]=1;
sum2+=1;
}
}
max=0;
for(i=1;i<N;i++)
{
max1=((sum1+sum2)-(aprime[i]+bprime[i]));
if(max1>max)
c=i;
}
for(i=0;i<N;i++)
{
if(i!=c)
sb=sb.append((c+1)+" "+(i+1)+"\n");
}
bf.write(sb.toString());
bf.close();
}
static boolean isPrime(int i)
{
int j;
if(i==1)
return false;
else
{
for(j=2;j<=Math.sqrt(i);j++)
{
if((i%j)==0)
return false;
}
}
return false;
}
}