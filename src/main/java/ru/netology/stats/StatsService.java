package ru.netology.stats;


public class StatsService {
    public long calculeteTotalSale(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;

        }
        return totalSale;

    }

    public long calculetAverageSale(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;

        }
        long averagSale = totalSale / 12;
        return averagSale;
    }

    public int calculetMonthMaximumSale(long[] sales) {
        int monthMaximum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaximum]) {
                monthMaximum = i;
            }
        }
        return monthMaximum + 1;
    }

    public int calculetMonthMinimumSale(long[] sales) {
        int monthMinimum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[monthMinimum]) {
                monthMinimum = i;
            }
        }
        return monthMinimum + 1;
    }

    public int calculetMonthBellowAvareg(long[] sales) {
        int counterBellowAvarege = 0;
        long avaregeSale = calculetAverageSale(sales);
        for (long sale : sales) {
            if (sale < avaregeSale) {
                counterBellowAvarege++;
            }
        }
        return counterBellowAvarege;
    }

    public int calculetMonthAboveAverage(long[] sales) {
        int counterAboveAverage = 0;
        long avaregeSale = calculetAverageSale(sales);
        for (long sale : sales) {
            if (sale < avaregeSale) {
                counterAboveAverage++;
            }
        }
        return counterAboveAverage;
    }


}
