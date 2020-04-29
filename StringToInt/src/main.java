import java.util.*;
public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Your input: ");
		String input = sc.nextLine();
		String getDigit="";
		
		
		try {
			
			for(int i=0;i<input.length();i++) {
				if(Character.isDigit(input.charAt(i))){
					getDigit=getDigit+input.charAt(i);
					
				}
				else continue;
			}
			
			if(getDigit!="") {
				int output=Integer.parseInt(getDigit);
				System.out.println("Your output: "+output);
			}
			
			else {
				System.out.println("Your input has no digit.");
			}
		}
		
		
		catch(Exception e){
			System.out.println("Your input has out of Int's range.");
		}
		

	}

}
