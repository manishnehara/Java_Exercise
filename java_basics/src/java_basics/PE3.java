package java_basics;


import java.util.Arrays;
import java.util.Scanner;

public class PE3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		str=sc.next();
		char[] ch=str.toCharArray();
		int length=str.length();
		char[] vowels= {'a','e','i','o','u','A','E','I','O','U'};
		String str_vowel=new String(vowels);
		System.out.println(str_vowel);
		for(int i=0;i<length;i++)
		{
			if(Character.isLetter(ch[i]))
			{	
				if(str_vowel.indexOf(ch[i] ) < 0)
				{
					System.out.println(ch[i]+" - consonant");
				}
				else
				{
					System.out.println(ch[i]+" - vowel");
				}
			}
			else
				System.out.println("Error");
					
		}

	}

	

	
}
