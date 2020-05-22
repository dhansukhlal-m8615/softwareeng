import java.util.Scanner;

/**
 * 
 */

/**
 * @author User
 *
 */
public class myAppTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		output();
	}
	public static double monthlyPay(double hourlyPay, double noOfHours) {
		double salary;
		salary=hourlyPay*noOfHours;
		return salary;
	}
	public static void output() {
		Scanner input=new Scanner(System.in);
		System.out.println("Hello Software Engineering World");

		System.out.println("Hi My name is Minal");

		System.out.println("Enter Hourly Pay: ");
		double hourPay=input.nextDouble();
		System.out.println("Enter number of hours worked: ");
		double hours=input.nextDouble();
		System.out.println(monthlyPay(hourPay, hours) + "dollars");
		System.out.println("Have a good day");
	}

}
