import java.util.Scanner;
class ShubhamGarden
{
public static void main (String[] o)
{
int N,Q,K,L[],H[],M[],P[],Lo=0,Hi=0,i,j=0,k=0,gcd=1,avg=0,m=0,t=0;
Scanner sc=new Scanner(System.in);
N=sc.nextInt();
Q=sc.nextInt();
K=sc.nextInt();
L=new int[N];
H=new int[N];
P=new int[Q]; 
for(i=0;i<N;i++)
{
L[i]=sc.nextInt();
H[i]=sc.nextInt();
m+=((H[i]-L[i])/K+1);
}

M=new int[m];
//System.out.println(M.length);
for(i=0;i<M.length;i++)
{
	if(t==0)
	{
		t=1;
		M[i]=L[j];
	}
	else
	{
		M[i]=M[i-1]+K;
		if(M[i]==H[j])
		{
			j++;
			t=0;
		}
	}
}
for(i=0;i<Q;i++)
{
	j=sc.nextInt();
P[i]=M[j-1];
}
for(i=0;i<Q;i++)
{
avg+=(P[i]);
}
for(i=2;i<avg;i++)
{
if((avg%i)==0 && (Q%i)==0)
gcd=i;
}
if(gcd!=1)
{
avg=(avg/gcd);
Q=(Q/gcd);
}
System.out.println(avg+"/"+Q);
}
}