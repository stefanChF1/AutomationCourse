package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class assertNot {

    @Test
    public void assertNot() {
        int a = 5;
        int b = 11;

       // assertFalse(a, b, "Number should not be equals");
    }

    @Test
    public void assertNot2() {
        String name = "Petrohan";
        String name2 = "Ivanovhan";

        assertNotEquals(name, name2, "Bro wtf...");
    }

    @Test
    public void assertNot3() {
        int q = 10;
        int w = 11;
        int e = 22;

        int qw = q + w;

        assertNotEquals(e, qw, "Maaan, correct this asap!");
    }

    @Test
    public void assertNot4() {
        String bro1 = "Ihtiman";
        int bro1Age = 10;

        assertNotEquals(bro1, bro1Age, "Congratulations you compared int to String");
    }

    @Test
    public void assertNotNull() {
        //Integer a = null;
        int a = 0;
       //assertNotNull(a);
    }

        @Test
        public void verifyContractPriceMatchesActualPayment(){
            int contractPrice = provideTotalContractPrice(4, 5);
            int actualPayment = 10;

            boolean isClientHappy = contractPrice <= actualPayment;
            //assertNotEquals(actualPayment, contractPrice );
            //assertEquals(contractPrice,actualPayment);
            Assert.assertFalse(isClientHappy, "Not happy!");
        }

    public int provideTotalContractPrice(int constructionWork1, int constructionWork2) {
    int totalSum =constructionWork1 + constructionWork2;
        return totalSum;
    }


}


