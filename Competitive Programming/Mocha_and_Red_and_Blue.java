//https://codeforces.com/contest/1559/problem/B
import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
class Mocha_and_Red_and_Blue
{
	public static void convert_To_Near_Perfect(char[] arr)
	{
		int n=arr.length;
		LinkedList<Character> stack=new LinkedList<>();
		int index=0;
		char previouschar=' ';
		char nextchar=' ';
		while(index<n)
		{
			if(arr[index]=='?')
			{
				stack.push(arr[index]);
			}
			else
			{
				int i=(index-1);
				nextchar=arr[index];
				while(i>=0 && stack.size()>0)
				{
					if(nextchar=='R')
					{
						arr[i]='B';
					}
					else
						arr[i]='R';
					nextchar=arr[i];
					stack.pop();
					i--;
				}
				previouschar=arr[index];
			}
			index++;
		}
		if(stack.size()>0 && previouschar!=' ')
		{
			int i=(n-stack.size());
			while(i<=(n-1) && stack.size()>0)
			{
				if(previouschar=='R')
				{
					arr[i]='B';
				}
				else
					arr[i]='R';
				previouschar=arr[i];
				stack.pop();
				i++;
			}
		}
		else if(stack.size()>0)
		{
			int i=1;
			arr[0]='R';
			previouschar='R';
			while(i<=(n-1) && stack.size()>0)
			{
				if(previouschar=='R')
				{
					arr[i]='B';
				}
				else
					arr[i]='R';
				previouschar=arr[i];
				stack.pop();
				i++;
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int size=sc.nextInt();
			char arr[]=sc.next().toCharArray();
			convert_To_Near_Perfect(arr);
			System.out.println(new String(arr));
		}
		
	}
}