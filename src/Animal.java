public class Animal extends Function {
    String name;
    int age;
    String gender;

    void process(){
        System.out.println(name + " " + "is now" + " " + age + "years" + " " + "and he/she is a" + " " + gender + " " + "animal");
    }


    void run(){
        System.out.println("The" + " " + name + " " + "have started running");
        System.out.println(super.child);
        Function myMethod = new Function();
        myMethod.ageRange(45);
        System.out.println("My first hand on inheritance in Java");
    }

    void giveBirth(){
        System.out.println("The" + " " + name + " " + "just gave birth not long ago");
    }
}
