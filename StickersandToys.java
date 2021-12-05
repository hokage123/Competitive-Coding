import java.io.*;
import java.util.*;
class StickersandToys
{
public static void main(String[] g)
{
int T,n,t,s,i,j;
Scanner sc=new Scanner(System.in);
T=sc.nextInt();
for(i=0;i<T;i++)
{
n=sc.nextInt();
t=sc.nextInt();
s=sc.nextInt();
if(t==n && s==n)
{
System.out.println(1);
}
else 
{
if(t>s)
{
System.out.println(n-s+1);
}
else
{
System.out.println(n-t+1);
}
}
}
}
}