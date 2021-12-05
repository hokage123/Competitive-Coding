import java.util.*;
class Workers
{
public static void main(String... l)
{
int N,sal[],w[],min=0,i,j;
Scanner sc=new Scanner(System.in);
N=sc.nextInt();
sal=new int[N];
w=new int[N];
for( i=0;i<N;i++)
sal[i]=sc.nextInt();
for( i=0;i<N;i++)
w[i]=sc.nextInt();
for(i=0;i<N;i++)
{
if(w[i]==1)
{
for(j=0;j<N;j++)
{
if(w[j]==2)
{
if(min==0)
min=sal[i]+sal[j];
else if(min>(sal[i]+sal[j]))
min=sal[i]+sal[j];
}
}
}
else if(w[i]==2)
{
for(j=0;j<N;j++)
{
if(w[j]==1)
{
if(min==0)
min=sal[i]+sal[j];
else if(min>(sal[i]+sal[j]))
min=sal[i]+sal[j];
}
}
}
else if(w[i]==3)
{
if(min==0)
min=sal[i];
else if(min>sal[i])
min=sal[i];
}
}
System.out.println(min);
}
}