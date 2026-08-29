import java.util.Arrays;

public class Task {
public static void tasks(){
    //Personal Information
    String name = "Olayiwola Nurudeen";
    int age = 20;
    String country = "Nigeria";

    System.out.println("My name is" + " " + name);
    System.out.println("I am" + " " + age + " " + "old");
    System.out.println("I live in" + " " + country);

    //Simple Calculator
    int x = 10;
    int y = 4;

    System.out.println(x + y);
    System.out.println(x * y);
    System.out.println(x / y);
    System.out.println(x % y);

    //Even or Odd
    int oddOrEven = 3;


    if(10 % oddOrEven == 1){
        System.out.println("This is odd number");
    }else{
        System.out.println("Left with even number");
    }


    //Positive, Negative, or Zero
    int num1 = 10; //11
    int num2 = 2; //3
    int result = num1 % num2;

    if(result == 1){
        System.out.println("Positive");
    }else if(2 <= result){
        System.out.println("Negative");
    }else{
        System.out.println("Zero");
    }

    //Grade Checker

    int grade = 40;

    switch(grade){
        case 70:
            System.out.println("A");
            break;
        case 60:
            System.out.println("B");
            break;
        case 50:
            System.out.println("c");
                    break;
        default:
            System.out.println("Fail");
    }

    //Print Numbers 1–100

//    for(int k = 0; k < 100; k++){
//        System.out.println(k);
//    }

    //Even Numbers
    // Print all even numbers from 1 to 100

//    int[] result = new int[];

//    for(int i = 0; i < 100; i++){
//        if(i % 2 == 0){
//            System.out.println(i);
//        }
//    }

    //Sum of Numbers
//    int sum;
//    for(int j = 0; j < 50; j++){
//        sum = j + j;
//        System.out.println(sum);
//    }

    //Multiplication Table
    //Print the multiplication table of 5

//    int sum1;
//    for(int n = 0; n < 12; n++){
//        sum1 = 5 * n;
//        System.out.println(sum1);
//    }

    //Countdown
    for(int count = 10; count > 0; count--){
        System.out.println(count);
    }
}
}
