import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product.allProducts();
    }

    public static class Car {
        String manufacturer;
        String model;
        int yearBuild;
        int price;

        //constructor
        public Car(String manufacturer, String model, int yearBuild, int price) {
            this.manufacturer = manufacturer;
            this.model = model;
            this.yearBuild = yearBuild;
            this.price = price;
        }

        public static void makeCars() {
            Car car1 = new Car("BMW", "5series", 2020, 35000);
            Car car2 = new Car("Audi", "A6", 2019, 30000);
            Car car3 = new Car("Mercedes", "ML", 2000, 10000);
            System.out.println("Car 1: ");
            car1.displayDetails();
            System.out.println("\nCar 2: ");
            car2.displayDetails();
            System.out.println("\nCar 3: ");
            car3.displayDetails();
        }

        public void displayDetails() {
            System.out.println("Make: " + this.manufacturer);
            System.out.println("Model: " + this.model);
            System.out.println("Year build: " + this.yearBuild);
            System.out.println("Price in euro: " + this.price);
        }
    }

    public static class Movie {
        String movieTitle;
        String movieGenre;
        double movieRating;

        //constructor
        public Movie(String movieTitle, String movieGenre, double movieRating) {
            this.movieTitle = movieTitle;
            this.movieGenre = movieGenre;
            this.movieRating = movieRating;
        }

        public static void allMovies() {
            Movie movie1 = new Movie("Green book", "Drama", 9.8);
            Movie movie2 = new Movie("Batman begins", "Action & Drama", 9.9);
            Movie movie3 = new Movie("Warrior", "Inspiring", 7.7);
            Movie movie4 = new Movie("Pilot", "Drama", 10);

            System.out.println("Movie1: ");
            movie1.displayMovieDetails();
            System.out.println("\nMovie2: ");
            movie2.displayMovieDetails();
            System.out.println("\nMovie3: ");
            movie3.displayMovieDetails();
        }

        public void displayMovieDetails() {
            System.out.println("Title: " + this.movieTitle);
            System.out.println("Genre: " + this.movieGenre);
            System.out.println("Rating: " + this.movieRating);
        }
    }

    public static class Student {
        String studentName;
        ArrayList<Double> grades;

        public double calculateAverage() {
            double sum = 0;
            for (double grade : grades) {
                sum += grade;
            }
            return sum / grades.size();
        }

        public Student(String studentName, ArrayList<Double> grades) {
            this.studentName = studentName;
            this.grades = grades;
        }

        public static void studentsPrint() {


            ArrayList<Double> grades1 = new ArrayList<>();
            grades1.add(5.5);
            grades1.add(5.0);
            grades1.add(3.5);

            ArrayList<Double> grades2 = new ArrayList<>();
            grades2.add(6.0);
            grades2.add(5.5);
            grades2.add(5.0);


            Student student1 = new Student("Stefan", grades1);
            Student student2 = new Student("Ganeta", grades2);

            System.out.println("Average grades for " + student1.studentName + ":" + student1.calculateAverage());
            System.out.println("Average grades for " + student2.studentName + ":" + student2.calculateAverage());
        }
    }

    public static class Product {
        private String productName;
        private int productPrice;
        private String productCategory;
        private int productQuantity;
        private Boolean productOnSale;


        //constructor
        public Product(String productName, int productPrice, String productCategory, int productQuantity, boolean productOnSale) {
            this.productName = productName;
            this.productPrice = productPrice;
            this.productCategory = productCategory;
            this.productQuantity = productQuantity;
            this.productOnSale = productOnSale;

            if (productPrice >= 100 && productOnSale == true) {
                this.productPrice = (int) (productPrice * 0.9);
            }
        }

        public static void allProducts() {
            Product product1 = new Product("Milk", 100, "dairy", 10, true);
            Product product2 = new Product("Eggs", 5, "protein", 10000, false);
            Product product3 = new Product("Salami", 150, "meat", 2, true);

            System.out.println("Prodcut 1: ");
            product1.productDetails();
            System.out.println("\nProduct 2: ");
            product2.productDetails();
            System.out.println("\nProduct 3: ");
            product3.productDetails();
        }

        private void productDetails() {
            System.out.println("Product name: " + this.productName);
            System.out.println("Product price: " + this.productPrice);
            System.out.println("Product category: " + this.productCategory);
            System.out.println("Product quantity: " + this.productQuantity);
            System.out.println("Product on sale: " + this.productOnSale);
        }
    }
    
}







