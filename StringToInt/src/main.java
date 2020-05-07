import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Your input: ");
		String input = sc.nextLine();
		int exponent = 0;
		int output=0;
		Boolean hasDigit=false;
		Boolean outOfRange=false;

		for(int i = input.length()-1;i>=0;i--) {

			if(Character.isDigit(input.charAt(i))){
				hasDigit=true;

				switch(input.charAt(i)) {
				case '1' : output+=1*(Math.pow(10,exponent));
				exponent++;
				break;
				case '2' : output+=2*(Math.pow(10,exponent));
				exponent++;
				break;
				case '3' : output+=3*(Math.pow(10,exponent));
				exponent++;
				break;
				case '4' : output+=4*(Math.pow(10,exponent));
				exponent++;
				break;
				case '5' : output+=5*(Math.pow(10,exponent));
				exponent++;
				break;
				case '6' : output+=6*(Math.pow(10,exponent));
				exponent++;
				break;
				case '7' : output+=7*(Math.pow(10,exponent));
				exponent++;
				break;
				case '8' : output+=8*(Math.pow(10,exponent));
				exponent++;
				break;
				case '9' : output+=9*(Math.pow(10,exponent));
				exponent++;
				break;
				case '0' : output+=0*(Math.pow(10,exponent));
				exponent++;
				break;
				}


				if(exponent>10||output>=Integer.MAX_VALUE) {
					outOfRange=true;
				}




			}



		}


		//OUTPUT
		if(hasDigit==false) {
			System.out.println("Your input has no digit");
		}
		else if(outOfRange==true){
			System.out.println("Your input has number that out of int's range. ");
		}
		else System.out.println("Your output: "+output);



	}

}