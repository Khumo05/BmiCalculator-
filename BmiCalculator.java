
import java.util.Scanner;


public class BmiCalculator{


   //using the weight(kg) and height in (m)

   public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    //I will be using the while loop for making the game to repeat again

    while(true) {

   System.out.println("Weight in kilograms");
   double weight = scanner.nextDouble();

   System.out.println("height in meters");
   double height = scanner.nextDouble();
   scanner.close();

   System.out.println(weight);
   System.out.println(height);
  
   

   double bmi = weight / Math.pow(height,2); 
   System.out.println("You BMI is:"+ bmi);
   System.out.println("Do you want to repeat Bmi?(y/n)");
    String repeatBmi = scanner.nextLine();

  // if(repeat Bmi.equals("y")){
   break;
  }
  }
  }


