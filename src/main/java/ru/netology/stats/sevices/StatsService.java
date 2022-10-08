package ru.netology.stats.sevices;

public class StatsService {
    public long sum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long average(long[] sales) {
        return sum(sales) / 12;
    }

    public int maxMonth(long[] sales) {
        int maxMonth = 0;
        long month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = (int) month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowAverage(long[] sales) {
        long avg = average(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < avg) {
                count++;
            }
        }
        return count;
    }

    public int aboveAverage(long[] sales) {
        long avg = average(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > avg) {
                count++;
            }
        }
        return count;
    }
}

