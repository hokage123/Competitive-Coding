import java.util.Scanner;
class SecretRecipe
{
public static void main(String[] d)
{
int T,X1,X2,X3;
double d1,d2,V1,V2;
String[] g;
Scanner sc=new Scanner(System.in);
T=sc.nextInt();
g=new String[T];
for(int i=0;i<T;i++)
{
X1=sc.nextInt();
X2=sc.nextInt();
X3=sc.nextInt();
V1=sc.nextDouble();
V2=sc.nextDouble();
if((X1-X3)>0)
d1=(X1-X3);
else
d1=(X3-X1);
if((X2-X3)>0)
d2=(X2-X3);
else
d2=(X3-X2);
if((d1/V1)<(d2/V2))
g[i]="Chef";
else if((d1/V1)>(d2/V2))
g[i]="Kefa";
else
g[i]="Draw";
}
for(String s:g)
System.out.println(s); 
} 
}