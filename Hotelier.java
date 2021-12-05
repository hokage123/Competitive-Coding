import java.util.*;
import java.io.*;
class Hotelier
{
	public static void main(String[] s)
	{
		ArrayList<Integer> ar=new ArrayList<>();
		ar.add(0);
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ar.add(5);
		ar.add(6);
		ar.add(7);
		ar.add(8);
		ar.add(9);
		N=sc.nextInt();
		char ch[]=sc.next().toCharArray();
		char ans[]=new char[10];
		for(int i=0;i<N;i++)
		{
			if(ch[i]='L')
			{
				ans[ar.get(0)]='1';
				ar.remove(0);
			}
			else if(ch[i]='R')
			{
				ans[ar.get(ar.size()-1)]='1';
				ar.remove(ar.size()-1);
			}
			else
			{
				int j=(ch[i]-'0');
				ans[ch[i]-'0']='0';
				ar.add(j);
				Collections.sort(ar);
			}
		}
		String n=new String(ans);
		System.out.println(n);
	}
}