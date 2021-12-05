import java.util.Scanner;
class CricketScore
{
public static void main(String[] e)
{
int N,Wi[],Ri[],i;
String S="YES";
Scanner sc=new Scanner(System.in);
N=sc.nextInt();
Ri=new int[N];
Wi=new int[N];
for(i=0;i<N;i++)
{
Ri[i]=sc.nextInt();
Wi[i]=sc.nextInt();
}
for(i=0;i<N;i++)
{
if(i>0)
if((Ri[i]<Ri[i-1])||(Wi[i]<Wi[i-1]))
{
S="NO";
System.out.println(S);
break;
}
if(Wi[i]>10)
{
S="NO";
System.out.println(S);
break;
}
}
if(S=="YES")
System.out.println(S);
}
}