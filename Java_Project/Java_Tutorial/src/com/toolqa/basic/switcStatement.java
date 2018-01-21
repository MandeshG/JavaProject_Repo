package com.toolqa.basic;

public class switcStatement {
	public static void main(String[] args) {
		
		String sDay= "Friday";
		
		switch(sDay){
		
		case "Monday": 
			System.out.println("Today is Monday");
		break;
		case "Tuesday":
			System.out.println("Today is Tuesday");
			break;
		case "Wednesday":
			System.out.println("Today is Wednesday");
			break;
		case "Thursday":
			System.out.println("Today is Thursday");
			break;
			
		case "Friday":
			System.out.println("Todau is Friday");
			break;
		case "Saturday":
				System.out.println("Today is Saturday");
				
		case "Sunday":
			System.out.println("Today is Sunday");
			break;
			default:
				System.out.println("Not applicable");
		}
	}

}
