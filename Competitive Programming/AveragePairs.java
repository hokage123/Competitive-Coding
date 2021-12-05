import java.util.*;
class AveragePairs
{
public static void main(String... s)
{
int t,n,b[],i,j,k,c,a[];
Scanner sc=new Scanner(System.in);
t=sc.nextInt();
b=new int[t];
for(i=0;i<t;i++)
{
c=0;
n=sc.nextInt();
a=new int[n];
for(j=0;j<n;j++)
a[j]=sc.nextInt();
Arrays.sort(a);
for(j=0;j<n-1;j++)
for(k=(j+1);k<n;k++)
{
c=-1;
if((a[j]+a[k])%2==0)
c=Arrays.binarySearch(a,(a[j]+a[k])/2);
if(c>=0)
b[i]+=1;
}
}
for(i=0;i<t;i++)
System.out.println(b[i]);
}
}