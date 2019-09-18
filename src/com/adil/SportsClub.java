package com.adil;

public class SportsClub {
	public static int calculateFee(int age, int memberYear){
		
		int fee = 0;
		if ((age < 6) || (age > 65) || (memberYear < 0) || (memberYear > 59) ){
			System.out.println("NOT VALID");
		} else {
			if (memberYear <= 3){ 
				fee = 300;
			} else {
				fee = 270;
			}
		}
		return fee; 
	}
}
