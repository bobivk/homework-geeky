package geekycamp;

import java.util.Scanner;

public class patternMatcher {

	public static boolean strcompare(char[] S, String[] P, int lengthP, boolean allstars) {
		int count = 0;
		if(allstars == true) return true;
		for (int i = 0; i < P.length; i++) { // p split *
			char[] temp = P[i].toCharArray();
			for (int b = 0; b < temp.length; b++) { // cycle P (temp)
				for (int j = 0; j < S.length; j++) { // cycle S
					if (temp[b] == S[j] || temp[b] == '?') {
						count++;
						if(b<temp.length -1)b++;
					}
				}
			}
		}
		if (count == lengthP) return true;
		return false;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String alo = scan.nextLine();
		String[] str = alo.split(" ");
		char[] S = str[0].toCharArray();
		char[] Plength = str[1].toCharArray();
		int lengthP = Plength.length;
		int allstar = 0;
		boolean allstars = false;
		for (int i = 0; i < lengthP; i++) {
			if (Plength[i] == '*') {
				Plength[i] = ' ';
				allstar++;
				if (lengthP!= 1) lengthP--;
				if(allstar >= lengthP)allstars = true;
				
			}
		}
		String Ptr = String.valueOf(Plength);
		String[] P = Ptr.split(" ");
		if (strcompare(S, P, lengthP, allstars)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		scan.close();
	}
}
