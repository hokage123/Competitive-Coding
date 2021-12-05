import java.util.*;
import java.io.*;
class CuriosityHasNoLimits
{
public static void main(String[] d)
{
int N;
int[] a,b;
Scanner sc=new Scanner(System.in);
N=sc.nextInt();
a=new int[]
for(i=0;i<(N-1);i++)
a[i]=sc.nextInt();
for(i=0;i<(N-1);i++)
b[i]=sc.nextInt();
for(i=0;i<(N-1);i++)
{
a=-1;
b=-1;
for(j=0;j<=3;j++)
for(k=0;k<=3;k++)
if(j|k==a[i] && j&k==a[i])
{
a=j;
b=k;
}
if(i!=0)
{
if(a==as || b==as)
{
ar.add(bs);
ar.add(as);
}
else
{
ar.add(as);
ar.add(bs);
}
}
if(i==(N-1))
{
ar.add(as);
ar.add(bs);
}
as=a;
bs=b;
}
}
}