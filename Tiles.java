import java.util.*;
import java.io.*;
import java.math.*;
class Tiles
{
	public static void main(String[] s)
	{
		int w,h;
		BigInteger l=new BigInteger("998244353");
		Scanner sc=new Scanner(System.in);
		w=sc.nextInt();
		h=sc.nextInt();
		BigInteger two=new BigInteger("2");
	if(w>h)
	BigInteger sum=two.pow((w*h)-(w-h));
	else if(w=<h)
		BigInteger sum=two.pow((w*h)-(h-w));
	BigInteger mod=sum.mod(l);
		System.out.println(mod.toString());
	}
}