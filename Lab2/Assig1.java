package Lab2;

import java.util.Scanner;
public class Assig1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int selection = 1; 
		Planner plan = new Planner();
		OurDate date = new OurDate();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Make a selection");
		while (selection != 0) { // while option is valid, loop menu
		do {
		System.out.println(" 1. Add event planner \n 2. Display event for a day \n 3. Display event for a week \n 4. Delete an event\n 0 to quit");
		selection = scan.nextInt();
		} while (selection < 0 || selection > 4);
		switch(selection) {
		case 1: 
		plan.scan();
		break;
		case 2:
		date.scan();
		plan.displayOneDay(date);
		break;
		case 3:
		date.scan();
		plan.displaySevenDays(date);
		break;
		case 4:
		date.scan();
		plan.deleteEvent(date, date);
		break;
		}
		}
		if (selection == 0) {
		System.out.print("Goodbye.");
		}
		}
}
