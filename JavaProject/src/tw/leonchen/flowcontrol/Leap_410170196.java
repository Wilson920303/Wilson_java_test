package tw.leonchen.flowcontrol;

public class Leap_410170196 {

	public static void main(String[] args) {
		int year = 1800 ;
		int month = 3 ;
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println( month + " has 31 days" );
			}
		else if ( month == 4 || month == 6 || month == 9 || month == 11 ) {
			System.out.println( month + " has 30 days");
		}
		else if (month ==2 ) {
			if (year % 400 == 0 || (year % 4 == 0 && year % 100 !=0) ) {
				System.out.println( year + " is leap year ");
				System.out.println( month + " has 29 days ");
			}
			else {
				System.out.println( year + " is not leap year ");
				System.out.println( month + " has 28 days ");
			}
		}
		System.out.println("finished");
		}
	}

