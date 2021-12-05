import java.util.*;
import java.io.*;
class DiverseSubstring
{
	public static void main(String[] s)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),i,count=0;
		String g=sc.next();
		char ch[]=g.toCharArray();
		for(i=0;i<(n-1);i++)
		{
			if(ch[i]!=ch[i+1])
			{
				System.out.println("Yes");
				System.out.println(ch[i]+""+ch[i+1]);
				count=1;
				break;
			}
		}
		if(count==0)
			System.out.println("No");
	}
}