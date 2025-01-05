package Assertions;


import org.testng.annotations.Test;

public class assertFalse {

        @Test
    public void asserFalseBool(){

        int sideA = 52;
        int sideB = 51;

            //condition
        boolean sum = sideA < sideB;

    //assertFalse(sum, "Bro... test is suppose to fail, don't you get it!");

    }
        @Test
    public void asserfalseBool2(){

        double sideQ = 20.20;
        double sideM = 13.44;
        double sideF = 11.11;

            //condition
        boolean numbersQQ = sideQ > sideM && sideM < sideF;

        //assertFalse(numbersQQ, "One of the statements is correct! That means you are wrong!");
    }
        @Test
    public void assertLogicOutOfThisWorld(){

            double sideR = 3.14;
            double sideT = 14.3;
            double sideL = 0.14;
            double sideK = 0.69;

            //condition
        boolean omegaLoL = sideR < sideK && sideR > sideT || sideK == sideL;

        //assertFalse(omegaLoL, "You were suppose to join the dark side!");

        }
        @Test
    public void assertEnough(){
            String firstName = "Stefan";
            String secondName = "Stoyanov";
            String nickName = "Chefo";

                //condition
            boolean whatIsHisNameTho = firstName == secondName || secondName == nickName
                    || nickName == firstName;
          //  assertFalse(whatIsHisNameTho, "Did you change something?");
        }
        @Test
    public void assertLaseOne(){

                //condition
            boolean wtf = false;
            //assertEquals(wtf, false, "not correct!");


        }

}
