package q2;

import java.util.Scanner;

public class AssignQ2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numStudents;
		int marks;
		System.out.println("PE number of students....");
		numStudents= sc.nextInt();
		double average=0.0;
		double total=0.0;
		
		int grades[]=new int[numStudents];
		
		int counter=0;
		while(counter<numStudents) {
			System.out.println("Enter the grade for student  "+ (counter+1));
			marks=sc.nextInt();
			if(marks>100 || marks<0 ) {
				System.out.println("Invalid grade, try again...");
				continue;
			}
			grades[counter++]= marks;
		}
		
		for(int grade: grades) {
			total+=grade;
		}
		System.out.println("total marks: "+ total);
		
		average=total/grades.length;
		
		System.out.println("average: "+ average);
		sc.close();
		
	}
}






