import java.util.*;
class Variation
{
public static void main(String[] d)
{
int N,K,ar[],i,sum=0,sum1=0,j;
Scanner sc=new Scanner(System.in);
N=sc.nextInt();
K=sc.nextInt();
ar=new int[N];
for(i=0;i<N;i++)
ar[i]=sc.nextInt();
Arrays.sort(ar);
 if((ar[N-1]-ar[0])<K)
sum=0;
else
{
j=0;
for(i=1;i<N;i++)
{
	sum1=0;
	while(j<i)
{
if((ar[i]-ar[j])>=K)
sum1++;
else
	break;
j++;
}
if(sum1>0)
{	
sum+=sum1;
j=sum;
}
else if(sum==0)
j=0;
}
}
System.out.println(sum);
}
}