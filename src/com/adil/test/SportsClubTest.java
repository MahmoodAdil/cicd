package com.adil.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.adil.SportsClub;

public class SportsClubTest {
	SportsClub cc = new SportsClub();
	
	@DataProvider(name="membershipFeesTest")
	public Object[][] createData() {
		return new Object[][] {
			// testNum, age, memberYear, expected output
			{ "T1",5,3,0},//age < 6
			{ "T2",70,3,0},//age > 65
			{ "T3",20,-1,0},//memberYear < 0
			{ "T4",20,60,0},//memberYear > 59
			/*
			 * { "T5",20,3,300},//memberYear <= 3
			 * { "T6",20,5,270},//memberYear <= 3 False
			 */
			
	
		};
	}
	
	@Test(dataProvider="membershipFeesTest")
	public void testMembershipFees(String id,int age, int memberYear,int expected) {
		assertEquals( SportsClub.calculateFee(age,  memberYear), expected );
	}
}
