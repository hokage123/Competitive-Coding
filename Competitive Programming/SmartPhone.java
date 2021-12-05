import java.util.*;
class SmartPhone
{
public static void main(String[] d)
{
int N,i;
long[] sum,ar;
Scanner sc=new Scanner(System.in);
N=sc.nextInt();
ar=new long[N];
sum=new long[N];
for(i=0;i<N;i++)
{
ar[i]=sc.nextInt();
}
Arrays.sort(ar);
i=0;
while(i<N)
{
sum[i]=((N-i)*ar[i]);
i++;
}
Arrays.sort(sum);
System.out.println(sum[N-1]);
}
}