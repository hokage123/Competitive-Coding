import java.util.*;
import java.io.*;
class SubstringsSort
{
	public static void main(String[] g)
	{
		Scanner sc=new Scanner(System.in);
		int n,i,count=0;
		String[] s1;
		n=sc.nextInt();
		s1=new String[n];
		for(i=0;i<n;i++)
			s1[i]=sc.next();
		Arrays.sort(s1,new Length());
		for(i=0;i<(n-1);i++)
		{
			if((s1[i+1].indexOf(s1[i]))!=-1)
				count++;
			else
				break;
		}
		if(count==(n-1))
		{
			System.out.println("YES");
			for(i=0;i<n;i++)
			{
				System.out.println(s1[i]);
			}
		}
		else
			{
				System.out.println("NO");
			}
	}	
}
class Length implements Comparator<String>
{
	public int compare(String s1,String s2)
	{
		if(s1.length()>s2.length())return 1;
		if(s1.length()<s2.length())return -1;
		else
			return 0;
	}
}