package 范型;


/**
 * @author faker
 * @date 2018/7/18
 */
public class FindMaxDemo {
    public static Comparable findMax(Comparable[] arr) {

        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(arr[maxIndex]) > 0) {
                maxIndex = i;
            }
        }
        return arr[maxIndex];
    }

    public static void main(String[] args) {

    }
}
