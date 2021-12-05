import java.util.*;
class ChefAndAdventures
{
public static void main(String[] e)
{
int T,i;
long N,M,X,Y;
String ans[];
Scanner sc=new Scanner(System.in);
T=sc.nextInt();
ans=new String[T];
for(i=0;i<T;i++)
{
ans[i]="Pofik";
N=sc.nextLong();
M=sc.nextLong();
X=sc.nextLong();
Y=sc.nextLong();
if(((N-2)%X)==0 && ((M-2)%Y)==0 && (N>=2) && (M>=2))
ans[i]="Chefirnemo";
if(((N-1)%X)==0 && ((M-1)%Y)==0)
ans[i]="Chefirnemo";
}
for(i=0;i<T;i++)
System.out.println(ans[i]);
}
}