package Lab2;

import java.util.Scanner;
public class OurDate {
	private int day;
	private int month;
	private int year;
	public OurDate() {
	day = 1;month = 1;year = 2013;
	}
	public OurDate (int day, int month, int year) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	public OurDate (OurDate date) {
		this.year = date.year;
		this.month = date.month;
		this.day = date.day;
	}
	public void setYear(int year) {
		if (year < 0)
		this.year = 2010;
		else this.year = year;
		}
	public int getYear() {
		return year; 
		}
	public void setMonth(int month) {
		if (month < 0 || month > 12 )
		this.month = 1;
		else this.month = month;
		}
	public int getMonth() { 
		return month; 
		}
	public void setDay(int day) {
		if (day <= 0 || day > 31)
		this.day = 1;
		else if (this.month == 2 && day > 29)
		this.day = 1;
		else if (this.day > 30 && (this.month == 9 ||this.month == 4 ||this.month == 6 ||this.month == 11)
		)
		this.day = 1;
		else this.day = day;
		}
	public int getDay() { 
		return day; 
		}
	public boolean isEqual(OurDate date){
		if (this.year == date.year && this.month == date.month && this.day == date.day)
		return true;
		else return false;
		}
	public String toString() {
		return new String("" + year + "/" + month + "/" + day);
		}
	public int calcDay(OurDate date) {
		int [] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
		int thisJulianDate = (this.year-1)*365;
		for (int i = 1; i < this.month; i++)
		thisJulianDate += daysInMonth[i];
		thisJulianDate += this.day;
		int paramJulianDate = (date.year-1)*365;
		for (int i = 1; i < date.month; i++)
		paramJulianDate += daysInMonth[i];
		paramJulianDate += date.day;
		return paramJulianDate - thisJulianDate;
		} 
	
	public void scan() {
		Scanner scan = new Scanner (System.in);
		do {
			System.out.println("Enter event date:");
			System.out.print ("Enter year");
			this.year = scan.nextInt();
			} while (this.year < 2000 || this.year > 2099);
		do {
			System.out.print("Enter month:");
			this.month = scan.nextInt();
			} while (this.month <= 0 || this.month > 12);
		do {
			System.out.print ("Enter day:");
			this.day = scan.nextInt();
			} while (this.day <= 0 || this.day > 31 || (this.month == 2 && this.day > 29) || (this.day > 30 && (this.month == 9 || this.month == 4 || this.month == 6 || this.month == 11)));
		}
	public void addOne() {
		// TODO Auto-generated method stub
		
	}
		
}
