import java.util.Arrays;

public class StringClass {

	public static void main(String[] args) {
	    
	   
		char[] c= {'a','l','i','c','e'};
		String s3=new String(c);
		byte[] z= {10,65,97,20};
		String s4=new String(z);
		System.out.println(s3);
		System.out.println(s4);
		
		//string concatenation
		
		String s1="xyz";
		String s2=new String("abc");
		System.out.println(s1+s2);


		
		
		//StringBuffer
		 
		StringBuffer sb=new StringBuffer("Richard");
		System.out.println(sb);
		String s=new String(sb);
		System.out.println(s);
		System.out.println(s.charAt(2));
		System.out.println(s.length());
		
		
		
        // converting lowercase to uppercase
		String x="varsha";
		String y="";
		for(int i=0;i<x.length();i++) {
			y+=(char)(x.charAt(i)-32);
			
		}
		System.out.println(y);
		
		
		// converting uppercase to lowercase
		String str1="ZODIAC";
		String str2="";
		for(int i=0;i<str1.length();i++) {
			str2+=(char)(str1.charAt(i)+32);
			
		}
		System.out.println(str2);
	

		
		//Case conversion of each character in a string
		String xx="cONsTrUct";
		String yy="";
		for(int i=0;i<xx.length();i++) {
			if(xx.charAt(i)>='a' && xx.charAt(i)<='z') {
				yy+=(char)(xx.charAt(i)-32);
			}
			else {
				yy+=(char)(xx.charAt(i)+32);
			}
		}
		System.out.println(yy);

		
		//Reversing a string
		
		String aa="Project Proposal";
		String bb="";
		for(int i=(aa.length())-1;i>=0;i--) {
			bb+=aa.charAt(i);
		}
		System.out.println(bb);
	

	
		String str="Project Proposal";
		String res="";
		String[] cc=str.split(" ");
		
		for(int j=0;j<cc.length;j++) {
			for(int i=cc[j].length()-1;i>=0;i--) {
				res+=cc[j].charAt(i);
		}
			res=res+" ";
		}
		System.out.println(res);
	

		
		String xxx="Color Water";
		String result="";
		String[] string=xxx.split(" ");
		for(int i=string.length-1;i>=0;i--) {
			result+=string[i];
			result+=" ";
		}
		System.out.println(result);
	

		
		//Palindrome
		
		String p1="madam";
		String p2="";
		for(int i=(p1.length())-1;i>=0;i--) {
			p2+=p1.charAt(i);
		}
		System.out.println(p1);
		System.out.println(p2);
		if(p1.equals(p2))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	

		
	
		
		
		//Anagram

		String a1="D Neelima";
		String a2="Malinee D";
		
		a1=a1.replace(" ", "");
		a2=a2.replace(" ", "");
		
		a1=a1.toLowerCase();
		a2=a2.toLowerCase();
		
		char[] c1=a1.toCharArray();
		char[] c2=a2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c1, c2))
			
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
			
		
	
		

		//Panagram

		String p="a quick brown fox jumps over the lazy dog";
		p=p.replace(" ", "");
		p=p.toUpperCase();
		char[] ch=p.toCharArray();
		int[] k=new int[26];
		boolean bool=true;
		for(int i=0;i<ch.length;i++) {
			int idx=ch[i]-65;
			k[idx]=k[idx]+1;
		}
		for(int j=0;j<k.length;j++) {
			if(k[j]==0) {
				System.out.println("Not Panagram");
				bool=false;
		}
		}
		if(bool==true)
			System.out.println("Panagram");
		}
	}
		
		
	
