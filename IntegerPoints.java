import java.util.*;
import java.io.*;
 class IntegerPoints
 {
	 public static void main(String[] o)
	 {
		 int t,n,m,a,i,j;
		 long odd1,odd2,even1,even2,sum;
		 Scanner sc=new Scanner(System.in);
		 t=sc.nextInt();
		 for(i=0;i<t;i++)
		 {
			 odd1=0;
			 odd2=0;
			 even1=0;
			 even2=0;
			 sum=0;
			 n=sc.nextInt();
			 for(j=0;j<n;j++)
			 {
				 a=sc.nextInt();
				 if(a%2==0)
					 even1++;
				 else
					 odd1++;
			 }
			 m=sc.nextInt();
			 for(j=0;j<m;j++)
			 {
				 a=sc.nextInt();
				 if(a%2==0)
					 even2++;
				 else
					 odd2++;
			 }
			 sum=((even1*even2)+(odd1*odd2));
			 System.out.println(sum);
		 }
	 }
 }