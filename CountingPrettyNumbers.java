import java.util.Scanner;
class CountingPrettyNumbers
{
public static void main(String[] d)
{
int T,A,B,A1,B1,i,j,count=0,counts[];
Scanner sc=new Scanner(System.in);
T=sc.nextInt();
counts=new int[T];
for(i=0;i<T;i++)
{
	count=0;
A=sc.nextInt();
B=sc.nextInt();
A1=((A/10)+1)*10;
B1=((B/10))*10;
count+=(((B1-A1)*3)/10);
for(j=A;j<=A1;j++)
{
if((j%10==2) || (j%10==3) || (j%10==9))
count++;
}
for(j=B1;j<=B;j++)
{
if((j%10==2) || (j%10==3) || (j%10==9))
count++;
}
counts[i]=count;
}
for(i=0;i<T;i++)
System.out.println(counts[i]);
}
}