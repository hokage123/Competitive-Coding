import java.util.*;
import java.io.*;
class GoldenPlate
{
public static void main(String[] r)
{
int w,h,k,i=1,count=0,ans=0;
Scanner sc=new Scanner(System.in);
w=sc.nextInt();
h=sc.nextInt();
k=sc.nextInt();
while((i-1<=(w/4)) && (i-1<=(h/4)))
{
ans+=((2*(w+h-(8*(i-1))))-4);
count++;
if(count==k)
break;
i++;
}
System.out.println(ans);
}
}