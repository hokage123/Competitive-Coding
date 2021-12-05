import java.io.*;
import java.util.*;
class PhoneNumbers
{
	public static void main(String[] d)
	{
		int n,count=0,i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		char ch[]=sc.next().toCharArray();
		for(i=0;i<n;i++)
		{
			if(ch[i]=='8')
				count++;
		}
		System.out.println(Integer.min((n/11),count));
	}
}