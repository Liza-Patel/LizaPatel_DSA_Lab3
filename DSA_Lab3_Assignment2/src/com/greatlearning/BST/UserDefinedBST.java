package com.greatlearning.BST;

import java.util.ArrayList;
import java.util.Scanner;

public class UserDefinedBST {

	static ArrayList<Integer> nodeList = new ArrayList<>();

	public static void main(String[] args) {
		Node root = null;
		Node nn;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number of Nodes: ");
		int size = scan.nextInt();

		int data;
		for (int i = 1; i <= size; i++) {
			System.out.println("Enter data for node " + i + ": ");
			data = scan.nextInt();
			nn = new Node(data);
			if (root == null) {
				root = nn;
			} else {
				insert(root, nn);
			}
		}

		inOrder(root);
		System.out.println(nodeList);

		System.out.println("Enter Sum: ");
		int sum = scan.nextInt();

		int n1;
		int n2;
		int flag = 0;
		for (int j = 0; j < nodeList.size() - 1; j++) {
			n1 = nodeList.get(j);
			n2 = sum - n1;
			if (nodeList.contains(n2)) {
				System.out.println("Pair Found[" + n1 + "," + n2 + "]");
				flag = 1;
				break;
			}
		}
		if (flag == 0) {

			System.out.println("Pair Not Found");

		}

		scan.close();

	}

	private static void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			nodeList.add(root.data);
			inOrder(root.right);
		}
	}

	private static void insert(Node root, Node newNode) {
		if (newNode.data > root.data) {
			if (root.right == null) {
				root.right = newNode;
			} else {
				insert(root.right, newNode);
			}
		} else {
			if (root.left == null) {
				root.left = newNode;
			} else {
				insert(root.left, newNode);
			}
		}

	}
}
