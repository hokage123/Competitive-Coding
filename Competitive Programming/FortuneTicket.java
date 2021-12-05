import java.util.Scanner;
class FortuneTicket
{
public static void main(String[] f)
{
int N,num,sum1=0,sum2=0,nm[],i=0,c=0;
Scanner sc=new Scanner(System.in);
N=sc.nextInt();
nm=new int[N];
num=sc.nextInt();
while(num!=0)
{
nm[i]=num%10;
num=num/10;
i++;
}
for(i=0;i<N/2;i++)
{
if(nm[i]==4 || nm[i]==7)	
sum1+=nm[i];
else
{
c=1;
System.out.println("NO");
break;	
}
if(nm[N/2+i]==4 || nm[N/2+i]==7)
sum2+=nm[N/2+i];
else
{
c=1;
System.out.println("NO");
break;	
}
}
if(c==0)
{
if(sum1==sum2)
System.out.println("YES");
else
System.out.println("NO");
}
}
}