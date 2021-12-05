import java.util.*;
import java.io.*;
class DoggoRecoloring
{
	public static void main(String[] p)
	{
		int n,i,count=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		String b=sc.next();
		char[] ch=b.toCharArray();
		int[] ans=new int[26];
		for(i=0;i<n;i++)
			ans[ch[i]-'a']++;
		for(i=0;i<26;i++)
			if(ans[i]>1)
				count=1;
		if(count==1 || n==1)
			System.out.print("Yes");
		else
			System.out.print("No");	
	}
}