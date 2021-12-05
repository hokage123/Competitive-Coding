import java.util.ArrayList;
import java.util.Scanner;
class DynamicArray
{
public static void main(String[] f)
{
	Integer m;
int N,Q,Qnum,x,y,i,lastAnswer=0;
Scanner sc=new Scanner(System.in);
N=sc.nextInt();
Q=sc.nextInt();
ArrayList S[]=new ArrayList[N];
ArrayList<Integer> lst=new ArrayList<Integer>();
    for(i=0;i<N;i++)
    S[i]=new ArrayList<Integer>();   
    for(i=0;i<Q;i++)
{
Qnum=sc.nextInt();
x=sc.nextInt();
y=sc.nextInt();
if(Qnum==1)
{
	m=y;
 S[(x^lastAnswer)%N].add(m); 
}
    else if(Qnum==2)
 {
 lastAnswer=(Integer)S[(x^lastAnswer)%N].get(y%(S[(x^lastAnswer)%N].size()));
 lst.add(lastAnswer);
 }
}
    for(Integer lastAns:lst)
     System.out.println(lastAns.intValue());   
}
}