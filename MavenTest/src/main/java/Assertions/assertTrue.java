package org.example;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class assertTrue {


        @Test
        public void asserEquals1() {

            double sideA = 50.0;
            double sideB = 0.5;

            double result = sideA + sideB;

            assertEquals(50.5, result, "That is definitely not equal");
        }


        @Test
        public void asserEuals2(){

            int sideQ = 10;
            int sideJ = 10;

            assertEquals(sideQ, sideJ);
        }
        @Test
        public void asserEqualsSpendAllTheMoney(){

            double itemN1 = 22.40;
            double itemN2 = 33.60;
            double cardBalance = 56.00;

            double totalProducts = itemN1 + itemN2;

            assertEquals(cardBalance, totalProducts, "You have unspent money, challange failed");

        }
        @Test
        public void assertString(){
            String wordOfTheDay = "Love";
            String disasterOfTheDay = "Love";

            assertEquals(wordOfTheDay, disasterOfTheDay);

        }
        @Test
        public void asserStringSum(){
            String fivePlus = "5+";
            String five = "5+";

            assertEquals(five,fivePlus);
        }

    }

