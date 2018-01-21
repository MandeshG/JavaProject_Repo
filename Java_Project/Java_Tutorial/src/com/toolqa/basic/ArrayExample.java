package com.toolqa.basic;

public class ArrayExample {
	public static void main(String[] args) {
		
		String[]carMake= new String[4];
		carMake[0]= "Toyota";
		carMake[1]= "Honda";
		carMake[2]= "Audi";
		carMake[3]= "Tesla";
		
		System.out.println(carMake[2]);
		System.out.println(carMake.length);
		
		for (int i = 0; i < carMake.length; i++) {
			System.out.println(carMake[i]);
	
}
	}
	
	

}
