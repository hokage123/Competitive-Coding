import java.util.Scanner;
class NaiveChef
{
public static void main(String[] s)
{
int T,N,A,B,dice[],i,j;
double pro[],m,n;
Scanner sc=new Scanner(System.in);
T=sc.nextInt();
pro=new double[T];
for(i=0;i<T;i++)
{
m=0;
n=0;
N=sc.nextInt();
A=sc.nextInt();
B=sc.nextInt();
dice=new int[N];
for(j=0;j<N;j++)
dice[j]=sc.nextInt();
for(j=0;j<N;j++)
{
if(dice[j]==A)
m++;
if(dice[j]==B)
n++;
}
pro[i]=((m*n)/(N*N));
}
for(i=0;i<T;i++)
System.out.println(pro[i]);
}
}