package lv.sdacademy.lesson1;


public class DailyLifeAlgorithm {

    public static void main(String[] args) {
        Weather weather = new Weather();

        weather.setDegrees(10);

        if (weather.getDegrees() < 11) {
            System.out.println("Wear something warmer...");
        } else if (weather.getDegrees() < 21) {
            System.out.println("It is ok");
        } else {
            System.out.println("Wear suncream and drink wine...");
        }
    }

}
