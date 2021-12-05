import java.util.Scanner;
class ImmmortalFrieza
{
public static void main(String[] f)
{
int i=0,j,m,T,k,n;
String ans[];
String pin="";
String U;
Scanner sc=new Scanner(System.in);
T=sc.nextInt();
sc.nextLine();
ans=new String[T];
for(k=0;k<T;k++)
{
	i=0;
pin="";
U=sc.next();
while(i<U.length())
{
m=0;	
j=0;
if(("frieza".indexOf(U.charAt(i)))!=-1)
{	
n=("frieza".indexOf(U.charAt(i)));
while(i<U.length() && "frieza".indexOf(U.charAt(i))!=-1 )
{
m=1;	
i++;
n++;
j++;
}
}
else if(m==0)
{	
while(i<U.length() && ("frieza".indexOf(U.charAt(i)))==-1)
{
i++;
j++;
}
}
pin+=j;
}
ans[k]=pin;
}
for(k=0;k<T;k++)
System.out.println(ans[k]);
}
}