import java.util.*;
class LetsHelpChristine
{
public static void main(String[] r)
{
int count,count1=0,count2=0,count3=0,count4=0,c=0,d=0,length;
String s,s1;
Scanner sc=new Scanner(System.in);
length=sc.nextInt();
if(length%4==0)
{
	c=0;
sc.nextLine();
s=sc.nextLine();
char ch[]=s.toCharArray();
count=ch.length/4;
for(int i=0;i<ch.length;i++)
{
if(ch[i]=='A')
{
count1++;
}
else if(ch[i]=='C')
{
count2++;

}
else if(ch[i]=='T')
{
count3++;

}
else if(ch[i]=='G')
{
count4++;
}
}

if(count1>count)
	{
		d=0;
		s1="";
		for(int j=0;j<(count1-count);j++)
		{
			for(int k=0;k<j;k++)
				s1+="A";
			if(s.indexOf(s1)>=0)
				d=s1.length();
		}
		c+=(2*(count1-count)-d);
}
if(count2>count)
	{
		d=0;
		s1="";
		for(int j=0;j<(count2-count);j++)
		{
			for(int k=0;k<j;k++)
				s1+="C";
			if(s.indexOf(s1)>=0)
				d=s1.length();
		}
		c+=(2*(count2-count)-d);
}
if(count3>count)
	{
		d=0;
		s1="";
		for(int j=0;j<(count3-count);j++)
		{
			for(int k=0;k<j;k++)
				s1+="T";
			if(s.indexOf(s1)>=0)
				d=s1.length();
		}
		c+=(2*(count3-count)-d);
}
if(count4>count)
	{
		d=0;
		s1="";
		for(int j=0;j<(count1-count);j++)
		{
			for(int k=0;k<j;k++)
				s1+="G";
			if(s.indexOf(s1)>=0)
				d=s1.length();
		}
		c+=(2*(count4-count)-d);
}
System.out.println(c);
}
}
}