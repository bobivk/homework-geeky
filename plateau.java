package homework;
import java.util.Scanner;
public class plateau {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String alo = s.nextLine();
		char[] balo = alo.toCharArray();
		int count = 1;
		int maxcount = 0;
		for(int i = 1; i < balo.length; i++){
			if(balo[i]==(balo[i-1])){
				count++;
				if(count > maxcount){
					maxcount = count;
				}
			}
			else count = 1;
			if(count > maxcount){
				maxcount = count;
			}
		}
		System.out.println(maxcount);
	}
}

