package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.services.VerifyBrackets;

public class BalancingBrackets {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a string of brackets: ");
		String input = scan.next();

		VerifyBrackets vb = new VerifyBrackets();

		if (input.length() % 2 == 1) {
			System.out.println("The entered String does not contain Balanced Brackets");
		} else {
			if (vb.isBalanced(input)) {
				System.out.println("The entered String has Balanced Brackets");
			} else {
				System.out.println("The entered String does not contain Balanced Brackets");
			}
		}

		scan.close();
	}

}
