package omegaLoL;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //First_Task
        String firstName = "Stefan";
        String secondName = "Stoyanov";
        String familyName = "Stoyanov";

//        System.out.println(firstName + " " + secondName + " " + familyName);


        //Second_Task
//        int a = 31; //31
//        int b = 31; //31
//        int c = 20;

//        System.out.println(a + b + c);

//        //semiperimeter_Third_Task
//        double s = (a + b + c) / 2;
//
//        double area = (double) Math.sqrt(s * ((s - a) * (s - b) * (s - c)));

//        System.out.println(area);

        //Fourth_task
//        int n;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("How high brother?: ");
//        n = sc.nextInt();
//
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n - i; j++) {
//                System.out.println(" ");
//            }
//            for (int m = 1; m <= (i * 2) - 1; m++) {
//                System.out.println("*");
//            }
//            System.out.println();


        //Fifth_task
//        double A;
//        double B;
//        double C;
//
//        Scanner side1 = new Scanner(System.in);
////        System.out.println("Enter value for side A:");
//        A = side1.nextDouble();
//
//        Scanner side2 = new Scanner(System.in);
////        System.out.println("Enter value for side B:");
//        B = side2.nextDouble();
//
//        Scanner side3 = new Scanner(System.in);
////        System.out.println("Enter value for side C");
//        C = side3.nextDouble();
//
//        double s = (A + B + C) / 2;
//
//        double area = (double) Math.sqrt(s * ((s - A) * (s - B) * (s - C)));

//        System.out.println("The area of the triangle is: " + area);

        //Sixth_task
        long minutes;

        Scanner time = new Scanner(System.in);
        System.out.println("How many minutes would you like to convert: ");
        minutes = time.nextLong();

        int minsToDays = (int) (minutes / (60 * 24));
        int years = minsToDays / 365;

        int remainingDays = (int) (minsToDays % 365);

        int remainingHours = (int) (minutes % (60 * 24) / 60);


        System.out.println(years + " Years: " + remainingDays + " Days: " + +remainingHours + " Hours: ");

    }
}


