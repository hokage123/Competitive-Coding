import java.util.*;
import java.io.*;
class KillThemWithYourSucess
{
public static void main(String[] f)
{
int T,N,i,j;
double ans,myans[],ar[];
Scanner sc=new Scanner(System.in);
T=sc.nextInt();
myans=new double[T];
for(i=0;i<T;i++)
{
ans=0;
N=sc.nextInt();
ar=new double[N];
for(j=0;j<N;j++)
ar[j]=sc.nextInt();
Arrays.sort(ar);
for(j=0;j<(N-1);j++)
{	
ans=(ar[N-1-j]+ar[N-2-j])/2;
ar[N-2-j]=ans;
}
myans[i]=ans;
}
for(i=0;i<T;i++)
System.out.println(myans[i]);
}
}