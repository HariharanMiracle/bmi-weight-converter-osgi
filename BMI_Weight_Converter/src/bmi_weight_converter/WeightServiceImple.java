package bmi_weight_converter;

public class WeightServiceImple implements WeightService {

	@Override
	public double standardizedWeight(double weight, String unit) {
		// TODO Auto-generated method stub
		double convertedValue = 0;
		
		if(unit.equalsIgnoreCase("Kg")) {
			convertedValue = weight;
		}
		else if(unit.equalsIgnoreCase("g")) {
			convertedValue = weight / 1000;
		}
		else if(unit.equalsIgnoreCase("lb")) {
			convertedValue = weight / 2.2046;
		}
		else if(unit.equalsIgnoreCase("t")) {
			convertedValue = weight * 1000;
		}
		else {
			//invalid unit
			System.out.println("Invalid unit in weight");
			return -1;
		}
		
		if(convertedValue <= 0) {
			//invalid input
			System.out.println("Invalid value in weight");
			return -1;
		}
		
		return convertedValue;
	}

}
