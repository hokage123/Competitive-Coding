import java.util.*;
class MagicianVersusChef
{
public static void main(String[] d)
{
int T,N,X,S,ans[],i,j,m,n,ag;
Scanner sc=new Scanner(System.in);
T=sc.nextInt();
ans=new int[T];
for(i=0;i<T;i++)
{
	N=sc.nextInt();
	X=sc.nextInt();
	S=sc.nextInt();
	ag=X;
	for(j=0;j<S;j++)
	{
		m=sc.nextInt();
		n=sc.nextInt();
		if(m==ag)
			ag=n;
		else if(n==ag)
			ag=m;
	}
	ans[i]=ag;
}
for(i=0;i<T;i++)
System.out.println(ans[i]);	
}
}