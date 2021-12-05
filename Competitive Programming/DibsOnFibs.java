import java.util.Scanner;
class DibsOnFibs
{
	//static int f[];	
public static void main(String[] d)
{
int T,N,M,i,j,k,l,p;
long A[],B[],res[],fib[],arr=0,result=0;
long l1=1000000007L;
Scanner sc=new Scanner(System.in);
T=sc.nextInt();
res=new long[T];
//f=new int[100000];
for(i=0;i<T;i++)
{
result=0;	
M=sc.nextInt();
N=sc.nextInt();
A=new long[M];
B=new long[M];
for(j=0;j<M;j++)
A[j]=sc.nextLong();
for(j=0;j<M;j++)
B[j]=sc.nextLong();
for(j=0;j<M;j++)
for(k=0;k<M;k++)
{
if(N==1)
arr=A[j];
else if(N==2)
arr=B[k];	
else
{
	fib=new long[N];
	fib[0]=A[j];
	fib[1]=B[k];
	for(p=2;p<N;p++)
	fib[p]=fib[p-1]+fib[p-2];
	arr=fib[N-1];
}
result+=arr;
result%=l1;
}
res[i]=result;
}
for(i=0;i<T;i++)
System.out.println(res[i]);
}
 /*public static int fib(int n)
    {
    
        if (n == 0)
            return 0;
             
        if (n == 1 || n == 2)
            return (f[n] = 1);
      

        if (f[n] != 0)
            return f[n];
      
        int k = (n & 1) == 1? (n + 1) / 2
                            : n / 2;
      
        // Applyting above formula [Note value
        // n&1 is 1 if n is odd, else 0.
        f[n] = (n & 1) == 1? (fib(k) * fib(k) + 
                        fib(k - 1) * fib(k - 1))
                       : (2 * fib(k - 1) + fib(k)) 
                       * fib(k);
      
        return f[n];
    }*/
}