package test;

import java.util.Scanner;

public class GitDemo {

	public int[] displayArray(Scanner input) {
		System.out.println("Enter the size of an array:");
		int size = input.nextInt();
		int[] array = new int[size];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the elements in an array:");
			array[i] = input.nextInt();
		}
		return array;
	}
	
	public void dupArray(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if(ar[i]==ar[j]){
					System.out.println("==========================");
					System.out.println("The duplicate array element is "+ ar[i]);
				}
			}
		}
	}

	public static void main(String[] args) {
		GitDemo obj = new GitDemo();

		int[] arr = obj.displayArray(new Scanner(System.in));
		
		obj.dupArray(arr);
	}
}