package Assginment_3;

public class BMI_02 {
/*
Question 2:

Scientists measure an object's mass in kilogram and its weight in Newtons.
If you know the amount of mass that an object has, you can calculate its weight, in Newtons, with the following formula:
             Weight = Mass * 9.8
Write a program that asks the user to enter an object's mass, and then calculate it weight.
If the object weighs more than 1000 Newtons, display a message indicating that it is too heavy.
If the object weighs less than 10 Newtons, display a message indicating that object is too light.
 */

    public static void main(String[] args) {

        int pounds,feet,inches;
        double heightMeters,mass,BMI;

        pounds=150;
        feet=5;
        inches=5;

        heightMeters = ((feet * 12) + inches ) * 0.0254;
        System.out.println(heightMeters);
        mass = (pounds/2.2);
        BMI = mass / (heightMeters * heightMeters);

        System.out.println("Your BMI is " + BMI);

        if(BMI<18.5) {
            System.out.println("Your risk category is underweight");
        }else if(BMI<25) {
            System.out.println("Your risk category is normal weight");
        }else if(BMI<30) {
            System.out.println("Your risk category is overweight");
        }else {
            System.out.println("Your risk category is obese");
        }





    }

}
