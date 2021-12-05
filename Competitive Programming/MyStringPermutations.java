import java.util.*;
import java.io.*;
class MyStringPermutations 
{

     public static void main(String []args){
     int T,i;
     String S[];
     Scanner sc=new Scanner(System.in);
     T=sc.nextInt();
     S=new String[T];
     for(i=0;i<T;i++)
         S[i]=sc.next();
    for(i=0;i<T;i++)
      myperm(0,S[i].toCharArray());   
         
     }
     static void myperm(int m,char c[])
     {
		 int i;
         char r;
         if(m==(c.length-1))
         System.out.println(new String(c));
         else
         {
         for(i=m;i<c.length;i++)
         {
             r=c[m];
             c[m]=c[i];
             c[i]=r;
            myperm(m+1,c);
             r=c[m];
             c[m]=c[i];
             c[i]=r;
         }
         }
     }
}