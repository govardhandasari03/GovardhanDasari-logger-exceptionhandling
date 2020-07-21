package com.epam.logger_exceptionhandling;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class EstimationHouseConstruction {
	private static final Logger LOGGER= LogManager.getLogger(EstimationHouseConstruction.class);

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
		
		LOGGER.debug("Enter area of house");
		double areaofhouse = sc.nextDouble();
		
		LOGGER.debug("do you want a fully automated home(yes/no)");
		String automatedhome = sc.next().toLowerCase();
		boolean fullyautomatedhome;
		
		if("yes".compareTo(automatedhome) == 0)
			fullyautomatedhome = true;
		else
			fullyautomatedhome = false;
			
		sc.nextLine();
		LOGGER.debug("Enter material standard");
		String materialstandard = sc.nextLine();
		
		double result = ConstructionCostPerSquareFeet.costcalculation(materialstandard,areaofhouse,fullyautomatedhome);
		LOGGER.debug("cost is " + result);
		
		sc.close();
  
	}

}
