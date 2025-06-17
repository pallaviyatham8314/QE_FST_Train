package Examples;

import java.util.Scanner;

public class Question2 {
	static int binarySearch(int left, int right, int key, int[] arr) {
		if (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] == key)
				return mid;
			if (key < arr[mid])
				return binarySearch(left, mid - 1, key, arr);
			return binarySearch(mid + 1, right, key, arr);
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// logic for binary search
		Scanner sc = new Scanner(System.in);
		int arr[] = { 1, 3, 4, 6, 8, 9 };
		int key = sc.nextInt();
		int res = binarySearch(0, arr.length - 1, key, arr);
		if (res != -1) {
			System.out.println("The key is in the position: " + res);
		} else {
			System.out.println("Key not found");
		}
	}

}