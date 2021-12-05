import java.util.*;
import java.io.*;
class TokitsukazeandEnhancement
{
	public static void main(String[] d)
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		ArrayList<Integer> ar=new ArrayList<>();
		ar.add(1);
		ar.add(3);
		ar.add(2);
		ar.add(0);
		int ans[]=new int[3];
		ans[0]=N%4;
		ans[1]=(N+1)%4;
		ans[2]=(N+2)%4;
		int ans1=0;
		int ans2=0;
		int i=0;
		while(i<3)
		{
			if(i==0)
			{
				ans1=i;
				ans2=ar.indexOf(ans[i]);
			}
			else if(ans2>ar.indexOf(ans[i]))
			{
				ans1=i;
				ans2=ar.indexOf(ans[i]);
			}
			i++;
		}
		System.out.println(ans1+" "+(char)(ans2+'A'));
	}
}