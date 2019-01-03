package 范型;

import java.awt.*;
import java.util.Collection;

/**
 * @author faker
 * @date 2018/7/19
 */
public class Area {
    public static void main(String[] args) {

    }

    public static double totalArea(Collection<? extends Shape> arr) {
        double total = 0;
        for (Shape s : arr) {
            if (s != null) {
//                total += s.area();
            }
        }
        return total;
    }

}
