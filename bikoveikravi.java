//package homework;
import java.util.Scanner;
public class bikoveikravi {
	
	/*public static boolean krava(int a, int[] number){
		for(int i = 0; i < 4; i++){
			
		}
		return false;
		
	}
	*/
	public static void main(String[] args) {
		int num = (int)(Math.random() * (9000)+ 1000);
		String number = Integer.toString(num);
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

}
