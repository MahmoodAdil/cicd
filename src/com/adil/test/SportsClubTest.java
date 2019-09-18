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
			{ "T1",5,-1,0},
			{ "T2",20,3,300},
			{ "T3",20,5,270},
			{ "T4",70,60,0},
	
		};
	}
	
	@Test(dataProvider="membershipFeesTest")
	public void testMembershipFees(String id,int age, int memberYear,int expected) {
		assertEquals( SportsClub.calculateFee(age,  memberYear), expected );
	}
}
