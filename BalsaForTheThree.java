import java.util.Scanner;
class BalsaForTheThree
{
public static void main(String[] d)
{
long N,ans[],M,F,s;
int count=0,i,T;
Scanner sc=new Scanner(System.in);
T=sc.nextInt();
ans=new long[T];
for(i=0;i<T;i++)
{
count=0;	
N=sc.nextLong();
M=N+1;
while(count<3)
{
count=0;	
s=M;
while(s!=0)
{
F=s%10;
s=s/10;
if(F==3)
count++;
if(count>=3)
break;
}
if(count>=3)	
break;
else
M++;
}
ans[i]=M;
}
for(i=0;i<T;i++)
System.out.println(ans[i]);
}
}