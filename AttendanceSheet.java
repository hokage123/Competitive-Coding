import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
class AttendanceSheet
{
public static void main(String[] s)
{
	char ch[];
	Scanner sc=new Scanner(System.in);
String teachers,students[];
int stusize=0,N,i,j,z=0,size=0;
N=sc.nextInt();
sc.nextLine();
students=new String[N];
for(i=0;i<N;i++)
students[i]=sc.nextLine();
teachers=sc.nextLine();
ch=teachers.toCharArray();
for(i=0;i<N;i++)
{
for(j=0;j<students[i].length();j++)
{
	Arrays.sort(ch);
	z=Arrays.binarySearch(ch,students[i].charAt(j));
	if(z!=-1)
		ch[z]='0';
	else
		stusize++;
}
}
for(i=0;i<ch.length;i++)
if(ch[i]!='0')
	size++;
if(stusize<=size)
System.out.print(stusize);
else
System.out.print("-1");
}
}