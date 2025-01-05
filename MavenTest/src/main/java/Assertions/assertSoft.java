package Assertions;

import org.testng.annotations.Test;

public class assertSoft {

        @Test
    public void softAssertion1(){
            int sideA = 10;
            int sideB = 11;
            int sideC = 21;

            int abcSum = sideA + sideB +sideC;
            int aXb = sideA * sideB;
            int sumAB = sideA + sideB;

            boolean fail1 = sideA > sideB;
            boolean fail2 = aXb < abcSum;
            boolean true1 = sumAB == sideC;




        }
}
