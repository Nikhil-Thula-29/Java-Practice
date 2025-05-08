package com.nt.enumpractice;

public class Program1 {


	public static void main(String[] args) throws Exception{
		//String day="Satday";	//userinput
		//enum is a class which is used to define collection of named constants.
		enum days{
			//MONDAY,TUEDAY,WEDDAY,THUDAY,FRIDAY,SATDAY,SUNDAY;	//All are objects
			MONDAY(1,"Open"),TUEDAY(2,"Open"),WEDDAY(3,"Open"),THUDAY(4,"Open"),FRIDAY(5,"Open"),SATDAY(6,"Closed"),SUNDAY(7,"Closed");	//All are objects
			//MONDAY(1),TUEDAY(2),WEDDAY(3),THUDAY(4),FRIDAY(5),SATDAY(6),SUNDAY(7);	//All are objects
//			int indexval;	//place after the above line its mandatory
			private days() {	//Default constructor wont call again if we create our constructor
				this.indexval = 0;
				this.status = "";
				System.out.println("con called");
			}
//			
//			private days(int indexval) {
//				System.out.println("para based cons");
//				this.indexval=indexval;
//			}
			final int indexval;
			final String status;
			private days(int indexval,String status) {
				this.indexval=indexval;
				this.status=status;
			}
		}
		
		days day=days.SATDAY;	//FRIDAY is a object here so we need to store it in days only in left side	//user input
		//System.out.println(days.SUNDAY.indexval);
		System.out.println(days.class.getSuperclass());
		days[] dayss=days.values();
		for(days dd:dayss) {
			System.out.println(dd);
		}
		System.out.println(days.valueOf("MONDAY"));
		
		
		//using if else
		if(day==days.MONDAY||				//here we are conparing address so == bcz they are object
				day==days.TUEDAY||
				day==days.WEDDAY||
				day==days.THUDAY||
				day==days.FRIDAY) {
			System.out.println("Ufff, it's a weekday "	+day.indexval+" "+day.status);
		}else if(day==days.SATDAY||day==days.SUNDAY) {
			System.out.println("Yayy, it's a weekend "+day.indexval+" "+day.status);
		}
//		else {
//			throw new Exception("Invalid day!! "+day);
//		}
		
		
		//Using switch
		switch(day) {
		case MONDAY:
		case TUEDAY:
		case WEDDAY:
		case THUDAY:
		case FRIDAY:
			System.out.println("uffff, it's a weekday "+day.indexval+" "+day.status);
			break;
		case SATDAY:
		case SUNDAY:
			System.out.println("yayy, it's weekend "+day.indexval+" "+day.status);
			break;
//		default:
//			throw new Exception("Invalid day!!"+day);
		}
		
		//new switch
		switch(day) {
		case MONDAY,TUEDAY,WEDDAY,THUDAY,FRIDAY->System.out.println("its a weekday "+day.indexval+" "+day.status);
		case SATDAY,SUNDAY->System.out.println("its a weekend "+day.indexval+" "+day.status);
		}
	}
}
