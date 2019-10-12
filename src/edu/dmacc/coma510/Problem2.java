package edu.dmacc.coma510;

/* DPK - 10/12/2019 - changed centimetersInInch and heightInCentimeters variables from int to double data type */

public class Problem2 {
    public static void main(String[] args) {
        int wholeFeetHeight = 5;
        int remainingInchesHeight = 9;
        double centimetersInInch = 2.54;
        int inchesInFoot = 12;

        int heightInInches = (wholeFeetHeight * inchesInFoot) + remainingInchesHeight;
        double heightInCentimeters = heightInInches * centimetersInInch;

        System.out.println(heightInCentimeters); //Expect 175.26
    }
}
