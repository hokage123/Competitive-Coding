import java.util.*;
class TheRobberLanguage
{
public static void main(String j[])
{
Scanner sc=new Scanner(System.in);
String s,s1="",c;
s=sc.nextLine();
char ch[]=s.toCharArray(); 
for(int i=0;i<s.length();i++)
{
	c=Character.toString(ch[i]);
if(ch[i]=='a'||ch[i]=='e'|| ch[i]=='i' || ch[i]=='o' || ch[i]=='u' || ch[i]==' ' || ch[i]=='	')
s1+=c;
else if(ch[i]>='a' || ch[i]<='z')
s1+=(c+"o"+c);
else
s1+=c;
}
System.out.println(s1);
}
}