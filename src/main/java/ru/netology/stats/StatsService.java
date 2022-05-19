package ru.netology.stats;

public class StatsService {

    public int sum(int[] sales) {

        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int average(int[] sales) {

        int sum = sum(sales);
        return sum / sales.length;
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

        int average = average(sales);

        int number = 0;
        for (int sale : sales) {
            if (sale < average) {
                number++;
            }
        }
        return number;
    }

    public int maxiNumbers(int[] sales) {

        int average = average(sales);

        int number = 0;
        for (int sale : sales) {
            if (sale > average) {
                number++;
            }
        }
        return number;
    }
}




