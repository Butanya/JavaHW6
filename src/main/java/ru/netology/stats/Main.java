package ru.netology.stats;

public class Main {

    public static void main(String[] args) {

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int average = 0;
        for (int sale : sales) {
            average += sale;

        }

        int averageFinal = average / 12;
        System.out.println(averageFinal);
    }

}

