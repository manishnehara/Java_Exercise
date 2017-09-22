package java_basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class PE7 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		num=sc.nextInt();
		int count=0,i=0;
		int tmp=num;
		

		while(tmp!=0)
		{
			tmp/=10;
			count++;
		}
		int []a=new int[count];
		int sum=0;
		while(num!=0)
		{
			a[i]=num%10;
			num/=10;
			if(a[i]%2==0)
			sum+=a[i];
			i++;
		}
		Arrays.sort(a);
	
		System.out.print("Sorted number in non-increasing order :");
		for(i=count-1;i>=0;i--)
		System.out.print(a[i]);
		System.out.println();
		System.out.println("Sum of even numbers :"+sum);
		if(sum>15)
			System.out.println("True");
		else
			System.out.println("False");
	}

}
