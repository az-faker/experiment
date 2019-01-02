package 排序算法;

/**
 * @author faker
 * @date 2018/6/28
 */
public class Test {

    public static void main(String[] args) {
        int[] arr = {2,1,3,7,6,4,5};
        sort(arr);
        for (int i : arr) {
            System.out.print(i + "  ");
        }
    }


    private static void sort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
