import java.util.*;
import java.io.*;
class NQueen
{
	int N,ar[][];
public static void main(String[] s)
{
Scanner sc=new Scanner(System.in);
NQueen nq=new NQueen();
nq.N=sc.nextInt();
nq.ar=new int[nq.N][nq.N];
if(!nq.solvetheprobs(0))
System.out.println("Sorry My Queen");
else
nq.printmyboard();
}
boolean solvetheprobs(int col)
{
if(col>=N)
return true;
for(int i=0;i<N;i++)
{
if(queensafe(i,col))
{	
ar[i][col]=1;
if(solvetheprobs(col+1))
return true;
//else backtrack;
ar[i][col]=0;
}
}
return false;
}
boolean queensafe(int row,int col)
{
int i,j;
for(i=0;i<col;i++)
if(ar[row][i]==1)
return false;
for(i=row,j=col;i>=0 && j>=0;i--,j--)
if(ar[i][j]==1)
return false;
for(i=row,j=col;i<N && j>=0;i++,j--)
if(ar[i][j]==1)
return false;
return true;
}
 void printmyboard()
{
int i,j;
for(i=0;i<N;i++)
{
for(j=0;j<N;j++)
{
System.out.print(ar[i][j]+" ");
}
System.out.println();
}
}
}