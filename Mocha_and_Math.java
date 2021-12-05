//https://codeforces.com/contest/1559/problem/A
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
class Mocha_and_Math
{
	public static int bitWise_Minimum_Of_Maximum(int[] arr)
	{
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			min&=arr[i];
		}
		return min;
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int size=sc.nextInt();
			int arr[]=new int[size];
			for(int j=0;j<size;j++)
			{
				arr[j]=sc.nextInt();
			}
			System.out.println(bitWise_Minimum_Of_Maximum(arr));
		}
		
	}
}