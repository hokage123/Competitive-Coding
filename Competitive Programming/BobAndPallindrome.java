import java.math.BigInteger;
import java.util.Scanner;
class BobAndPallindrome
{
public static void main(String... s)
{
int T,n,i,j;
BigInteger B,B1=new BigInteger("26"),B2=new BigInteger("1"),B3=new BigInteger("2"),B4=new BigInteger("2"),B5=new BigInteger("1000000007"),B6=new BigInteger("25"),Ans[];
Scanner sc=new Scanner(System.in);
T=sc.nextInt();
Ans=new BigInteger[T];
for(i=0;i<T;i++)
{
n=sc.nextInt();
B=((B3.multiply(B1.pow(n/2+1).subtract(B2))).divide(B6)).subtract(B1.pow(n/2));
if(n%2==0)
B=B.subtract(B2);	
System.out.println(B);
Ans[i]=((B.multiply(B1.pow(n/2).modInverse(B5))).mod(B5));
}
for(i=0;i<T;i++)
System.out.println(Ans[i]);
}
}