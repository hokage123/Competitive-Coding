import java.io.*;
import java.util.*;
class DeletefromtheLeft
{
	public static void main(String[] s)
	{
		int count=0,j=0;
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		while(j<ch1.length && j<ch2.length)
		{
			if(ch1[ch1.length-1-j]==ch2[ch2.length-1-j])
				count++;
			else
				break;
			j++;
		}
		System.out.println(((ch1.length+ch2.length)-(2*count)));
	}
} 