package 重构.demo1;

/**
 * 实例Rental
 *
 * @author Zhanglele
 * @version 1.0
 * @since 2018-08-09 23:01:40
 */
public class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie _movie, int _daysRented) {
        this._movie = _movie;
        this._daysRented = _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public void setMovie(Movie _movie) {
        this._movie = _movie;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public void setDaysRented(int _daysRented) {
        this._daysRented = _daysRented;
    }

    double getChange() {
        return _movie.getChange(_daysRented);
    }

    int getFrequentRenterPoints() {
        return _movie.getFrequentRenterPoints(_daysRented);
    }
}
