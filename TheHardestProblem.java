import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
class TheHardestProblem
{
public static void main(String... s)
{
int T,N=0,S[],K,i,j,maxprime;
String P[];
Scanner sc=new Scanner(System.in);
T=sc.nextInt();
P=new String[T];
for(i=0;i<T;i++)
{
N=sc.nextInt();
K=sc.nextInt();
S=new int[N];
for(j=0;j<N;j++)
S[j]=sc.nextInt();
	maxprime=maxPrimeFactors(findGCD(S,S.length));
	if(maxprime<=K)
		P[i]="YES";
	else
		P[i]="NO";
	
}
for( i=0;i<T;i++)
	System.out.println(P[i]);
}
 static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
 
    // Function to find gcd of array of
    // numbers
    static int findGCD(int arr[], int n)
    {
        int result = arr[0];
        for (int i = 1; i < n; i++)
            result = gcd(arr[i], result);
 
        return result;
    }
	static int maxPrimeFactors( int n)
{
    // Initialize the maximum prime
    // factor variable with the 
    // lowest one
    int maxPrime = -1;
 
    // Print the number of 2s
    // that divide n
    while (n % 2 == 0) {
        maxPrime = 2;
         
        // equivalent to n /= 2
        n >>= 1; 
    }
 
    // n must be odd at this point,
    // thus skip the even numbers 
    // and iterate only for odd
    // integers
    for (int i = 3; i <= Math.sqrt(n); i += 2) {
        while (n % i == 0) {
            maxPrime = i;
            n = n / i;
        }
    }
 
    // This condition is to handle 
    // the case when n is a prime 
    // number greater than 2
    if (n > 2)
        maxPrime = n;
 
    return maxPrime;
}
}