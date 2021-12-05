import java.util.*;
import java.io.*;
class Problem8
{
	 public static void main(String[] h)
	 {
		 Scanner sc=new Scanner(System.in);
		 String s=sc.next();
		 char ch[]=s.toCharArray();
		 int max=0,max1,i;
		 for(i=0;i<=(ch.length-4);i++)
		 {
			 int m=(ch[i]-'0');
			 int n=(ch[i+1]-'0');
			 int o=(ch[i+2]-'0');
			 int p=(ch[i+3]-'0');
			 max1=(m*n*o*p);
			 if(max1>max)
				 max=max1;
		 }
		 System.out.println(max1);
	 }
}