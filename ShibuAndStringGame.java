import java.util.*;
import java.io.*;
class ShibuAndStringGame
{
public static void main(String[] n)
{
int i,j,count=0;
String A,B,s;
ArrayList<CharSequence> C;
Scanner sc=new Scanner(System.in);
C=new ArrayList<CharSequence>();
A=sc.next();
B=sc.next();	
for(i=0;i<A.length();i++)
for(j=(i+1);j<=A.length();j++)
{
	C.add(A.substring(i,j));	
}
for(i=0;i<C.size();i++)
	if(B.contains(C.get(i)))
		count++;
System.out.println(count);
}
}