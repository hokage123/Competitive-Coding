import java.util.Scanner;
class TraceOfMatrix
{
public static void main(String[] g)
{
int N,T,a[][],Tes[],i,j,sum,max,t,k;
Scanner sc=new Scanner(System.in);
T=sc.nextInt();
Tes=new int[T];
for(i=0;i<T;i++)
{
max=0;
N=sc.nextInt();
a=new int[N][];
for(j=0;j<N;j++)
a[j]=new int[N];
for(j=0;j<N;j++)
for(k=0;k<N;k++)
a[j][k]=sc.nextInt();

for(j=0;j<N;j++)
for(k=0;k<N;k++)
{
	sum=0;
	t=0;
while((j+t)<=(N-1) && (k+t)<=(N-1))
{
sum+=a[j+t][k+t];
if(sum>max)
max=sum;
t++;
}
}
Tes[i]=max;
}
for(i=0;i<T;i++)
System.out.println(Tes[i]);
}
}