package 重构.demo1;

/**
 * 实例ChildrensPrice
 *
 * @author Zhanglele
 * @version 1.0
 * @since 2018-08-10 08:08:13
 */
public class ChildrensPrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.CHILDRENS;
    }

    @Override
    double getChange(int daysRented) {
        return 0;
    }
}
