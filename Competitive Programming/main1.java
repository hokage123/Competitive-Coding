import java.util.*;
class Main1
{
public static void main(String... d)
{
int i,t,j,a[],m,n;
Scanner sc=new Scanner(System.in);
t=sc.nextInt();
a=new int[t];
for( i=0;i<t;i++)
{
m=12;
j=sc.nextInt();
while((m--)!=0)
{
a[i]+=j/Math.pow(2,m);
j%=Math.pow(2,m);
}
}
for( i=0;i<t;i++)
System.out.println(a[i]);
}
}