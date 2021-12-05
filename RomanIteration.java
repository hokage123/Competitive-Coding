import java.util.*;
import java.io.*;
class RomanIteration
{
static String intToRoman(int num)  
{    
     String m[] = {"", "M", "MM", "MMM"}; 
     String c[] = {"", "C", "CC", "CCC", "CD", "D",  
                        "DC", "DCC", "DCCC", "CM"}; 
     String x[] = {"", "X", "XX", "XXX", "XL", "L",  
                        "LX", "LXX", "LXXX", "XC"}; 
     String i[] = {"", "I", "II", "III", "IV", "V",  
                        "VI", "VII", "VIII", "IX"}; 
           
     String thousands = m[num/1000]; 
     String hundereds = c[(num%1000)/100]; 
     String tens =  x[(num%100)/10]; 
     String ones = i[num%10]; 
          
     String ans = thousands + hundereds + tens + ones; 
          
     return ans; 
}  
static long romantoint(String f,int base)
{
	char ch[]=f.toCharArray();
	int count=0;
	long ans=0;
	for(int i=(ch.length-1);i>=0;i--)
	{
		ans+=((ch[i]-'A'+10)*(Math.pow(base,count)));
		count++;
	}
	return ans;
}
	 public static void main(String[] d)
	 {
		 long num;
		 int base=0;
		 String f;
		 Scanner sc=new Scanner(System.in);
		 num=sc.nextInt();
	 while(num<=(3999))
		 {
			 
			 f=intToRoman((int)num);
			 System.out.println(f);
			 base=(f.charAt(0)-'A'+10);
			 num=romantoint(f,base);
		 }
		 System.out.print(num+" ");
	 }
	 
}