import java.util.Scanner;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        countWords("do you want to come with me");
    }

    public static String cookMeal() {
        Scanner mProtein = new Scanner(System.in);
        System.out.println("Please insert main protein: ");
        String mainProtein = mProtein.nextLine();
        System.out.println("Main protein will be: " + mainProtein);
        return mainProtein;
    }

    public static void mealPrep() {
        String prepMeal = cookMeal();
        System.out.println("This is the selected protein: " + prepMeal);
    }

    //homework
    public static int findTheSmallest(int a, int b, int c) {
        int smallest = a;
        if (b < a) {
            smallest = b;
        }
        if (c < a) {
            smallest = c;
        }
        return smallest;
    }

    public static int findAverage(int a, int b, int c) {
        int average = (a + b + c) / 3;
        return average;
    }
    public static void findMiddle(String word) {
        int position;
        int length;

        if (word.length() % 2 == 0) {
            position = word.length() /2 -1;
            length = 2;

        } else {
            position = word.length() / 2;
            length = 1;
        }

        System.out.println(word.substring(position, position + length));
    }
    public static void countWords(String words){
    words = words.trim();
    int count = 0;
    int wordsLength = words.length();

    if (wordsLength > 1) {
        count++;
        for (int i = 1; i < wordsLength; i++) {
            if (words.charAt(i) == ' ') ;
            count++;
        }
        System.out.println(count);

    }
}
