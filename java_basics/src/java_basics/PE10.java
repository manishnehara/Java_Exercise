package java_basics;

import java.util.Scanner;

public class PE10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string :");
		String str=sc.nextLine();
		System.out.println("Enter number :");
		int n=sc.nextInt();
		int length=str.length();
		String str1=str.substring(length-n, length);
		for(int i=0;i<n;i++)
		{
			str+=str1;
		}
		System.out.println(str);
	}

}
