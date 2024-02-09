package com.greatlearning.services;

import java.util.Stack;

public class VerifyBrackets {

	public boolean isBalanced(String input) {
		Stack<Character> stack = new Stack<>();

		for (char ch : input.toCharArray()) {
			if (ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
			} else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			} else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			} else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			} else if (ch == ')' || ch == ']' || ch == '}') {
				return false;
			}
		}
		if (stack.isEmpty()) {
			return true;
		} else {
			return false;
		}

	}

}
