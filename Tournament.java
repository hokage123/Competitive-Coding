import java.util.*;
class Tournament
{
public static void main(String[] d)
{
int N,ar[],i,sum=0;
long s=0;
Scanner sc=new Scanner(System.in);
N=sc.nextInt();
ar=new int[N];
for(i=0;i<N;i++)
{
ar[i]=sc.nextInt();
sum+=ar[i];
}
Arrays.sort(ar);
i=(N-1);
while(i>0)
{
sum-=ar[i];
s+=((i*ar[i])-sum);
i--;
}
System.out.println(s);
}
}