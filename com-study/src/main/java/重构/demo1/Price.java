package 重构.demo1;

/**
 * 实例Price
 *
 * @author Zhanglele
 * @version 1.0
 * @since 2018-08-10 08:07:02
 */
abstract class Price {

    abstract int getPriceCode();

    abstract double getChange(int daysRented);

    int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
