import java.util.Scanner;
class Archi
{
public static void main(String[] d)
{
int T,ans[],i;
long a,b,n;
Scanner sc=new Scanner(System.in);
T=sc.nextInt();
ans=new int[T];
for(i=0;i<T;i++)
{
a=sc.nextLong();
b=sc.nextLong();
n=sc.nextLong();
if((((a*a)>(b*b)) && a>0) || (((a*a)>(b*b)) && a<0 && (n%2==0)) || (((a*a)<(b*b)) && b<0 && (n%2==1)) ||(((a*a)==(b*b)) && b<0 && (n%2==1)))
ans[i]=1;
else if((((a*a)<(b*b)) && b>0) || (((a*a)<(b*b)) && a<0 && (n%2==1)) || (((a*a)>(b*b)) && b<0 && (n%2==0)) ||(((a*a)==(b*b)) && a<0 && (n%2==1)))
ans[i]=2;
else
ans[i]=0;
}
for(i=0;i<T;i++)
System.out.println(ans[i]);
}
}