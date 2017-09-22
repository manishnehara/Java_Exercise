package java_basics;


import java.util.Scanner;

public class PE2 {

	public static void main(String[] args) {
		Long num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextLong();
		if(num>20 && num<30)
		{
			if(num%2 != 0)
				System.out.println("Tom");
			else if(num%2==0)
				System.out.println("Jerry");

	}

}

}
