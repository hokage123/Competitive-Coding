import java.util.Scanner;
class CutTheBoard
{
public static void main(String[] g)
{
int T,M,N,P[];
Scanner sc=new Scanner(System.in);
T=sc.nextInt();
P=new int[T];
for(int i=0;i<T;i++)
{
M=sc.nextInt();
N=sc.nextInt();
P[i]=((M-1)*(N-1));
}
for(int i=0;i<T;i++)
System.out.println(P[i]);
}
}