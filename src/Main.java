public class Main{
    public static void main(String[] args){
        int num1 = 12;
        double PI = 3.12;
        char grade = 'A';
        boolean isActive = true;
        String fName = "Nurudeen";
        System.out.println(num1);
        System.out.println(PI);
        System.out.println(grade);
        System.out.println(isActive);
        System.out.println(fName);

        int fNum = 10;
        int sNum = 3;
        int result5 = ++sNum;
        int result = fNum + sNum;
        int result1 = fNum * sNum;
        int result2 = fNum - sNum;
        int result3 = fNum / sNum;
        int result4 = fNum % sNum;

        String text = "Hello World";

        System.out.println(text + " " + "It my first day of writing Java");

        System.out.println(text);
        System.out.println(text.length());
        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());
        System.out.println(text.charAt(0));
        System.out.println(text.concat(" It my first day of writing Java"));



        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);

        String x = "10";
        int y = 20;
        String z = x + y;

        System.out.println(z);




        int output = Math.max(3, 10);
        int output1 = Math.min(3, 10);
        double output2 = Math.sqrt(10);
        double output3 = Math.abs(-3.4);
        double output4 = Math.pow(2, 9);

        System.out.println(output);
        System.out.println(output1);
        System.out.println(output2);
        System.out.println(output3);
        System.out.println(output4);

        int i = 9;
        int k = 2;

        System.out.println(i < k);
        System.out.println(i > k);

        System.out.println(i == k);

        boolean isGreater = true;

        if(isGreater){
            System.out.println("Happy Coding!");
        };

        final int age = 10;
        int age1 = 16;

        if(age < age1){
            System.out.println(age + " " + "is less than" + " " + age1);
        };

        final int pass = 44;

        int Ola = 45;
        int Yusuf = 60;

        if(pass == 50){
            System.out.println("You're now promoted to the next class");
        } else if (Yusuf == pass) {
            System.out.println("You've successfully been promoted to the next class");
        } else if(Ola <= pass){
            System.out.println("Try again next semester");
        } else{
            System.out.println("No one pass the exam");
        }

        int day = 4;

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("No day found");
        }


        //Loop while / do while

        int j = 0;
//        while(j < 8){
//            System.out.println(j);
//            j++;
//        }

        do {
            System.out.println(j);
            j++;
        }while(j < 10);
//
        for(int a = 0; a < 4; a++){
            System.out.println(a);
        }



        System.out.println("Hello Java");

        Task.tasks();
        Function data = new Function();
        data.ageRange(20);
        data.value(17);



        System.out.println(Function.myMethod(3, 2));
        System.out.println(Function.myMethod2(3.2, 2.3));


    }
}
