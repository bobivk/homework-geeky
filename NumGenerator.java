package Cowsandbulls;

public class NumGenerator {
	public static char[] generateChar(){
		char[] number = new char[4];
		//int num = (int)(Math.random() * (9000)+ 1000);
		int i = 1;
		while(i!= number.length){
			char randomChar  = (char) (Math.random() * 10.0);
			boolean repeats = false;
			for(int j = 0; j < number.length; j++){
				if(randomChar == number[j]){
					repeats = true;
				}
			}
			if(!repeats){
				number[i] = (char) randomChar;
				i++;
			}
			repeats = false;
		}
		return number;

	}
}
