public class Animal {
    String name;
    int age;
    String gender;

    void process(){
        System.out.println(name + " " + "is now" + " " + age + "years" + " " + "and he/she is a" + " " + gender + " " + "animal");
    }

    void run(){
        System.out.println("The" + " " + name + " " + "have started running");
    }

    void giveBirth(){
        System.out.println("The" + " " + name + " " + "just gave birth not long ago");
    }
}
