package q5;


import java.util.Scanner;

public class AssignQ5 {

public static void main(String[] args) {
		
		int day, month, year;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter date");
		day = scanner.nextInt();

		System.out.println("Enter month");
		month = scanner.nextInt();

		System.out.println("Enter year");
		year = scanner.nextInt();

		System.out.println("current date is : " + day + "/" + month + "/" + year);

		// 2. i need to think about how to handle leap year

		//3. i need to think how many days a month
		int noOfDaysInMonth[]={-1, 31,28,31,30,31,30,31,31,30,31,30,31};

		  if(isLeapYear(year)){
			noOfDaysInMonth[2]=29;//hey no of days in feb is 29 if it is a leap year
		  }
		  
	  //4. calculate the next date?
		  day=day+1; //day=32

		  if(day > noOfDaysInMonth[month]){
			day=1;
			month++;
			if(month > 12){
				month=1;
				year++;
			}

		  }  
		  System.out.println("next date is: " + day + "/" + month + "/" + year);  
		  scanner.close();
	}

	public static boolean isLeapYear(int year) {
		if ((year % 400 == 0 || year % 100 != 0) && (year % 4 == 0))
			return true;
		else
			return false;
	}
}
