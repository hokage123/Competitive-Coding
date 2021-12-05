import java.util.ArrayList;
import java.util.Scanner;
class MinimumDeletions
{
public static void main(String []s)
{
int N,i,Gcd;
ArrayList<Integer> al=new ArrayList<>();
Scanner sc=new Scanner(System.in);
N=sc.nextInt();
for(i=0;i<N:i++)
al.add(sc.nextInt());
for(i=0;i<N:i++)
{
Gcd=findGCD(al.toArray(),al.size());
if(Gcd==1)
{
break;
}
else
{
if(!isPrime(al.get(i)))
al.remove(i);
}
}
if(al.size()==N && Gcd==1)
System.out.println("0");
else if(al.size()==N || al.size()==0)
System.out.println("-1");
else
System.out.println(al.size());
}
 static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
    static int findGCD(int arr[], int n)
    {
        int result = arr[0];
        for (int i = 1; i < n; i++)
            result = gcd(arr[i], result);
 
        return result;
    }
	static boolean isPrime(int n)
	{
	int i=2;
	for(;i<=Math.sqrt(n);i++)
	{
	if(n%i==0)
	{
	return true;
	}
	}
	return false;
	}
}