import java.util.Scanner;
   public class Bmicalculator {
     public static void main(String[] args){
    // Constant for convertion
            final double 
      POUNDS_TO_KILOGRAMS = 0.45359237;
            final double
      INCHES_TO_METER = 0.0254;
    // Creat a scanner object 
  Scanner scanner = new Scanner("System.in");
//  Prompt user for input
System.out.print("Enter weight in pounds:");
                      double weightpounds
= scanner .nextDouble();
                     // Convert input to metric unit 
              double
weightKilograms = weightpounds * POUNDS_TO_KILOGRAMS;

                 double heightMeters = heightInches *
     INCHES_TO_METER;
// Calculate 
Bmi = weightKilograms / (heightMeters * heightMeters);
     // Display result 
System.out.printf("BMI is %.4f%n", BMI);
         // Close the Scanner scanner.close();

                   
}    


}