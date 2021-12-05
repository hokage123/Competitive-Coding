import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
public class DisLikesOfThree
{
	public static void makeMyList(ArrayList<Integer> likeNumbers)
	{
		for(int i=1;i<=2000;i++)
		{
			if(i%3!=0 && i%10!=3)
				likeNumbers.add(i);
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> likeNumbers=new ArrayList<Integer>();
		makeMyList(likeNumbers);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int k=sc.nextInt();
			System.out.println(likeNumbers.get((k-1)));
		}
	}
}