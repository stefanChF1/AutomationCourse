import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        exercise7();

    }

    public static void exercise1() {

        int[] array1 = {10, 20, 30, 40, 50, 100};
        int largestNumber = array1[0];
        for (int i = 1; i < array1.length; i++) {
            if (array1[i] > largestNumber) largestNumber = array1[i];
        }
        System.out.println("The largest number is: " + largestNumber);
    }


    public static void exercise2() {
        int[] array = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
        for (int i = 1; i < array.length; i++) {
            if (array[i] > 150) {
                break;
            }
            if (array[i] % 5 == 0) {
                System.out.println("This number is divisible by 5: " + array[i]);
            }

        }
    }

    public static void exercise3() {

        //Compose the array
        int[] array = {10, 20, 30, 40, 50};
        //Condition
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

    public static void exercise4() {

        // is the same as exercise1.
    }

    public static void exercise5() {

        //Compose the array
        int[] array = {2, 3, 5, 6, 8, 9};

        //condition
        for (int i : array) {
//            Statement
            if (i % 3 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void exercise6() {

        int[] array = {10, 12, 22, 44, 50};
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        double average = (double) sum / array.length;
        System.out.println("The average number is: " + average);
    }

    public static void exercise7() {
        int userguess;

        int randomNum;

            randomNum = (int) (Math.random() * 101);

            do {
            Scanner guess = new Scanner(System.in);
            System.out.println("Enter a number between 1 and 100!");
            userguess = guess.nextInt();


            if (userguess > 100) {
                System.out.println("Not a valid number! ");

            } else if (userguess < randomNum) {
                System.out.println("Kinda low, try again!");
            } else if (userguess > randomNum) {
                System.out.println("Kinda high, try again!");
            } else {
                System.out.println("You guessed the lucky number!!!");
            }
        } while (userguess != randomNum);
    }

}

