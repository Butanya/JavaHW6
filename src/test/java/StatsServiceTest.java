import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void shouldSumSales() {
        StatsService service = new StatsService();

        long actual = service.sum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAverage() {
        StatsService service = new StatsService();

        long actual = service.average(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / sales.length;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldFindMaxSalesMonth() {
        StatsService service = new StatsService();

        int actual = service.maxi(sales);
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMinSalesMonth() {
        StatsService service = new StatsService();

        int actual = service.mini(sales);
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindNumberOfMonthsWitSalesBelowAverage() {
        StatsService service = new StatsService();

        int actual = service.miniNumbers(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindNumberOfMonthsWitSalesAboveAverage() {
        StatsService service = new StatsService();

        int actual = service.maxiNumbers(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }
}
