import java.util.*;
class KimLeftForVin
{
public static void main(String[] d)
{
int N,count1,count=0,i;
String s;
Scanner sc=new Scanner(System.in);
N=sc.nextInt();
s=sc.next();
char ch[]=s.toCharArray(),cg;
for(i=0;i<(s.length()-1);i++)
{
if(ch[i]=='V' && ch[i+1]=='K')
count++;
}
while(count>0)
{
for(i=0;i<(s.length()-1);i++)
{
if(ch[i]=='V' && ch[i+1]=='K')
{
cg=ch[i];
ch[i]=ch[i+1];
ch[i+1]=cg;
count1++;
}
}
count=0;
for(i=0;i<(s.length()-1);i++)
{
if(ch[i]=='V' && ch[i+1]=='K')
{
count++;
}
}
}
System.out.println(count1);
}
}