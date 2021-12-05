import java.io.*;
import java.util.*;
class ChefAndRidges
{
	public static void main(String[] g)throws IOException
	{
		int T,a,i;
		Scanner sc=new Scanner(System.in);
		BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			a=sc.nextInt();
			sb=sb.append(((int)((Math.pow(2,a)+Math.pow(-1,(a+1)))/3))+" "+((int)Math.pow(2,a))+" ");
		}
		bf.write(sb.toString());
		bf.close();
	}
	}