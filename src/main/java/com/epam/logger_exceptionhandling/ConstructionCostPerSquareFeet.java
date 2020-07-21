package com.epam.logger_exceptionhandling;
public class ConstructionCostPerSquareFeet {
	public static double costcalculation(String materialstandard,double areaofhouse,boolean fullyautomatedhome)
		{
			int costPerSquareFeet;
			double totalCost=0;
			double noofsquarefeets=areaofhouse*10.7639;//to convert the area from mteres to feets
			
				if(materialstandard.compareTo("standard") == 0)
				{
					costPerSquareFeet = 1200; 
					totalCost = noofsquarefeets * costPerSquareFeet;
				}
				
				else if(materialstandard.compareTo("above standard") == 0) 
				{
					costPerSquareFeet = 1500;
					totalCost = noofsquarefeets  * costPerSquareFeet;
				}
				else if(materialstandard.compareTo("high standard") == 0) 
				{
					if(fullyautomatedhome)
					{
						costPerSquareFeet = 2500;
						totalCost = noofsquarefeets * costPerSquareFeet;
					}
					else
					{
						costPerSquareFeet = 1800;
						totalCost = noofsquarefeets * costPerSquareFeet;
					}
				}
					
			
			return totalCost;

	}

}
