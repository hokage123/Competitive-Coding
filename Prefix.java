import java.util.*;
class Prefix
{
public static void main(String... o)
{
int t,i,j,r,b[],c,d,g,c1,m=0;
String s1;
char ch[];
Scanner sc=new Scanner(System.in);
t=sc.nextInt();
b=new int[t];
for(i=0;i<t;i++)
{
	c1=0;
	s1="";
	c=0;
	d=0;
	g=0;
s1=sc.next();
r=sc.nextInt();
ch=s1.toCharArray();
for(j=0;j<s1.length();j++)
{
	m=0;
if(ch[j]=='a')
	d++;
else
	g++;
if(d>g)
	c++;
}
while(ch[m]=='a')
{
	m++;
}
for(j=0;j<r;j++)
{
	if(d<g)
	{   
		if(c>0)
		{
		c1+=c;
		c-=(g-d);
		}
	}
	else if(d==g)
	{
		if(c>0)
			c1+=c;
	}
	else if(d>g)
	{
		if(c<s1.length())
		{	
		c1+=c;
		c+=(d-g);
		}
		else
			c1+=s1.length();
	}
}
b[i]=c1;
}
for(i=0;i<t;i++)
	System.out.println(b[i]);
}
/*static int mypops(String e)
{
int d=0,g=0;
char ch[]=e.toCharArray();
for(int i=0;i<ch.length;i++)
{
if(ch[i]=='a')
	d++;
else
	g++;
}
if(d>g)
return 1;
else if(d<g)
return 0;
else
return -1;
}*/
}