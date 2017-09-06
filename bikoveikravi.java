package Cowsandbulls;
import java.util.Scanner;

public class bikoveikravi {
	
	public static void main(String[] args) {
		for(int a = 0; a < 20; a++){
			char[] num = NumGenerator.generateChar();
			for(int i = 0; i < num.length; i++){
				System.out.print(num[i]);
			}
		}
	}
	/*	
		//String number = Integer.toString(num);
		Scanner s = new Scanner(System.in);
		boolean guessed = false;
		while(!guessed){
			String guess = s.nextLine();
			int kravi = 0;
			int bikove = 0;
			for(int i = 0; i < 3; i++){
				for(int j = 0; j < 3; j++){
					if(guess.charAt(i) == number.charAt(j)){
						if(i == j)bikove++;
						else kravi++;
					}
				}
			}
			if(bikove == 4) guessed = true;
			else {
				System.out.println("Kravi: " + kravi);
				System.out.println("Bikove: " + bikove);
				System.out.println("Opitai pak!");
			}
		}
		if(guessed) System.out.println("Pozdravlenia, specheli!");
	}
	*/

}
