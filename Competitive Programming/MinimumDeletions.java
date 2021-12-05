import java.util.ArrayList;
import java.util.Scanner;
class MinimumDeletions
{
public static void main(String []s)
{
int N,T,i,Gcd=0,a[],j;
ArrayList<Integer> al;
Scanner sc=new Scanner(System.in);
T=sc.nextInt();
a=new int[T];
for(j=0;j<T;j++)
{	
N=sc.nextInt();
al=new ArrayList<>();
for(i=0;i<N;i++)
al.add(sc.nextInt());
Gcd=findGCD(al.toArray(),al.size());
if(Gcd==1)
a[j]=0;
else
a[j]=-1;	
}
for(j=0;j<T;j++)
	System.out.println(a[j]);
}
 static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
    static int findGCD(Object arr[], int n)
    {
        int result = (Integer)arr[0];
        for (int i = 1; i < n; i++)
            result = gcd((Integer)arr[i], result);
 
        return result;
    }
	
}