public class Function {
    static int myMethod(int a, int b){
        int sum = a + b;
        return sum;
    }

    static double myMethod2(double a, double b){
        double sum = a + b;
        return sum;
    }

    //Global variable
    int child = 18;


    //Scope
void ageRange(int age) {
       int  child = this.child;
        if (age >= child) {
            System.out.println("You're now an adult");
        } else {
            System.out.println("You're still a child");

        }
    }

 void value(int age) {
        if (age >= child) {
            System.out.println("You're now an adult");
        } else {
            System.out.println("You're still a child");

        }
    }
}
