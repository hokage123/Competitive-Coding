import java.util.*;
import java.io.*;
class FancyQuotes
{
	public static void main(String[] g)throws IOException
	{
		int T,i,j;
		String h,s[],ans;
		Scanner sc=new Scanner(System.in);
		T=sc.nextInt();
		sc.nextLine();
		ans="regularly falsy";
		BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		for(i=0;i<T;i++)
		{
			h=sc.nextLine();
			s=h.split(" ");
			for(j=0;j<s.length;j++)
			{
				if(s[j].equals("not"))
				{
					ans="Real Fancy";
					break;
				}	
				else
				{
					ans="regularly fancy";
				}
			}
			sb=sb.append(ans+"\n");
			
		}
		bf.write(sb.toString());
		bf.close();
	}
}