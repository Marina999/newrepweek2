package guessinggame;

import java.util.Random;
import java.util.Scanner;

public class guessinggame1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rn = new Random();
		int numberToGuess;
		int numberOfTries=3;
		Scanner input = new Scanner(System.in);
		int guess;
		boolean check=false;
		int number;
		
		
		for(int i =0; i < 100; i++)
		{
			int answer = rn.nextInt(10) + 1;
		 System.out.println(answer);
	}

}
}