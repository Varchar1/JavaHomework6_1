package ru.netology.stats;

public class StatsService {

    public int SalesAmount(long sales[]) {
        int amount = 0;

        for (int i = 0; i < sales.length; i++) {
            amount += sales[i];
        }

        return amount;
    }

    public int MiddleSales(long sales[]) {
        int amount = SalesAmount(sales);
        int middle = amount / 12;

        return middle;
    }

    public int MaxMonth(long[] sales) {
        int max = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[max]) {
                max = i;
            }
        }

        return max + 1;
    }

    public int MinMonth(long[] sales) {
        int min = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[min]) {
                min = i;
            }
        }

        return min + 1;
    }

    public int LessThanMiddle(long[] sales) {
        int middle = MiddleSales(sales);
        int lessMonths = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < middle) {
                lessMonths++;
            }
        }

        return lessMonths;
    }

    public int MoreThanMiddle(long[] sales) {
        int middle = MiddleSales(sales);
        int MoreMonths = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > middle) {
                MoreMonths++;
            }
        }

        return MoreMonths;
    }

}
