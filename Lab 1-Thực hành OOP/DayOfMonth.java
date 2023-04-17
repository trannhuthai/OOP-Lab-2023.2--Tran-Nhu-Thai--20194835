import java.util.Scanner;
public class DayOfMonth {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int day,month,year;
		
		System.out.println("Enter the month: ");
		month = keyboard.nextInt();
		
		System.out.println("Enter the year: ");
		year = keyboard.nextInt();
		if (year<0) {
			System.out.println("Invalid year");
		}
		else if (year%400==0) {
			switch (month) {
			case 1,3,5,7,8,12:
				System.out.println("The number of days on the month is 31 days ");
				break;
			
			case 4,6,9,11:
				System.out.println("The number of days of the month is 30 days ");
				break;
			
			case 2:
				System.out.println("The number of days of the month is 29 days ");
				break;
			
			default:
				System.out.println("Imvalid month");
				break;
			}
		}
			else if (year%100==0 || year%4!=0) {
				switch (month) {
				case 1,3,5,7,8,12:
					System.out.println("The number of days on the month is 31 days ");
					break;
				
				case 4,6,9,11:
					System.out.println("The number of days of the month is 30 days ");
					break;
				
				case 2:
					System.out.println("The number of days of the month is 28 days ");
					break;
				
				default:
					System.out.println("Imvalid month");
					break;
				}
				
			}
			else {
				switch (month) {
				case 1,3,5,7,8,12:
					System.out.println("The number of days on the month is 31 days ");
					break;
				
				case 4,6,9,11:
					System.out.println("The number of days of the month is 30 days ");
					break;
				
				case 2:
					System.out.println("The number of days of the month is 29 days ");
					break;
				
				default:
					System.out.println("Imvalid month");
					break;
				}
			}
	
		
	}

}
