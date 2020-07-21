package com.epam.logger_exceptionhandling;
public class CompoundInterest {

	public static double calculation2(double Principal,double rateOfInterest,double noOfYearsDeposited,int compoundedTimes)
	{
		return Principal*Math.pow((1+rateOfInterest/noOfYearsDeposited),compoundedTimes*noOfYearsDeposited);
	}
}
