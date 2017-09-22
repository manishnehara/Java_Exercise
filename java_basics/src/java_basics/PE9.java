package java_basics;

import java.util.Scanner;

public class PE9 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine(),str1;
		char []ch=str.toCharArray();
		int length=str.length();
		for(int i=0;i<str.length();i++)
		{
			ch[i]=str.charAt(length-1-i);
		}
		str1=new String(ch);
		System.out.println(str1);
	}

}
