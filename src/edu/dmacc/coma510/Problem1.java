package edu.dmacc.coma510;

/* DPK - 10/12/2019 - changed numberOfPlateAppearances and calculatedBattingAverage variables from int to double data type */

public class Problem1 {
    public static void main(String[] args) {
        double numberOfPlateAppearances = 100;
        int numberOfWalks = 4;
        int numberOfHits = 24;

        double calculatedBattingAverage = numberOfHits / (numberOfPlateAppearances - numberOfWalks);

        System.out.println(calculatedBattingAverage); // 0.25
    }
}
