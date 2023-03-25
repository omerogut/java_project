
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		 int arrayLenght = 1;
	        String[] nameArray = new String[arrayLenght];
	        Integer[] ageArray = new Integer[arrayLenght];
	        Double[] weightArray = new Double[arrayLenght];
	        Double[] heightArray = new Double[arrayLenght];
	        String[] interpretArray = new String[arrayLenght];


	        for (int i = 0; i < arrayLenght; i++) {
	            System.out.print("Enter name, surname, age, weight, height (as space seperated): ");
	            String data = scanner.nextLine();
	            String[] temp = data.split(" ");

	            String name = temp[0] + " " + temp[1];
	            Integer age = Integer.parseInt(temp[2]);
	            Double weightPounds = Double.parseDouble(temp[3]);
	            Double heightInches = Double.parseDouble(temp[4]);

	            nameArray[i] = name;
	            ageArray[i] = age;
	            weightArray[i] = weightPounds;
	            heightArray[i] = heightInches;
	        }

	        for (int i = 0; i < arrayLenght; i++) {
	            Double tempBMI = BMIFunctions.calculateBMI(weightArray[i], heightArray[i]);

	            interpretArray[i] = BMIFunctions.interpretBMI(tempBMI);
	        }

	        for (int i = 0; i < arrayLenght; i++) {
	            System.out.println(nameArray[i] + interpretArray[i]);
	        }
	        scanner.close();
	}

}
