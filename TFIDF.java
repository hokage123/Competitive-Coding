import java.util.*;
import java.io.*;
class TFIDF
{
	public static void main(String[] s)throws IOException
	{
		double count=0,val,count1=0,count2=0,count3=0;
		int ch,i;
		char d;
		int c[]=new int[7];
		 FileInputStream fin= new FileInputStream("1.txt");//for taking input as byte from 1.txt		 
		  ArrayList<Character> ar1=new ArrayList<>();//for storing the charset of first file
		  ArrayList<Character> ar2=new ArrayList<>();//for storing the charset of second file
		  ArrayList<Character> ar3=new ArrayList<>();//for storing the charset of third file
        while((ch=fin.read())!=-1)
		{			
			d=((char)ch);
			//for removing special characters like,'"{}[]@$
			 if(ch==33 || (ch>=35 && ch<=38) || (ch>=40 && ch<=47 && ch!=45) ||(ch>=58 && ch<=64)||(ch>=91 && ch<=96) || (ch>=123))
			{	
				ar1.add(' ');
				//ar1.add(d);
				ar1.add(' ');
			}
			else if(ch==39 || ch==34)
			{
				ar1.add(' ');
				//ar1.add(d);
				if(ch==34)
					c[1]++;
				else
					c[2]++;
			}
			else
				ar1.add(d);
		}			
		fin= new FileInputStream("2.txt");//for taking input as byte from 2.txt
		while((ch=fin.read())!=-1) 
		{
			d=((char)ch);
			//for removing special characters like,'"{}[]@$
			 if(ch==33 || (ch>=35 && ch<=38)  || (ch>=40 && ch<=47 && ch!=45) ||(ch>=58 && ch<=64)|| (ch>=91 && ch<=96) || (ch>=123))
			{	
				ar2.add(' ');
				//ar2.add(d);
				ar2.add(' ');
			}
			else if(ch==39 || ch==34)
			{
				ar2.add(' ');
				//ar1.add(d);
				if(ch==34)
					c[3]++;
				else
					c[4]++;
			}
			else
            ar2.add(d);
		}
        fin= new FileInputStream("3.txt");//for taking input as byte from 3.txt
		while((ch=fin.read())!=-1) 
		{
			d=((char)ch);
			//for removing special characters like,'"{}[]@$
			 if(ch==33 || (ch>=35 && ch<=38) || (ch>=40 && ch<=47 && ch!=45) ||(ch>=58 && ch<=64) || (ch>=91 && ch<=96) || (ch>=123))
			{	
				ar3.add(' ');
				//ar3.add(d);
				ar3.add(' ');
			}
			else if(ch==39 || ch==34)
			{
				ar3.add(' ');
				//ar1.add(d);
				if(ch==34)
					c[5]++;
				else
					c[6]++;
			}
			else
            ar3.add(d);
			
		}
		char ch1[]=new char[ar1.size()];//for storing charset from 1.txt in array
		char ch2[]=new char[ar2.size()];//for storing charset from 2.txt in array
		char ch3[]=new char[ar3.size()];//for storing charset from 3.txt in array
		for(i=0;i<ar1.size();i++)
			ch1[i]=ar1.get(i);
		for(i=0;i<ar2.size();i++)
			ch2[i]=ar2.get(i);
		for(i=0;i<ar3.size();i++)
			ch3[i]=ar3.get(i);
		String s1=new String(ch1);//converting array in string
		s1=s1.toLowerCase();//converting every alphabet to lowercase Apple appLE is not different
		String s2=new String(ch2);
		s2=s2.toLowerCase();
		String s3=new String(ch3);
		s3=s3.toLowerCase();
		String strarr1[]=s1.split("[ \n\t]");//for storing string words in stringarray for 1.txt
		String strarr2[]=s2.split("[ \n\t]");//for storing string words in stringarray for 2.txt
		String strarr3[]=s3.split("[ \n\t]");//for storing string words in stringarray for 3.txt
		HashMap<String,Double> hm1=new HashMap<>();
		HashMap<String,Double> hm2=new HashMap<>();
		HashMap<String,Double> hm3=new HashMap<>();
		HashSet<String> hs=new HashSet<>();//HashSet for IDF
		HashSet<String> hs1=new HashSet<>();//HashSet of pronouns,verbs,conjunction,prepositions 
		hs1.add("is");
		hs1.add("am");
		hs1.add("are");
		hs1.add("was");
		hs1.add("were");
		hs1.add("be");
		hs1.add("being");
		hs1.add("been");
		hs1.add("have");
		hs1.add("has");
		hs1.add("had");
		hs1.add("do");
		hs1.add("does");
		hs1.add("did");
		hs1.add("shall");
		hs1.add("will");
		hs1.add("should");
		hs1.add("would");
		hs1.add("may");
		hs1.add("might");
		hs1.add("must");
		hs1.add("can");
		hs1.add("could");
		hs1.add("i");
		hs1.add("you");
		hs1.add("he");
		hs1.add("she");
		hs1.add("it");
		hs1.add("they");
		hs1.add("my");
		hs1.add("mine");
		hs1.add("his");
		hs1.add("her");
		hs1.add("hers");
		hs1.add("its");
		hs1.add("me");
		hs1.add("you");
		hs1.add("him");
		hs1.add("it");
		hs1.add("that");
		hs1.add("another");
		hs1.add("each");
		hs1.add("everything");
		hs1.add("nobody");
		hs1.add("either");
		hs1.add("someone");
		hs1.add("myself");
		hs1.add("yourself");
		hs1.add("himself");
		hs1.add("herself");
		hs1.add("itself");
		hs1.add("this");
		hs1.add("for");
		hs1.add("and");
		hs1.add("or");
		hs1.add("nor");
		hs1.add("but");
		hs1.add("yet");
		hs1.add("so");
		hs1.add("about");
		hs1.add("above");
		hs1.add("according");
		hs1.add("to");
		hs1.add("across");
		hs1.add("after");
		hs1.add("against");
		hs1.add("ahead");
		hs1.add("of");
		hs1.add("along");
		hs1.add("admist");
		hs1.add("among");
		hs1.add("amongst");
		hs1.add("apart");
		hs1.add("from");
		hs1.add("around");
		hs1.add("as");
		hs1.add("far");
		hs1.add("well");
		hs1.add("aside");
		hs1.add("at");
		hs1.add("because");
		hs1.add("before");
		hs1.add("behind");
		hs1.add("below");
		hs1.add("beneath");
		hs1.add("beside");
		hs1.add("besides");
		hs1.add("between");
		hs1.add("beyond");
		hs1.add("by");
		hs1.add("means");
		hs1.add("concerning");
		hs1.add("despite");
		hs1.add("down");
		hs1.add("due");
		hs1.add("during");
		hs1.add("case");
		hs1.add("inside");
		hs1.add("instead");
		hs1.add("into");
		hs1.add("except");
		hs1.add("excluding");
		hs1.add("following");
		hs1.add("since");
		hs1.add("of");
		hs1.add("on");
		hs1.add("behalf");
		hs1.add("before");
		HashMap<String,Double> hm4=new HashMap<>();//hashMap for IDF storage
		for(i=0;i<strarr1.length;i++)
		{
			//removing all verb,conjunction,pronoun,prpositions,wh words as well as counting frequency of keyword from 1.txt 
			if(strarr1[i].length()>1 && !(strarr1[i].charAt(0)=='w' && strarr1[i].charAt(1)=='h') && !hs1.contains(strarr1[i]))
			{	
				if(!hm1.containsKey(strarr1[i]))
					hm1.put(strarr1[i],1.0);
				else
					hm1.put(strarr1[i],(hm1.get(strarr1[i])+1.0));
				hs.add(strarr1[i]);
			}
		}
		for(i=0;i<strarr2.length;i++)
		{
			//removing all verb,conjunction,pronoun,prpositions,wh words as well as counting frequency of keyword from 2.txt
			if(strarr2[i].length()>1 && !(strarr2[i].charAt(0)=='w' && strarr2[i].charAt(1)=='h') && !hs1.contains(strarr2[i]))
			{	
				if(!hm2.containsKey(strarr2[i]))
					hm2.put(strarr2[i],1.0);
				else
					hm2.put(strarr2[i],(hm2.get(strarr2[i])+1.0));
				hs.add(strarr2[i]);
			}
		}
		for(i=0;i<strarr3.length;i++)
		{
			//removing all verb,conjunction,pronoun,prpositions,wh words as well as counting frequency of keyword from 3.txt
			if(strarr3[i].length()>1 && !(strarr3[i].charAt(0)=='w' && strarr3[i].charAt(1)=='h') && !hs1.contains(strarr3[i]))
			{
				if(!hm3.containsKey(strarr3[i]))
					hm3.put(strarr3[i],1.0);
				else
				hm3.put(strarr3[i],(hm3.get(strarr3[i])+1.0));
			hs.add(strarr3[i]);
			}
		}
		for(String j:hs)
		{
			//storing IDF for all keywords
			//count1 count keywords of 1.txt
			//count2 count keywords of 2.txt
			//count3 count keywords of 3.txt
			count=0;
			if(hm1.containsKey(j))
			{
				count++;
				count1+=hm1.get(j);
			}
			if(hm2.containsKey(j))
			{
				count++;
				count2+=hm2.get(j);
			}
			if(hm3.containsKey(j))
			{
				count++;
				count3+=hm3.get(j);
			}
			hm4.put(j,(Math.log(3.0/count)));
		}
		/*for(Map.Entry<String,Double> e:hm4.entrySet())
		{
			String key=e.getKey();
			 val=e.getValue();
			System.out.println(key+" "+val);
		}*/
		System.out.println("Ihe TF-IDF of 1.txt");
		for(Map.Entry<String,Double> e:hm1.entrySet())
		{
			String key=e.getKey();
			 val=e.getValue();
			val*=hm4.get(key);
			val/=(count1);
			System.out.println(key+" "+val);
		}
		/*if(c[1]>0)
		{
			count=1;
			if(c[3]>0)
				count++;
			if(c[5]>0)
				count++;
			val=c[1];
			val*=Math.log(3.0/count);
			val/=(strarr1.length+c[1]+c[2]);
			System.out.println(((char)34)+" "+val);
		}
		if(c[2]>0)
		{
			count=1;
			if(c[4]>0)
				count++;
			if(c[6]>0)
				count++;
			val=c[2];
			val*=Math.log(3.0/count);
			val/=(strarr1.length+c[1]+c[2]);
			System.out.println(((char)39)+" "+val);
		}*/
		System.out.println("Ihe TF-IDF of 2.txt");
		for(Map.Entry<String,Double> e:hm2.entrySet())
		{
			String key=e.getKey();
			 val=e.getValue();
			val*=hm4.get(key);
			val/=(count2);
			System.out.println(key+" "+val);
		}
		/*if(c[3]>0)
		{
			count=1;
			if(c[1]>0)
				count++;
			if(c[5]>0)
				count++;
			val=c[3];
			val*=Math.log(3.0/count);
			val/=(strarr2.length+c[3]+c[4]);
			System.out.println(((char)34)+" "+val);
		}
		if(c[4]>0)
		{
			count=1;
			if(c[2]>0)
				count++;
			if(c[6]>0)
				count++;
			val=c[4];
			val*=Math.log(3.0/count);
			val/=(strarr2.length+c[3]+c[4]);
			System.out.println(((char)39)+" "+val);
		}*/
		System.out.println("Ihe TF-IDF of 3.txt");
		for(Map.Entry<String,Double> e:hm3.entrySet())
		{
			String key=e.getKey();
			val=e.getValue();
			val*=hm4.get(key);
			val/=(count3);
			System.out.println(key+" "+val);
		}
		/*if(c[5]>0)
		{
			count=1;
			if(c[1]>0)
				count++;
			if(c[3]>0)
				count++;
			val=c[5];
			val*=Math.log(3.0/count);
			val/=(strarr3.length+c[5]+c[6]);
			System.out.println(((char)34)+" "+val);
		}
		if(c[6]>0)
		{
			count=1;
			if(c[2]>0)
				count++;
			if(c[4]>0)
				count++;
			val=c[6];
			val*=Math.log(3.0/count);
			val/=(strarr3.length+c[5]+c[6]);
			System.out.println(((char)39)+" "+val);
		}*/
		fin.close();
	}
}