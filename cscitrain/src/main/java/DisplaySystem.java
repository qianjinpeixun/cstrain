
import java.util.Calendar;
import java.util.Scanner;
public class DisplaySystem {
	public static void main(String[] args) {
		CarReceipt car1;
		CalculateSystem calculate = new CalculateSystem();
		Calendar a = Calendar.getInstance();
		int y = a.get(Calendar.YEAR);
		int m = a.get(Calendar.MONTH)+1;
		int d = a.get(Calendar.DATE);
		System.out.println("Welcome to the system of Gas Tracker\n");
		System.out.println("1.Track a new car\n2.Check the record of cars in the system\n3.quit");	
		int num = checkInputOfInt("\nPlease enter the number to access: ", "number", 3,1,1,2);	
		while(num != 3) {
			if(num == 1) {
				System.out.println("\nOkay! You chose number 1 --> Track a new car\n");
				int month = checkInputOfInt("Please enter the month(MM) of fueling: ", "month", 12,1,2,2);
				int year = checkInputOfInt("Please enter the year(YYYY) of fueling: ", "year", y, y-2,4,4);
				int date = checkInputOfInt("Please enter the date(DD) of fueling: ", "date", 24, 1,2,2);
				double cost = checkInputOfDouble("Please enter the cost of fueling(not more than 150): ", "cost", 150, 1,0,3);
				double amountOfGas = checkInputOfDouble("Please enter the amount of gas (in Litres) purchased: ", "amount", 200, 1,0,3);
				double currentGas = checkInputOfDouble("Please enter the amount of gas (in Litres) left: ", "distance", 100, 1,0,3);
				double distance = checkInputOfDouble("Please enter the distance traveled since last fill up (km): ", "distance", 1000, 1,0,4);
				int gasType = checkInputOfInt("Please enter the number in front of the gas type for which the gas was purchased-->\n1.regular (about 87)\t2.mid-grade (about 89)\t3.premium (91 to 93)\tPlease enter here: ", "gas type", 3,1,1,2);
				CarReceipt car = new CarReceipt(month, year,date, cost, amountOfGas,currentGas, distance,gasType);
				System.out.println("Awesome! Already got the information!\n\n1.Fuel economy(L/100km)\n2.Average driving distance per unit of time (day/week/month)\n3.Average amount spent on gas\n4.Variations in gas price over time\n5.Viewing of averages over all vehicles in the system\n6.Add the car receipt into the system\n7.Back to the menu ");	
				int num1 = checkInputOfInt("\nPlease enter the number to access: ", "number", 7,1,1,2);
				if(num1 == 1){
					System.out.println((amountOfGas-currentGas)/(distance/100));
					System.out.print(calculate.fuelEconomy(car));
				}
				else if(num1 == 2){
					System.out.print(calculate.distance(car));
				}
			}		
		}
	}	
	public static boolean checkNum1(String num) {
		boolean answer = true;
		Integer answer1 = null;
		try {
		answer1 = Integer.parseInt(num);
		} 
		catch (NumberFormatException e) {
			answer = false;
		}	
		return answer;
	}
	public static boolean checkNum2(String num) {
		boolean answer = true;
		Double answer1 = null;
		try {
		answer1 = Double.parseDouble(num);
		} 
		catch (NumberFormatException e) {
			answer = false;
		}	
		return answer;
	}
	public static int checkInputOfInt(String s1, String s2, int n1, int n2, int n3, int n4) {
		boolean answer1 = false;
		Scanner keyboard = new Scanner(System.in);
		System.out.print(s1);
		String s3 = keyboard.next();
		int num = 0;
		while(answer1 == false) {
			while(checkNum1(s3) == false || s3.length() < n3 || s3.length() > n4) {
				System.out.print("Invalid " + s2 + ", Please enter again: ");
				s3 = keyboard.next();
			}
			num = Integer.parseInt(s3);			
			if(num > n1 || num < n2) {
				System.out.print("Invalid " + s2 + ", Please enter again: ");
				s3 = keyboard.next();
				while(checkNum1(s3) == false) {
					System.out.print("Invalid " + s2 + ", Please enter again: ");
					s3 = keyboard.next();
				}
				num = Integer.parseInt(s3);
			}
			else {
				answer1 = true;
			}
		}
		return num;
	}
	public static double checkInputOfDouble(String s1, String s2, double n1, double n2, double n3, double n4) {
		boolean answer1 = false;
		Scanner keyboard = new Scanner(System.in);
		System.out.print(s1);
		String s3 = keyboard.next();
		double num = 0;
		while(answer1 == false) {
			while(checkNum2(s3) == false || s3.length() < n3 || s3.length() > n4) {
				System.out.print("Invalid " + s2 + ", Please enter again: ");
				s3 = keyboard.next();
			}
			num = Double.parseDouble(s3);			
			if(num > n1 || num < n2) {
				System.out.print("Invalid " + s2 + ", Please enter again: ");
				s3 = keyboard.next();
				while(checkNum2(s3) == false) {
					System.out.print("Invalid " + s2 + ", Please enter again: ");
					s3 = keyboard.next();
				}
				num = Double.parseDouble(s3);
			}
			else {
				answer1 = true;
			}
		}
		return num;
	}	
}	    
