public class MyinsertSort {
    public static void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int valueToSort = a[i];
            int j = i;
            while (j > 0 && a[j - 1] > valueToSort) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = valueToSort;
        }
    }


    public static void main(String[] args) {
        int[] a = new int[]{6, 8, 1, 2, 4, 5, 7, 3};  //defining the array "a"
        ArrayUtils.show(a);  // calling "show" method from ArrayUtils class
        sort(a);
        ArrayUtils.show(a);
    }
}





