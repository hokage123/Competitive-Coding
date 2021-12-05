import java.io.*;
import java.util.*;
class BadShuffle
{
 static String str="";
 static HashMap<String,Integer> hm=new HashMap<>();
 public static void main(String[] args) {
int i; 
 Scanner sc=new Scanner(System.in);
  int N=sc.nextInt();
  for(i=1;i<=N;i++)
	  str+=i;
  printPermutationOfStrings(str);
  int min=Collections.min(hm.values());
  int max=Collections.max(hm.values());
	
  for(Map.Entry<String,Integer> s:hm.entrySet())
  {
	  if(s.getValue().equals(min))
		  System.out.println("mymin"+s.getKey());
	  if(s.getValue().equals(max))
		  System.out.println("mymax"+s.getKey());
	  }
 }
  
 private static void printPermutationOfStrings(String str){
  printPermutation(str, "");
 }
  
 private static void printPermutation(String str, String stringForIndex){
  if(stringForIndex.length()==str.length()){
   rand(stringForIndex);
   return;
  }
  for (int i = 0; i < str.length(); i++) {
   printPermutation(str, stringForIndex + str.charAt(i));
  }
 }
 private static void rand(String stringForIndex)
 {
	 int i;
	 char cv;
	 char ch2[]=str.toCharArray();
	 char ch[]=stringForIndex.toCharArray();
	for(i=1;i<=ch.length;i++)
	{
		cv=ch2[i-1];
		ch2[i-1]=ch2[ch[i-1]-49];
		ch2[ch[i-1]-49]=cv;
	}
	String s1=new String(ch2);
	if(hm.containsKey(s1))
		hm.put(s1,(hm.get(s1)+1));
	else
		hm.put(s1,1);
 } 
}