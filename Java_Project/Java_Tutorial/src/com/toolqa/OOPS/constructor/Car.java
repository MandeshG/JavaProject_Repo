package com.toolqa.OOPS.constructor;

public class Car {
	String sModel;
    int iGear;
    int iHighestSpeed;
    String sColor;
    int iMake;
    boolean bLeftHandDrive;
    String sTransmission;
    int iTyres;
    int iDoors;
    
    public Car(String Model, String Color, int Door){
    	sModel=Model;
    	sColor= Color;
    	iDoors= Door;
    	
    }
	
    public void showReult(){
    	System.out.println("Model of the Car: " +  sModel);
    	System.out.println("Number of gears in the Car: " +  iGear);
    	System.out.println("Max speed of the Car: " +  iHighestSpeed);
    	System.out.println("Color of the Car: " +  sColor);
    	System.out.println("Make of the Car: " +  iMake);
    	System.out.println("Transmission of the Car: " +  sTransmission);
    }

}
