import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers");
		int x = sc.nextInt();
		int y = sc.nextInt();
		try {
			int result = y / x;
			System.out.println("the result is ="+ result);
		} catch (ArithmeticException e) {
			System.out.println("exception occured");
		}finally {
			System.out.println("it will execute");
			
		}
		
	}
}
