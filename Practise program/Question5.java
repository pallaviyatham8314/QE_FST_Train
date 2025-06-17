package Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char c[] = str.toLowerCase().toCharArray();
		List<String> Vowels = new ArrayList<>();
		List<String> Consonents = new ArrayList<>();
		List<String> Punctuations = new ArrayList<>();
		for (char x : c) {
			if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
				Vowels.add(String.valueOf(x));
			} else if (!Character.isAlphabetic(x)) {
				Punctuations.add(String.valueOf(x));
			} else {
				Consonents.add(String.valueOf(x));
			}
		}
		System.out.println("The Vowels in the String is: ");
		for (String x : Vowels)
			System.out.println(x);
		System.out.println("The Consonants in the String is: ");
		for (String x : Consonents)
			System.out.println(x);
		System.out.println("The Punctuations in the String is: ");
		for (String x : Punctuations)
			System.out.println(x);
	}

}