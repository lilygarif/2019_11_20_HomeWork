package com.telrun;

public class Application {

    private static double MASHA_VEL = 1;
    private static double PETR_VEL = 0.8;
    private static double LAZY_VASYA_VEL = 0.5;
    private static double MOTIVATED_VASYA_VEL = 1;
    //amount
    private static int VASYA_MOTIVATION_POINT = 1370;


    public static void main(String[] args) {
        int totalCredits = 2100;
        int mashaPerMonthCredits = 50;

        double month = monthAmount(totalCredits, mashaPerMonthCredits);
        System.out.println(month);

    }

    public static double monthAmount(int totalCredits, int mashaPerMonthCredits) {
        double creditsPerMonthFirstPeriod = mashaPerMonthCredits * (MASHA_VEL + PETR_VEL + LAZY_VASYA_VEL);
        double creditsPerMonthSecondPeriod = mashaPerMonthCredits * (MASHA_VEL + PETR_VEL + MOTIVATED_VASYA_VEL);
        double monthAmountFirstPeriod = VASYA_MOTIVATION_POINT / creditsPerMonthFirstPeriod;
        double monthAmountSecondPeriod = (totalCredits - VASYA_MOTIVATION_POINT) / creditsPerMonthSecondPeriod;
        double totalMonths = monthAmountFirstPeriod + monthAmountSecondPeriod;

        return totalMonths;
    }
}
