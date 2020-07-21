package com.epam.logger_exceptionhandling;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class InterestCalculation {
	private static final Logger LOGGER= LogManager.getLogger(EstimationHouseConstruction.class);

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		LOGGER.debug("choose one option");
		LOGGER.debug("1.Simple Interest");
		LOGGER.debug("2.Compound Interest");
		LOGGER.debug("choose ur option");
		switch(sc.nextInt()) 
		{
			case 1:
				LOGGER.debug("Enter principal amount");
				double principal=sc.nextDouble();
				LOGGER.debug("Enter rate of interest");
				double rateOfInterest = sc.nextDouble();
				LOGGER.debug("Enter time ");
				int time = sc.nextInt();
				double result1 =SimpleInterest.calculation1(principal, time, rateOfInterest);
				LOGGER.debug("simple interest is "+result1);
				break;
				
			case 2:
				LOGGER.debug("Enter principal amount");
				double compoundPrincipal = sc.nextDouble();
				LOGGER.debug("Enter rate of interest");
				double compoundRateOfInterest = sc.nextDouble()/100.0;
				LOGGER.debug("no.of years deposited");
				double compoundNoOfYearsDeposited = sc.nextDouble();
				LOGGER.debug("compounded times");
				int compoundedTimes = sc.nextInt();
				double result2 =CompoundInterest.calculation2(compoundPrincipal,compoundRateOfInterest,compoundNoOfYearsDeposited,compoundedTimes);
				LOGGER.debug("compound interest is " + result2);
				break;
				
			default:LOGGER.debug("enter correct option");
					break;
			
		}
		
		
		sc.close();

	}

}
