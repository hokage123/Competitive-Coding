import java.util.Scanner;
class TwoVsTen
{
public static void main(String[] f)
{
int N,X,S[];
Scanner sc=new Scanner(System.in);
N=sc.nextInt();
S=new int[N];
for(int i=0;i<N;i++)
{
X=sc.nextInt();
if(X%10==0)
S[i]=0;
else if(X%5==0)
S[i]=1;
else
S[i]=-1;
}
for(int i=0;i<N;i++)
System.out.println(S[i]);
}
}