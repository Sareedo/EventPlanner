package Lab2;
public class Planner {
	private final int MAXEVENTS = 10;
	private Event[]plan;
	private int numEvents;
	public Planner() {
	plan = new Event[MAXEVENTS];
	numEvents = 0;
	}
	public void scan() {
	boolean full = false; 
	if (numEvents >= MAXEVENTS) {
	System.out.println("Your planner is full! plz delete an event before you can add another.");
	}
	else {
	plan[numEvents] = new Event(); 
	plan[numEvents].scan(); 
	for (int i = 0; i < numEvents; i++) {
	if (plan[i].getDate().isEqual(plan[numEvents].getDate())
	&& plan[i].getDate().isEqual(plan[numEvents].getDate())) {
	full = true;
	break;
	}
	}
	if (full) {
	System.out.println("An event already exists for that date.");
	plan[numEvents] = null;
	} else {
	System.out.println("The event has been added to your planner.");
	numEvents++;
	}
	} 
	} 
	public void displayOneDay(OurDate date) {
	StringBuilder planOneDay = new StringBuilder();
	
	for (int i = 0; i < numEvents; i++) {
	if (date.isEqual(plan[i].getDate())) {
	planOneDay.append(plan[i] +"\n");
	}}
	System.out.print("Your events for "
	+date.toString()
	+" are:\n"
	+planOneDay.toString());
	if (planOneDay.length() < 1) {
	System.out.println("No events exist for this date.");
	}
	}
	
	public void displaySevenDays(OurDate date) {
	System.out.println("Your events for the week starting " +date.toString() +" are: ");
	for (int i = 0; i < 7; i++) {
	displaySevenDays(date);
	date.addOne(); 
	}
	}
	public void deleteEvent(OurDate date, OurDate date2) {
	boolean EventFound = false; 
	int i;
	for (i = 0; i < numEvents; i++) {
	if (plan[i].getDate().isEqual(date) && plan[i].getDate().isEqual(date)) {
	EventFound = true;
	break;
	}
	}
	if (EventFound){
		plan[i] = plan[numEvents - 1];
		numEvents--;
	System.out.println("event deleted.");
	}
	else {
	System.out.println("There is no event for that date and time!");
	}
	}
	
}
