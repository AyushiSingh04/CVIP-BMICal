import java.util.*;
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Weight in Kilograms: ");
        double weight = sc.nextDouble();
        System.out.println("Input Height in centimeter: ");
        double h = sc.nextDouble();
        double height = (h*0.01);
        double BMIvalue = (weight / (height* height));
        if(BMIvalue < 18.5){
            System.out.println("Your BMI Value is : " + BMIvalue + " Hence you are considered Underweight" );    
        }else if(BMIvalue >= 18.5 && BMIvalue < 25){
            System.out.println("Your BMI Value is : " + BMIvalue + " Hence you are considered Normal" );    
        }else if(BMIvalue >= 25 && BMIvalue < 30){
            System.out.println("Your BMI Value is : " + BMIvalue + " Hence you are considered Overweight" );    
        }else if(BMIvalue >= 30){ 
            System.out.println("Your BMI Value is : " + BMIvalue + " Hence you are considered Obese" );    
        }else{
            System.out.println("Invalid Weight and height. Please check again.");
        }
    }
    
}