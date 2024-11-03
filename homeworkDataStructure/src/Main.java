public class Main {

    public static void main(String[] args) {
        exerciseTwo();
    }

    public static void exerciseOne() {
        int[] array = {10, 20, 30, 40};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }

    public static void exerciseTwo() {
        int[][] matrix = {
                {10, 20, 30, 40, 50},
                {11, 22, 33, 44, 55},
                {12, 12, 12, 12, 12},
        };

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.println(matrix[row][col] + " ");
            }
        }
        public static void exerciseThree() {


        }

    }
}