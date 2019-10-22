package com.exercise14ternarianoperator;
import java.util.Scanner;
public class Ternarian {

	public static void main(String[] args) {
		int num1=0;
		String msg="";
		
		Scanner input =  new Scanner(System.in);
		System.out.println("Give a number:");
		
		num1 = input.nextInt();
		
		//(Evaluación)?True:False;
		System.out.println(num1>5?"greater":"lower");
		
		msg = (num1>5)?"Number greater than 5": "number lower than 5";
		//num1>5?msg";:System.out.println("Number less than 5");
	}

}
