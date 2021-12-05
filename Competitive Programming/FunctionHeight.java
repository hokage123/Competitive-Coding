import java.util.*;
import java.io.*;
class  FunctionHeight
{
	public static void main(String[] s)
	{
		long n,k;
		Scanner sc=new Scanner(System.in);
		n=sc.nextLong();
		k=sc.nextLong();
		long div=(k/n);
		long rem=(k%n);	
		if(div==0 && rem!=0)
			System.out.println(1);
		else
			System.out.println(div);
		
	}
}