import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
class SpecialAssignment
{
public static void main(String[] g)
{
int i,K=1,n=9;
Set<Character> s=new HashSet<>();
String S;
Scanner sc=new Scanner(System.in);
S=sc.nextLine();
char[] ch=S.toCharArray();
for(i=0;i<S.length();i++)
{
	if(i==0 && ch[i]>='1' && ch[i]<='9')
	{
		K=K*1;
		n=n+1;
	}
	else if(i==0)
	{
		if(ch[i]>='A' && ch[i]<='J')
		{
			s.add(ch[i]);
			K=K*n;
		}
		else if(ch[i]=='?')
		{
			K=K*9;
			n=n+1;
		}
	}
	else
	{
	
			if(s.contains(ch[i]))
			{
				n--;
			}
			else if(ch[i]=='?')
			{
				K=K*10;
			}
			else if(ch[i]>='A' && ch[i]<='J')
			 {
				 K=K*n;
				 s.add(ch[i]);
				n--;
			 }
	}
}
System.out.println(K);
}
}