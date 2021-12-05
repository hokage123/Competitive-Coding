import java.util.*;
import java.io.*;
class ChefAndInteractiveContests
{
	public static void main(String[] d)throws IOException
	{
		int N,r,R,i;
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		r=sc.nextInt();
		BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		for(i=0;i<N;i++)
		{
			R=sc.nextInt();
			if(R>=r)
			{
				sb=sb.append("Good boi\n");
			}
			else
			{
				sb=sb.append("Bad boi\n");
			}
		}
		bf.write(sb.toString());
		bf.close();
	}
}