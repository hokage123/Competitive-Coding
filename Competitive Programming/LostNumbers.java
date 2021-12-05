import java.io.*;
import java.util.*;
class LostNumbers
{
	public static void main(String[] s)
	{
		int b,c,i;
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(4);
		ar.add(8);
		ar.add(15);
		ar.add(16);
		ar.add(23);
		ar.add(42);
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> br=new ArrayList<Integer>();
		System.out.println("? 1 1");
		int a=(int)(Math.sqrt(sc.nextInt()));
		br.add(a);
		ar.remove(ar.indexOf(a));
		System.out.println("? 2 2");
		 a=(int)(Math.sqrt(sc.nextInt()));
		br.add(a);
		ar.remove(ar.indexOf(a));
		System.out.println("? 3 4");
		 a=sc.nextInt();
		System.out.println("? 3 5");
		b=sc.nextInt();
		for(i=0;i<ar.size();i++)
		{
			c=ar.get(i);
			if(a%c==0 && b%c==0 && ar.contains(b/c) && ar.contains(a/c))
			{
				br.add(c);
				br.add(a/c);
				br.add(b/c);
				ar.remove(ar.indexOf(a/c));
				ar.remove(ar.indexOf(c));
				ar.remove(ar.indexOf(b/c));
				break;
			}
		}
		br.add(ar.get(0));
		System.out.print("! ");
		for(int r:br)
		{
			System.out.print(r+" ");
		}
	}
}