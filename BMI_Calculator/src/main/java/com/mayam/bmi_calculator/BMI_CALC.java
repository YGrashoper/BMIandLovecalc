package com.mayam.bmi_calculator;

import java.util.Scanner;

public class BMI_CALC {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please , enter your weight in kg and height in meters");
   BMI(scanner.nextDouble(),scanner.nextDouble());
    }

    private static double BMI(double Weight,double Height) {


        double BMI = Weight/Height*2;
         if (BMI<30){
             System.out.println("woooo, wait up, you are too skinny");
         }else if (BMI>80){
             System.out.println("Damn, you are so fat");

         }else {
             System.out.println("You are doing just fine");
         }

        return BMI;
    }

}
