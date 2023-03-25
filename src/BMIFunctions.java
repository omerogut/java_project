
public class BMIFunctions {

	public static double calculateBMI(double weight, double height) {
		
		
		double kilo = 0.45359237 * weight;

        double boy = 0.3 * height;

        return kilo / (boy * boy);
        
        
    }

    public static String interpretBMI(double bmi) {
        if (bmi < 18.5) {
            return " underweight";
        } else if (18.5 <= bmi && bmi < 25.0) {
            return " normal";
        } else if (25 <= bmi && bmi < 30) {
            return " overweight";
        } else if (30 <= bmi) {
            return " obese";
        } else {
            return " obese";
        }
       
		  
    }
    
}
