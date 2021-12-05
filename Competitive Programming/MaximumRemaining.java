import java.io.*;
import java.util.*;
class MaximumRemaining
{
public static void main(String[] g)
{
int a[],N,i,max=0,min=0;
Scanner sc=new Scanner(System.in);
N=sc.nextInt();
a=new int[N];
for(i=0;i<N;i++)
{
	a[i]=sc.nextInt();
}
Arrays.sort(a);
for(i=0;i<N;i++)
{
if(i==0)
{
	max=a[i];
	min=a[i];
}
else if(a[i]>max)
{
	min=max;
	max=a[i];
}
}
if(min==max)
{
	System.out.println(0+"\n");
}
else
{
	System.out.println(min+"\n");
}
}
}