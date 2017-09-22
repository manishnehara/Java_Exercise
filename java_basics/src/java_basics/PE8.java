package java_basics;

import java.util.Scanner;

public class PE8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Limit 1-100");
		int i=0;
		while(i==0)
		{
		num=sc.nextInt();
		int target=79;
		if(num>target)
			System.out.println(" Number guessed is more than original number");
		else if(num < target)
			System.out.println(" Number guessed is less than original number");
		else
			{
				System.out.println(" Number guessed matches the original number");
				break;
			}
		}
	}

}
