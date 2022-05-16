package ru.netology.stats;

public class StatsService {

    public long sum(int[] sales) {

        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }

        return sum;

    }

    public int average(int[] sales) {
        int average = 0;
        for (int sale : sales) {
            average += sale;

        }
        return average / 12;

    }

    public int maxi(int[] sales) {
        int maxi = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxi]) {
                maxi = i;
            }
        }
        return maxi + 1;
    }

    public int mini(int[] sales) {
        int mini = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[mini]) {
                mini = i;
            }
        }
        return mini + 1;

    }

    public int miniNumbers(int[] sales) {
        int average = 0;
        for (int sale : sales) {
            average += sale;
        }
        int averageSale = average / 12;

        int number = 0;
        for (int sale : sales) {

            if (sale < averageSale) {
                number++;
            }
        }
        return number;
    }

    public int maxiNumbers(int[] sales) {
        int average = 0;
        for (int sale : sales) {
            average += sale;
        }
        int averageSale = average / 12;

        int number = 0;
        for (int sale : sales) {

            if (sale > averageSale) {
                number++;
            }
        }
        return number;
    }
}


//public int NumberOfMonthsAboveAverage(int[] sales) {    }

