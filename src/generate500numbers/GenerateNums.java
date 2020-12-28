package generate500numbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GenerateNums {
	// Practical 1: Generate 500 random numbers and print the nth smallest number in
	// a programming language of your choice. (Ask user for the Nth smallest number)

	public static void main(String[] args) {
		
		Scanner userinput = new Scanner(System.in);
		
		System.out.println("Please enter the Nth smallest number...");
		
		int smallestnth = userinput.nextInt();
		
		System.out.println("----------------------------------------------");
		
		ArrayList<Integer> randnums = new ArrayList<Integer>();
		
		for(int i = 1; i <= 500; i++) {
			randnums.add(numGenerator(smallestnth));
		}
		
		System.out.println("The size of the numbers generated is: " + randnums.size());
		System.out.println("The Nth smallest number is: " + Collections.min(randnums));
		
	}

	public static int numGenerator(int smallestnth) {
		int randnum = (int) ((Math.random() * (1000 - smallestnth)) + smallestnth);
		return randnum;
	}
}
