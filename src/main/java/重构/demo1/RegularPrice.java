package 重构.demo1;

/**
 * 实例RegularPrice
 *
 * @author Zhanglele
 * @version 1.0
 * @since 2018-08-10 08:09:28
 */
public class RegularPrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.REGULAR;
    }

    @Override
    double getChange(int daysRented) {
        double result = 1.5;
        if (daysRented > 3) {
            result += (daysRented - 3) * 1.5;
        }
        return result;
    }
}
