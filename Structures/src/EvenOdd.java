import java.util.Scanner;

//loops

public class EvenOdd {

//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int X=scan.nextInt();
//		int number=X%2;
//		if (number==0) {
//				System.out.println("even");
//		} else if (number==1) {
//			System.out.println("odd");
//		}
			
			
		
		//todo: The program takes a number as input.
		//It then goes through all integer values till reaching that value and prints all the odd ones.
	
		
//	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number to test whether it is odd or even");
		int number=scan.nextInt();
		if(number%2==0) {
			System.out.println("it is a even number");
		}else {
			System.out.println("it is a odd number");
		}
	}
	
}
