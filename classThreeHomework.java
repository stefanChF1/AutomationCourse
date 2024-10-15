import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        seventhExercise();
    }

    public static void firstExercise() {

        int A;
        int B;
        int C;
        //Enter_First_Angle
        Scanner firstAngle = new Scanner(System.in);
        System.out.println("Enter angle 1 in DEG");
        A = firstAngle.nextInt();

        //Enter_Second_Angle
        Scanner secondAngle = new Scanner(System.in);
        System.out.println("Enter angle 2 in DEG");
        B = secondAngle.nextInt();

        //Enter_Third_Angle
        Scanner thirdAngle = new Scanner(System.in);
        System.out.println("Enter angle 3 in DEG");
        C = thirdAngle.nextInt();

        if (A + B + C > 180) {
            System.out.println("Bro.. the angles sum must be 180");
        }
        else if (A == 90 || B == 90 || C == 90) {
            System.out.println("You build right angle triangle!");
        }
        else if (A > 90 || B > 90 || C > 90) {
            System.out.println("Your triangle is just as stupid!");
        }
        else if (A == 60 && B == 60 && C == 60) {
            System.out.println("Equilateral... same sides man!");
        }
        else if (A == B || B == C || C == A) {
            System.out.println("Isosceles... two same sides!");
        }
        else if (A < 90 && B < 90 && C < 90) {
            System.out.println("Sharp as a knife, bro");
        }
        else {
            System.out.println("Multifaqwe...3 different sides man!");
        }
    }

    public static void secondEx() {

        int day;
        //Enter day of the week
        Scanner num = new Scanner(System.in);
        System.out.println("Enter number 1-7:");
        day = num.nextInt();

        if (day > 7) {
            System.out.println("Incorrect number, son!");
            //Monday
        } else if (day == 1) {
            System.out.println("Its Monday, maaan!");
            //Tuesday
        } else if (day == 2) {
            System.out.println("Its Tuesdaaay");
            //Wednesday
        } else if (day == 3) {
            System.out.println("Wednesdaaay");
            //Thursday
        } else if (day == 4) {
            System.out.println("Its Thursday, boy!");
            //Friday
        } else if (day == 5) {
            System.out.println("Its Friday!");
            //Saturday
        } else if (day == 6) {
            System.out.println("Its Sunday! FUNDAY!");
            //Wednesday
        } else if (day == 7) {
            System.out.println("Sunday....");
        }
    }

    public static void thirdEx() {

        int age;
        //Enter age
        Scanner num = new Scanner(System.in);
        System.out.println("Enter your age: ");
        age = num.nextInt();
        
        //Eligible or not
        if (age < 16) {
            System.out.println("Too young to work here!");
        } else if (age >= 16) {
            System.out.println("You are worthy!");
        }
    }

    public static void fourthExercise() {

        int price1 = 30;
        int quantity1;

        //Enter quantity
        Scanner item1 = new Scanner(System.in);
        System.out.println("Please enter desired quantity for item X: ");
        quantity1 = item1.nextInt();


        //Calculations
        //15% disc
        if (quantity1 >= 100 && quantity1 <= 120) {
            double sum1 = ((quantity1 * price1) * 0.85);
            System.out.println("Total amount + 15% discount is: " + sum1);
        }
        //20% disc
        else if (quantity1 > 120) {
            double sum1 = ((quantity1 * price1) * 0.8);
            System.out.println("Total amount + 20% discount is: " + sum1);
        }
        //0% disc
        else if (quantity1 < 100) {
            double sum1 = (quantity1 * price1);
            System.out.println("Total amount is: " + sum1);
        }
    }

    public static void fifthExercise() {

        //Choose where u want to go
        Scanner beachOrMountain = new Scanner(System.in);
        System.out.println("Hello, please choose 1 - for Beach or 2 - for Mountain holiday!");
        int decision = beachOrMountain.nextInt();

        //Value budget
        Scanner pricing = new Scanner(System.in);
        System.out.println("What budget per day, person ");
        double budget = pricing.nextDouble();

        if (decision == 1 && budget >= 50) {
            System.out.println("We recommend you an international vacation in Greece!");
        } else if (decision == 1 && budget < 50) {
            System.out.println("We recommend you to take a vacation in Bulgaria!");
        } else if (decision == 2 && budget >= 30) {
            System.out.println("We recommend you an international vacation in Switzerland!");
        } else if (decision == 2 && budget < 30) {
            System.out.println("We recommend you to take a vacation in the mountains of Bulgaria!");
        }
    }

    public static void sixthExercise() {

        //Enter year
        Scanner number1 = new Scanner(System.in);
        System.out.println("Please enter year: ");
        int year = number1.nextInt();

        if (year % 4 ==0 || year % 400 == 0) {
            System.out.println("The year you entered is leap!");
        }
        else {
            System.out.println("The year you entered is not leap!");
        }

    }
    public static void seventhExercise() {

        //Convert to which
        Scanner whichone = new Scanner(System.in);
        System.out.println("Please choose if you want to convert to 1-Celsius or 2-Fahrenheit");
        int celOrFah = whichone.nextInt();

        //Temp to convert
        Scanner tempNum = new Scanner(System.in);
        System.out.println("Please enter desired temperature: ");
        int temeprature = tempNum.nextInt();

        //Calculations
        double tempC = ((temeprature - 32) * 5/9);
        double tempF = (((temeprature * 9 / 5) +32));

        //Calculate if Fahrenheit
        if (celOrFah == 1) {
            System.out.println("Temperature in Celsius is: " + tempC);
        }
        else if (celOrFah == 2) {
            System.out.println("Temperature in Fahrenheit is: " + tempF);
        }
    }
}
