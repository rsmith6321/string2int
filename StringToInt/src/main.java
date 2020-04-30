import java.util.*;
import java.lang.*;
public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Your input: ");
		String input = sc.nextLine();
		String getDigit="";
		
			
		for(int i=0;i<input.length();i++) {
			if(Character.isDigit(input.charAt(i))){
				getDigit=getDigit+input.charAt(i);
					
			}
			else continue;
		}
			
		if(getDigit!="") {

			int output=0;
			double exponent = 0;
				
			for(int i = getDigit.length()-1;i>=0;i--){
					
				switch(getDigit.charAt(i)) {
				case '1' : output+=(1*Math.pow(10,exponent));
				break;
				case '2' : output+=(2*Math.pow(10,exponent));
				break;
				case '3' : output+=(3*Math.pow(10,exponent));
				break;
				case '4' : output+=(4*Math.pow(10,exponent));
				break;
				case '5' : output+=(5*Math.pow(10,exponent));
				break;
				case '6' : output+=(6*Math.pow(10,exponent));
				break;
				case '7' : output+=(7*Math.pow(10,exponent));
				break;
				case '8' : output+=(8*Math.pow(10,exponent));
				break;
				case '9' : output+=(9*Math.pow(10,exponent));
				break;
				case '0' : output+=(0*Math.pow(10,exponent));
				break;
				}
				exponent++;
					
			}
			if (output>=2147483647) {
				System.out.println("Your input has digit that out of Int's range");
			}
			else {
				System.out.println("Your output: "+output);
			}
				
		}
			
		else {
			System.out.println("Your input has no digit.");
		}
		
		
	}

}