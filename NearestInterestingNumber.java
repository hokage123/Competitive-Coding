import java.io.*;
import java.util.*;
public class NearestInterestingNumber
{
    public static void main(String[] f)
    {
        int T,N,M,sumdigi=0,x;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        while(true)
		{
			sumdigi=0;
			M=N;
        while(M!=0)
        {
            sumdigi+=(M%10);
            M/=10;
        }
		if(sumdigi%4==0)
		{
			System.out.println(N);
			break;
		}
		N++;
		}
    }
}