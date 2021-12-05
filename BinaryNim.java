import java.util.Scanner;
import java.util.ArrayList;
class BinaryNim
{
public static void main(String[] g)
{
int T,K,count1,count2;
ArrayList<String> al=new ArrayList<>();
String S,M,N,P[],pl;
Scanner sc=new Scanner(System.in);
T=sc.nextInt();
P=new String[T];
for(int i=0;i<T;i++)
{
count1=0;
count2=0;
K=sc.nextInt();
sc.nextLine();
pl=sc.nextLine();
for(int j=0;j<K;j++)
{
al.add(sc.nextLine());
if(j>0)
{
if(al.get(j)==(new String(al.get(j-1).toCharArray(),1,(al.get(j-1).length()-1))+"0"));
{
if((j+1)%2==1)
{
count1++;
}
else
count2++;
}
}
	
}

if(count1>count2)
{
P[i]=pl;
}
else
{
if(pl=="Dum")
P[i]="Dee";
else
P[i]="Dum";
}
}
for(int i=0;i<P.length;i++)
{
System.out.println(P[i]);
}
}
}