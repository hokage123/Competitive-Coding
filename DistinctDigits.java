import java.io.*;
import java.util.*;
class DistinctDigits
{
	public static void main(String[] m)
	{
		int x,y,i,count=0;
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		for(i=x;i<=y;i++)
		{
			String s=new String(""+i);
			char ch[]=s.toCharArray();
			HashSet<Character> hs=new HashSet<>();
			for(int j=0;j<ch.length;j++)
				hs.add(ch[j]);
			if(hs.size()==ch.length)
			{
				System.out.println(i);
				count=1;
				break;
			}
		}
		if(count==0)
			System.out.println("-1");
	}
}