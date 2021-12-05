import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
public class InfinityTable
{
	public static void getRowandColumn(int number,int[] rowandcol)
	{
		
		int x=(int)(Math.sqrt(number));
		int y=(number-(x*x));
		if(y==0)
		{
			rowandcol[0]=x;
			rowandcol[1]=1;
		}
		else if(y<=(x+1))
		{
			rowandcol[0]=y;
			rowandcol[1]=(x+1);
		}
		else
		{
			rowandcol[0]=(x+1);
			rowandcol[1]=((x+1)-(y%(x+1)));
		}
		
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] rowandcol=new int[2];
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int number=sc.nextInt();
			getRowandColumn(number,rowandcol);
			System.out.println(rowandcol[0]+" "+rowandcol[1]);
		}
	}
}