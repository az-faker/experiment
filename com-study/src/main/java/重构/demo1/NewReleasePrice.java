package 重构.demo1;

/**
 * 实例NewReleasePrice
 *
 * @author Zhanglele
 * @version 1.0
 * @since 2018-08-10 08:08:49
 */
public class NewReleasePrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    double getChange(int daysRented) {
        return daysRented * 3;
    }

    @Override
    int getFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}
